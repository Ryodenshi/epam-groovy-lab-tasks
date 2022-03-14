package groovylab

class Task09 {
    public static String exec(String command) {
         return command.execute().text.trim()
    }
}
