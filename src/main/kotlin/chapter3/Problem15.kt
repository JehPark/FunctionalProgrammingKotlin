package chapter3

fun plusOne(xs: List<Int>): List<Int> =
    when (xs) {
        is Nil -> Nil
        is Cons -> Cons(xs.head + 1, plusOne(xs.tail))
    }

fun increment(xs: List<Int>): List<Int> =
    List.foldRight(
        xs,
        List.empty()
    ) { x, y -> Cons(x + 1, increment(y))}

fun main() {
    val l = Cons(1, Cons(2, Cons(3, Nil)))
    plusOne(l).print()
}