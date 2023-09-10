package chapter3

fun <A> depth(tree: Tree<A>): Int =
    when (tree) {
        is Leaf -> 0
        is Branch -> maxOf(depth(tree.right), depth(tree.left)) + 1
    }