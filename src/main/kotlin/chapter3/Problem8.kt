package chapter3

fun <A> List<A>.length(): Int =
    List.foldRight(this, 0) { _, y -> 1 + y }

fun main() {
    val len = Cons(1, Cons(2, Cons(3, Nil))).length()
    println(len)
}
