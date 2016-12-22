import org.scalatest.FunSuite

class Lab2Spec extends FunSuite{

  test("Expect to return Some(1)") {
    val result = Lab2.headOption(List(1, 2, 3, 4))
    assert(result == Some(1))
  }

  test("Expect to return None") {
    val result1 = Lab2.headOption(List())
    assert(result1 == None)
    val result2 = Lab2.tailOption(List())
    assert(result2 == None)
  }

  test("Expect to return Some(2)") {
    val result = Lab2.headOption(List(2))
    assert(result == Some(2))
  }

  test("Expect to return Some(List(2, 3, 4))") {
    val result = Lab2.tailOption(List(1, 2, 3, 4))
    assert(result == Some(List(2, 3, 4)))
  }

}
