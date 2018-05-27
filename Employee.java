package CMISProject1;
/*
 * FileName: Employee.java
 * Author: Yael Brown-Evans
 * Date: May 16, 2018
 * Discription: This program computes the salaries
 * for a collection of employees of different types
 * Consists of four classes; Employee, Salesman, Executive and Main
 */


public class Employee 
{
	String name;
    int monthlySalary;
    int commission; // used for Saleman
    int currentStockPrice; // used for Executive

    public Employee(String name, int monthlySalary) {
      this.name = name;
      this.monthlySalary = monthlySalary;
    }

    // method calculates annual salary
    public int annualSalary() {
      return monthlySalary * 12;
    }

    // method returns string containing name and monthly salary
    public String toString() {
      return "Name: " + name + ". Monthly Salary: $" + monthlySalary;
    }
    
    public int getMonthlySalary() {
    	return this.monthlySalary;
    }
} // end Employee
