package chapter4

import chapter3.Cons
import chapter3.Nil

fun <A> sequence(
    xs: chapter3.List<Option<A>>
): Option<chapter3.List<A>> =
    xs.foldRight(
        Some(Nil)
    ) { oa1: Option<A>, oa2: Option<chapter3.List<A>> ->
        map2(oa1, oa2) { a1: A, a2: chapter3.List<A> ->
            Cons(a1, a2)
        }
    }

fun <A,B> chapter3.List<A>.foldRight(z: B, f: (A, B) -> B): B =
    when (this) {
        is Nil -> z
        is Cons -> f(this.head, this.foldRight(z, f))
    }
