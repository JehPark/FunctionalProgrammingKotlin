package chapter3

fun <A> filterByFlatMap(xs: List<A>, f: (A) -> Boolean): List<A> =
    flatMap(
        xs
    ) {a ->
        if (f(a)) Cons(a, Nil) else List.empty()
    }