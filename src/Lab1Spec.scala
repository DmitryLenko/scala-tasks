import org.scalatest.FunSuite

class Lab1Spec extends FunSuite{

  test("Expect to return 11 with n = 5") {
    val result = Lab1.fib(5)
    assert(result == 11)
  }

  test("Expect to return 20 with n = 6") {
    val result = Lab1.fib2(6)
    assert(result == 20)
  }

  test("Expect to return 0") {
    val result = Lab1.fib(0)
    assert(result == 0)
  }

}
