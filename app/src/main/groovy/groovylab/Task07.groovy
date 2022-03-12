package groovylab

class seventhT {
    public static String encryptThis(String s) {
      return (s.split().collect{ word -> (int) word[0] + word[-1..1]}.join(" "))
    }
}