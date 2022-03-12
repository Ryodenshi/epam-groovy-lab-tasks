package groovylab

import groovy.json.JsonSlurper 
import groovy.json.JsonOutput 

class Task08 {
    public static String parseAndFilterJson(String input) {
    def jsonSlurper = new JsonSlurper()
    def object = jsonSlurper.parseText(input)
    return JsonOutput.toJson(object.findAll { Integer.toString(it.value).collect { Integer.parseInt(it) }.sum() == 9 })
   }
}
    