def call(body) {
    def pipelineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    def jenkins_agent = pipelineParams.jenkins_agent ?: "all"
  
    
    pipeline {
        node {
            stages {
                stage('HelloWorld') {
                    steps {
                        script{
                            echo 'Hello World'
                        }
                    }
                }
            }
        }
    }
}
