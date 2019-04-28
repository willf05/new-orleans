package lInLuck;

public class ContractedEmployee extends Employee {
  // TODO fix class declaration and declare variables here -- DONE
  String federalTaxId;
  double hourlyRate;
  double numberOfHoursWorked;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    // TODO fill in code here -- DONE
    this.employeeId = employeeId;
    this.name = name;
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    // TODO fill in code here and replace the return statement -- DONE
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    // TODO fill in code here -- DONE
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    // TODO fill in code here and replace the return statement -- DONE
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    // TODO fill in code here -- DONE
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    // TODO fill in code here and replace the return statement -- DONE
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    // TODO fill in code here -- DONE
    this.numberOfHoursWorked = numberOfHoursWorked;
    avgMonthlySalary = hourlyRate * numberOfHoursWorked;
  }

  // TODO fill in code here
  @Override
  public void calculatePay() {
//    this.avgMonthlySalary = avgMonthlySalary;
  }
}
