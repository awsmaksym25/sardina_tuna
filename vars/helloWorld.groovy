import org.cognitoin.Cognitoin


def call(body) {
    def pipelineParams = [:]
    def run_funv = new Cognitoin(this)
    
    node{
        run_funv.helloWorld()
    }
}
