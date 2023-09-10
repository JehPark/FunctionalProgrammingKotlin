package chapter3

fun plus(xs1: List<Int>, xs2: List<Int>): List<Int> =
    when (xs1) {
        is Nil -> Nil
        is Cons -> when (xs2) {
            is Nil -> Nil
            is Cons -> Cons(xs1.head + xs2.head, plus(xs1, xs2))
        }
    }