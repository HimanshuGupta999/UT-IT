import Maths.Div_fib
import org.scalatest.funsuite.AnyFunSuite
class Div_fibTest extends AnyFunSuite {
  var Div_fib_Object = new Div_fib()

  //  ****** Divide Test ********

  test("Test to check divide of zero"){
    val num1 = 0
    val num2 = 2
    val res = 0
    assert(Div_fib_Object.divideOf(num1, num2)==res)
  }

  test("Test to check divide by zero"){
    assertThrows[ArithmeticException](Div_fib_Object.divideOf(132,0))
  }

  //  ****** Fibonacci Test *******

  test("Test to check fibonacci of zero"){
    val num = 0
    val res = 0
    assert(Div_fib_Object.fibonacciOf(num)==res)
  }
  test("To check fibonacci"){
    val num = 9
    val res = 34
    assert(Div_fib_Object.fibonacciOf(num)==res)
  }
}
