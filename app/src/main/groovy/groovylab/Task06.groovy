package groovylab

class sixt {
    public static Map adults(Map people) {
        return people.findAll {it.value > 17}
    }
}