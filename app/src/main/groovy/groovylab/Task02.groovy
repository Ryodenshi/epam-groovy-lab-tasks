package groovylab

class secondt {
    public static List mulEvenOdd(List l) {
        def isEven = { int x -> x % 2 == 0}
        l.eachWithIndex { it, index ->
        if (isEven(it)){
            l[index] *=2
        } else {
            l[index] *= 3
        }
        }
        return l
    }
}