package chapter3

fun <A> List<A>.setHead(x: A): List<A> =
    when (this) {
        is Nil -> throw IllegalStateException("error")
        is Cons -> Cons(x, this.tail)
    }
