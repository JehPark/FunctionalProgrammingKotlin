package chapter4

fun <A, B, C> map2(a: Option<A>, b: Option<B>, f: (A, B) -> C): Option<C> =
    when(a) {
        is None -> None
        is Some -> when (b) {
            is None -> None
            is Some -> Some(f(a.get, b.get))
        }
    }

fun <A, B, C> map22(oa: Option<A>, ob: Option<B>, f: (A, B) -> C): Option<C> =
    oa.flatMap { a ->
        ob.map { b ->
            f(a, b)
        }
    }