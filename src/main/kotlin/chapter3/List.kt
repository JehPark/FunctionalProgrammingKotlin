package chapter3

sealed class List<out A> {
    companion object {
        fun sum(aa: List<Int>): Int =
            when (aa) {
                is Nil -> 0
                is Cons -> aa.head + sum(aa.tail)
            }

        fun product(aa: List<Double>): Double =
            when (aa) {
                is Nil -> 1.0
                is Cons -> aa.head * product(aa.tail)
            }

        fun <A,B> foldRight(l: List<A>, z: B, f: (A, B) -> B): B =
            when (l) {
                is Nil -> z
                is Cons -> f(l.head, foldRight(l.tail, z, f))
            }

        tailrec fun <A, B> foldLeft(xs: List<A>, z: B, f: (B, A) -> B): B =
            when (xs) {
                is Nil -> z
                is Cons -> foldLeft(xs.tail(), f(z, xs.head), f)
            }

        fun <A> empty(): List<A> = Nil
    }
}

object Nil : List<Nothing>()

data class Cons<out A>(val head: A, val tail: List<A>) : List<A>()
