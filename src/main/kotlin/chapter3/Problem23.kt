package chapter3

tailrec fun <A> startsWith(xs: List<A>, sub: List<A>): Boolean =
    when (xs) {
        is Nil -> sub == Nil
        is Cons -> when (sub) {
            is Nil -> true
            is Cons -> if (xs.head == sub.head) startsWith(xs.tail, sub.tail) else false
        }
    }

tailrec fun <A> hasSubsequence(xs: List<A>, sub: List<A>): Boolean =
    when (xs) {
        is Nil -> false
        is Cons -> if (startsWith(xs, sub)) {
            true
        } else {
            hasSubsequence(xs.tail, sub)
        }
    }