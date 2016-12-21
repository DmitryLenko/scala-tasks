import org.scalatest.FunSuite

class Lab2Spec extends FunSuite{

  test("Expect to return Some(1)") {
    val result = Lab2.headOption(List(1, 2, 3, 4))
    assert(result == Some(1))
  }

  test("Expect to return None") {
    val result = Lab2.headOption(List())
    assert(result == None)
  }

  test("Expect to return Some(2)") {
    val result = Lab2.headOption(List(2))
    assert(result == Some(2))
  }

  test("Expect to return List(2, 3, 4)") {
    val result = Lab2.headOption(List(1, 2, 3, 4))
    assert(result == List(2, 3, 4))
  }

  test("Expect to return an empty list") {
    val result = Lab2.headOption(List())
    assert(result == List())
  }


}
