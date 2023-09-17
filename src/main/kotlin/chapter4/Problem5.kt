package chapter4

import chapter3.Nil
import chapter3.tail

fun <A, B> traverse(
    xa: chapter3.List<A>,
    f: (A) -> Option<B>
): Option<chapter3.List<B>> =
    when (xa) {
        is Nil -> Some(Nil)
        is chapter3.Cons ->
            map2(f(xa.head), traverse(xa.tail(), f)) { b, xb ->
                chapter3.Cons(b, xb)
            }
    }
