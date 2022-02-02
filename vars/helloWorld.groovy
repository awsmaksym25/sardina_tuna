import org.cognitoin.Cognitoin



def call(body) {
    def pipelineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()
    def test = Test(this)

    def jenkins_agent = pipelineParams.jenkins_agent ?: "all"
  
    
    pipeline {
        agent {
            label "${jenkins_agent}"
        }

        stages {
            stage("Test 1"){               
               steps {
                   cleanWs()
                   test.helloWorld
               }
            }
        }

    }
}
