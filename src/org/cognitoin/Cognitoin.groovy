// src\org\cognitoin\Cognitoin.groovy
package org.cognitoin;

class Cognitoin implements Serializable {

    def steps
    Cognitoin(steps) {this.steps = steps}

    def helloWorld(){
        steps.echo "HelLoWorLd@!####"
    }

}