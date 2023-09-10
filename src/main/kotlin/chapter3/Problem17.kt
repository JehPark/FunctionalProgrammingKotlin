package chapter3

fun <A, B> map(xs: List<A>, f: (A) -> B): List<B> =
    List.foldRight(xs, List.empty()) { x, y ->
        Cons(f(x), y)
    }