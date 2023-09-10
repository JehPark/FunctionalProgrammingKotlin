package chapter3

fun sum(xs: List<Int>): Int =
    foldLeft(xs, 0) { acc, x -> acc + x }

fun product(xs: List<Double>): Double =
    foldLeft(xs, 1.0) { acc, x -> acc * x }

fun <A> length(xs: List<A>): Int =
    foldLeft(xs, 0) {acc, _ -> acc + 1}