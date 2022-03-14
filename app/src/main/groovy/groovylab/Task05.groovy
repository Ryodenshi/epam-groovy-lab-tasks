package groovylab

class Task05 {
    public static boolean isIp(String ip) {
         ((ip==~ /((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)/)?true:false)

    }
}