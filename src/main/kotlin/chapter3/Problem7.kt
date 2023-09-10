package chapter3

/**
 * foldRight(
 *      Cons(1, Cons(2, Cons(3, Nil))),
 *      Nil as List<Int>,
 *      { x, y -> Cons(x, y) }
 *  )
 *
 *  Cons(1, foldRight(Cons(2, Cons(3, Nil)), Nil as List<Int>, { x, y -> Cons(x, y) })
 *  Cons(1, Cons(2, foldRight(Cons(3, Nil)), Nil as List<Int>, { x, y -> Cons(x, y) })
 *  Cons(1, Cons(2, Cons(3, foldRight(Nil, Nil as List<Int>, { x, y -> Cons(x, y) })
 *  Cons(1, Cons(2, Cons(3, Nil)))
 *
 *  직접 해보니 그대로 나오는게 맞다.
 */