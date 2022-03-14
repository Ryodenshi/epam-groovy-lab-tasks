package groovylab

class Task03 {
    public static boolean isSublist(List a, List b) {
        b.every { a.contains(it) }
    }
}