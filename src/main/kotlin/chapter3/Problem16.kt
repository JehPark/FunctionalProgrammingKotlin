package chapter3

fun toString(xs: List<Double>): List<String> =
    List.foldRight(xs, List.empty()) { x, y -> Cons(x.toString(), y) }