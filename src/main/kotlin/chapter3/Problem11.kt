package chapter3

fun <A> reverse(xs: List<A>): List<A> =
    List.foldLeft(xs, List.empty()) { x, y -> Cons(y, x) }
