package groovylab

class ten {
    public static String urlText(String url) {
    def get = new URL(url).openConnection()
    def getRC = get.getResponseCode()
    return get.getInputStream().getText()
    }
}