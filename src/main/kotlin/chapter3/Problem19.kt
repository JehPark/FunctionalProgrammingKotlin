package chapter3

fun <A, B> flatMap(xs: List<A>, f: (A) -> List<B>): List<B> =
    List.foldRight(
        xs,
        List.empty()
    ) { x, y -> appendR(f(x), y) }


fun main() {
    val xs = flatMap(Cons(1, Cons(2, Cons(3, Nil)))) {i ->
        Cons(i, Cons(i, Nil))
    }
    xs.print()
}
