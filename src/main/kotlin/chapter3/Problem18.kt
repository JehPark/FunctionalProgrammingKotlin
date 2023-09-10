package chapter3

fun <A> filter(xs: List<A>, f: (A) -> Boolean): List<A> =
    List.foldRight(
        xs,
        List.empty()
    ) { x, y ->
        if (f(x)) Cons(x, y)
        else y
    }

fun main() {
    val xs = Cons(1, Cons(2, Cons(3, Cons(4, Cons(5, Cons(6, Nil))))))
    val xs2 = filter(xs) { it % 2 == 0 }
    xs2.print()
}