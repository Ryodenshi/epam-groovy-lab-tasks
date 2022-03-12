package groovylab

class third {
    public static boolean isSublist(List a, List b) {
        b.every { a.contains(it) }
    }
}