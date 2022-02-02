import org.cognitoin.Cognitoin
def test = Test(this)


def call(body) {
    def pipelineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    def jenkins_agent = pipelineParams.jenkins_agent ?: "all"
  
    
    pipeline {
        agent {
            label "${jenkins_agent}"
        }
        options {
            buildDiscarder(logRotator(numToKeepStr: '10'))
            disableConcurrentBuilds()
            skipStagesAfterUnstable()
            ansiColor('xterm')
            timestamps()
        }

        stages {
            stage("Test 1"){               
               steps {
                   cleanWs()
                   test.helloWorld()
               }
            }
        
        post {
            success {
            }
            unsuccessful {
            }
            always {
            }
        }
    }
}
