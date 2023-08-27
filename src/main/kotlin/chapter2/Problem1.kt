package chapter2

fun fib(n: Int): Int {
    tailrec fun go(n: Int, cur: Int, nxt: Int): Int =
        if (n == 0) cur
        else if (n < 0) throw IllegalArgumentException("n must be positive")
        else go(n - 1, nxt, cur + nxt)
    return go(n, 0, 1)
}

fun main() {
    println("${fib(8)}")
}