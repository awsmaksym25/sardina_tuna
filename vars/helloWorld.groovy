import org.cognitoin.Cognitoin


def call(body) {
    def pipelineParams = [:]
    def run_funv = new Cognitoin.Test(this)
  
    
    pipeline {
        agent any
        stages {
            stage('HelloWorld') {
                steps {
                    run_funv.helloWorld()
                }
            }
        }
    }
}
