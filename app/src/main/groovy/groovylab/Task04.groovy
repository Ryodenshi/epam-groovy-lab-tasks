package groovylab

class fourth{
    public static int fib(int n) {
        switch (n) {
        case 1..2: 1; break
        default: n = fib(n-1) + fib(n-2); break }
    }
}
