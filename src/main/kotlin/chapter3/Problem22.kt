package chapter3

fun <A> zipWith(xa: List<A>, xb: List<A>, f: (A, A) -> A): List<A> =
    when (xa) {
        is Nil -> Nil
        is Cons -> when (xb) {
            is Nil -> Nil
            is Cons -> Cons(f(xa.head, xb.head), zipWith(xa.tail, xb.tail, f))
        }
    }