package com.knoldus.validator

import com.knoldus.models.Employee
import com.knoldus.db.CompanyReadDto

class EmployeeValidator(companyName: CompanyReadDto, validateEmail: EmailValidator) {

  def employeeIsValid(employee: Employee): Boolean = {

    if (companyName.getCompanyByName(employee.companyName).isDefined && validateEmail.emailIdIsValid(employee.emailId))
      true
    else
      false
  }
}