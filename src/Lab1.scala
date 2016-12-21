// На языке Scala написать функцию вычисления функции f в виде
// простой и хвостовой рекурсии, сравнить результаты:
// f(n) = n, если n < 3, и f(n)=f(n-1)+f(n-2)+f(n-3)

object Lab1 {
  /**
    * @param n pos in the tribinacci sequence
    * @return nth el of the tribinacci sequence
    */
  def fib(n: Int): Int = {
    if (n < 3) n
    else fib(n-1) + fib(n-2) + fib(n-3)
  }

  /**
    * @param n pos in the tribinacci sequence
    * @return nth el of the tribinacci sequence
    */
  def fib2(n: Int): Int = {

    def f(i: Int, a: Int, b: Int, c: Int): Int = {
      if (n < 3) n
      else if (i == n) a+b+c
      else f(i + 1, b, c, a+b+c)
    }
    f(3, 0, 1, 2)
  }

}
