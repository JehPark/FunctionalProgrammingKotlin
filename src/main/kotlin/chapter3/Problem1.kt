package chapter3

fun <A> List<A>.tail(): List<A> =
    when(this) {
        is Nil -> Nil
        is Cons -> this.tail
    }