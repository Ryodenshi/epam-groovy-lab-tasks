package groovylab

class Task10 {
    public static String urlText(String url) {
    def get = new URL(url).openConnection()
    def getRC = get.getResponseCode()
    return get.getInputStream().getText()
    }
}