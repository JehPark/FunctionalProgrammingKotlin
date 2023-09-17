package chapter4

sealed class Either<out E, out A>

data class Left<out E>(val value: E): Either<E, Nothing>()

data class Right<out A>(val value: A): Either<Nothing, A>()

fun <A> catches(a: () -> A): Either<Exception, A> =
    try {
        Right(a())
    } catch (e: Exception) {
        Left(e)
    }