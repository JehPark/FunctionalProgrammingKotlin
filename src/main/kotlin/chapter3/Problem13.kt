package chapter3

fun <A> appendL(xs: List<A>, element: List<A>): List<A> =
    List.foldLeft(
        xs,
        element
    ) { x, y -> Cons(y, x) }

fun <A> appendR(xs: List<A>, element: List<A>): List<A> =
    List.foldRight(
        xs,
        element
    ) { x, y -> Cons(x, y) }
