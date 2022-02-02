import org.cognitoin.Cognitoin



def call(body) {
    def pipelineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    def jenkins_agent = pipelineParams.jenkins_agent ?: "all"
  
    
    pipeline {
        // agent {
        //     label "${jenkins_agent}"
        // }
        stages {
            stage('HelloWorld') {
                steps {
                    echo 'Hello World'
                }
            }
        }
    }
}
