package chapter3

fun <A> List<A>.init(): List<A> =
    when (this) {
        is Nil -> throw IllegalStateException("error")
        is Cons -> if (this.tail is Nil) Nil else Cons(this.head, this.tail.init())
    }

fun main() {
    val l = Cons(1, Cons(2, Cons(3, Cons(4, Nil))))
    val l2 = l.init()
    l2.print()
}

fun <A> List<A>.print(): List<A> =
    when (this) {
        is Nil -> Nil
        is Cons -> {
            println(this.head)
            this.tail.print()
        }
    }