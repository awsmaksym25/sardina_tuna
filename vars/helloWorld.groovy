def call(body) {
    def pipelineParams = [:]

  
    
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
