package chapter3

fun <A, B> fold(tree: Tree<A>, l: (A) -> B, b: (B, B) -> B): B =
    when (tree) {
        is Leaf -> l(tree.value)
        is Branch -> b(fold(tree.left, l, b), fold(tree.right, l, b))
    }

fun <A> sizeF(ta: Tree<A>): Int =
    fold(
        ta,
        {1}
    ) { left, right -> 1 + left + right }

fun maximumF(ta: Tree<Int>): Int =
    fold(
        ta,
        { it }
    ) { l, r ->
        maxOf(l, r)
    }

fun <A> depthF(ta: Tree<A>): Int =
    fold(
        ta,
        { 0 }
    ) { l, r ->
        1 + maxOf(l, r)
    }

fun <A, B> mapF(ta: Tree<A>, f: (A) -> B): Tree<B> =
    fold(
        ta,
        {
            Leaf(f(it))
        }
    ) { l: Tree<B>, r: Tree<B> -> Branch(l, r) }
