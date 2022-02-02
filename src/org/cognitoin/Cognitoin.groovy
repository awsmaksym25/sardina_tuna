// src\org\cognitoin\Cognitoin.groovy
package org.cognitoin;
def steps

class Test implements Serializable {

    def steps
    Test(steps) {this.steps = steps}

    def helloWorld(){
        steps.sh "echo 'HelLoWorLd@!####'"
    }

}