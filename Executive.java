package CMISProject1;
/*
 * FileName: Salesman.java
 * Author: Yael Brown-Evans
 * Date: May 16, 2018
 * Discription: This program computes the salaries
 * for a collection of employees of different types
 * Consists of four classes; Employee, Salesman, Executive and Main
 */

class Executive extends Employee 
{
    // subclass of Employee
    private int currentStockPrice;

    // Executive constructor   
    public Executive(String name, int monthlySalary, int commissionOrStock) {
      super(name, monthlySalary);
      this.currentStockPrice = commissionOrStock;
    }

	// Calculates salesmans' annual salaries
    public int annualSalary() {
      int bonus = 30000;
      int execSalary = monthlySalary * 12;

      if (currentStockPrice > 50) {
        execSalary += bonus;
      }
      return execSalary;
    }

    // Prints Executive information to screen.
    public String toString() {
      return (String) "Name: " + name + ", Monthly Salary: $" + monthlySalary + ", Stock Price: $" + currentStockPrice;
    }

} // end Executive