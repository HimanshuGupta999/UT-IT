import EmailValidation.EmailValidation
import org.scalatest.funsuite.AnyFunSuite

class EmailValidationTest extends AnyFunSuite{
  var emailObject = new EmailValidation

  test("Without name of recipient"){
    assert(!emailObject.emailIsValid("@gmail.com"))
  }

  test("Without @ in the email"){
    assert(!emailObject.emailIsValid("himanshu.gupta.gmail.com"))
  }

  test("Without domain name"){
    assert(!emailObject.emailIsValid("himanshu.gupta@"))
  }

  test("Other domain name than .com| .net| .org "){
    assert(!emailObject.emailIsValid("himanshu.gupta@rediffmail.in"))
  }

  test("correct one uppercase"){
    assert(emailObject.emailIsValid("shivam.mehta@REDIFFMAIL.COM"))
  }

  test("Correct one lowercase"){
    assert(emailObject.emailIsValid("himanshu.gupta@rediffmail.com"))
  }

}

