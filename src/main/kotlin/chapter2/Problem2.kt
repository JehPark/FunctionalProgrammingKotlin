package chapter2

val <T> List<T>.tail: List<T> get() = drop(1)

val <T> List<T>.head: T get() = first()

fun <A> isSorted(aa: List<A>, ordered: (A, A) -> Boolean): Boolean {
    tailrec fun go(cur: A, aa: List<A>): Boolean =
        if (aa.isEmpty()) true
        else if (ordered(cur, aa.head).not()) false
        else go(aa.head, aa.tail)
    return aa.isEmpty() || go(aa.head, aa.tail)
}