// src\org\cognitoin\Cognitoin.groovy
package org.cognitoin;

class Test implements Serializable {

    def steps
    Test(steps) {this.steps = steps}

    def helloWorld(){
        steps.echo "HelLoWorLd@!####"
    }

}