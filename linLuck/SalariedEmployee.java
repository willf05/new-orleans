package lInLuck;

public class SalariedEmployee extends Employee {
  // TODO fix class declaration and declare variables here -- DONE
  String socialSecurityNumber;
  double fixedMonthlyPayment;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    // TODO fill in code here -- DONE
    this.employeeId = employeeId;
    this.name = name;
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    // TODO fill in code here and replace the return statement -- DONE
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    // TODO fill in code here -- DONE
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    // TODO fill in code here and replace the return statement -- DONE
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    // TODO fill in code here -- DONE
    this.fixedMonthlyPayment = fixedMonthlyPayment;
    avgMonthlySalary = fixedMonthlyPayment;
  }

  // TODO fill in code here
  @Override
  public void calculatePay() {
//    this.avgMonthlySalary = avgMonthlySalary;
  }
}
