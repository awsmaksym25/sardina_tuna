import org.cognitoin.Cognitoin


def call(body) {
    def pipelineParams = [:]
    def run_funv = Cognitoin.Test(this)
  
    
    pipeline {
        agent any
        stages {
            stage('HelloWorld') {
                steps {
                    run_funv.helloWorld
                }
            }
        }
    }
}
