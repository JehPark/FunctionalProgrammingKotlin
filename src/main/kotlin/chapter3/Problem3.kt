package chapter3

tailrec fun <A> List<A>.drop(n: Int): List<A> =
    when (this) {
        is Nil -> this
        is Cons -> if (n > 0) this.tail.drop(n - 1) else this
    }

tailrec fun <A> List<A>.drop2(n: Int): List<A> =
    if (n == 0) {
        this
    } else {
        when (this) {
            is Nil -> throw IllegalStateException("error")
            is Cons -> this.drop2(n - 1)
        }
    }