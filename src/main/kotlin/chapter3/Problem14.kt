package chapter3

fun <A> concat1(xxs: List<List<A>>): List<A> =
    List.foldRight(
        xxs,
        List.empty()
    )
        { xs1, xs2 ->
            List.foldRight(xs1, xs2) { x, y ->
                Cons(x, y)
            }
        }

fun <A> concat2(xxs: List<List<A>>): List<A> =
    List.foldRight(
        xxs,
        List.empty()
    ) {
        xs1, xs2 -> appendL(xs1, xs2)
    }
