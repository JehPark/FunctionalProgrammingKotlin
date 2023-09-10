package chapter3

fun <A> List<A>.dropWhile(f: (A) -> Boolean): List<A> =
    when (this) {
        is Nil -> throw IllegalStateException("error")
        is Cons -> if (f(head)) tail.dropWhile(f) else this
    }