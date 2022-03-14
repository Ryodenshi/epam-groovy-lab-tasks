package groovylab

class Task06 {
    public static Map adults(Map people) {
        return people.findAll {it.value > 17}
    }
}