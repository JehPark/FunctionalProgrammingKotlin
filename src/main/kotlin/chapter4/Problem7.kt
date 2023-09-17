package chapter4

import chapter3.Nil
import chapter3.tail

fun <E, A, B> traverse2(
    xs: chapter3.List<A>,
    f: (A) -> Either<E, B>
): Either<E, chapter3.List<B>> =
    when (xs) {
        is Nil -> Right(Nil)
        is chapter3.Cons -> map23(f(xs.head), traverse2(xs.tail(), f)) { b, xb ->
            chapter3.Cons(b, xb)
        }
    }

fun <E, A> sequence(
    es: chapter3.List<Either<E, A>>
): Either<E, chapter3.List<A>> =
    traverse2(es) { it }
