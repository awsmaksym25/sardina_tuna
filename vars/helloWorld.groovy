def call(body) {
    def pipelineParams = [:]

  
    
    pipeline {
        agent any
        stages {
            stage('HelloWorld') {
                steps {
                    echo 'Hello World'
                }
            }
        }
    }
}
