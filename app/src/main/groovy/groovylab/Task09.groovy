package groovylab

class ni {
    public static String exec(String command) {
         return command.execute().text.trim()
    }
}
