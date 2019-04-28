package lInLuck;

public class Employee implements Payable {
  // TODO fix class declaration and declare variables here -- DONE
  String employeeId;
  String name;
  double avgMonthlySalary;

  public Employee() {}

  public Employee(String employeeId, String name) {
    // TODO fill in code here -- DONE
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    // TODO fill in code here and replace the return statement -- DONE
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    // TODO fill in code here -- DONE
    this.employeeId = employeeId;
  }

  public String getName() {
    // TODO fill in code here and replace the return statement -- DONE
    return name;
  }

  public void setName(String name) {
    // TODO fill in code here -- DONE
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    // TODO fill in code here and replace the return statement -- DONE
    return avgMonthlySalary;
  }

  @Override
  public String toString() {
    // TODO fill in code here and replace the return statement, be sure to format double value -- DONE
//    String format = "%.2f";
    return (String.format("Employee: %s, Name: %s, Avg Salary: %s", employeeId, name, String.format("%.2f", avgMonthlySalary)));
//    return("Employee: " + employeeId + ", Name: " + name + ", Avg Salary: " + String.format(format, avgMonthlySalary));
  }

  public void calculatePay() {
    this.avgMonthlySalary = avgMonthlySalary;
  }
}
