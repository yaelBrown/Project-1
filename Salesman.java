package CMISProject1;
/*
 * FileName: Salesman.java
 * Author: Yael Brown-Evans
 * Date: May 16, 2018
 * Discription: This program computes the salaries
 * for a collection of employees of different types
 * Consists of four classes; Employee, Salesman, Executive and Main
 */

class Salesman extends Employee 
{
    // subclass of Employee
    private int annualSales;

    // constructor for Salesman
    public Salesman(String name, int monthlySalary, int commissionOrStock) {
      super(name, monthlySalary);
      this.annualSales = commissionOrStock;
    }

    // calculates annual Salesman Salary
    public int annualSalary() {
      int commission;
      int annualSalesCalc;
      int annualSalaryFinal = 0;

      // Performs calculations
      annualSalesCalc = monthlySalary * 12;
      commission = (int) (annualSalesCalc * .02);

      // Add commission if commission is less than $20k
      if (commission < 20000) {
        annualSalaryFinal = annualSalesCalc + commission;
      } else {
        annualSalaryFinal = annualSalesCalc;
      }
      return annualSalaryFinal;
    }

    // toString method that prints Salesman information to screen.
    public String toString() {
      return (String) "Name: " + name + ", Monthly Salary: $" + monthlySalary + ", Annual Salary: $" + annualSales;
    }
    
  }    // end Salesman