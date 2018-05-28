Package CMIS242PRJ1BrownevansY; 

/*
 * FileName: Employee.java
 * Author: Yael Brown-Evans
 * Date: May 16, 2018
 * Discription: This program computes the salaries
 * for a collection of employees of different types
 * Consists of four classes; Employee, Salesman, Executive and Main
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

public class Project1 
{
  public static void main(String[] args) throws IOException 
  {
    ArrayList<Employee> employeeArray2014 = new ArrayList<>(); // Array for year 2014
    ArrayList<Employee> employeeArray2015 = new ArrayList<>(); // Array for year 2015
    
    // Read the text file
    File file = new File("Employees.txt");
    Scanner input = new Scanner(file);
    
    //Read file and input employees into array
    try { 

      while (input.hasNext()) {
        int year = input.nextInt();

        // Checks year for 2014
        if (year == 2014) { 
          String type = input.next();
          String name = input.next() + " " + input.next();
          int monthlySalary = input.nextInt();
          int commissionOrStock = input.nextInt();
        
          // Checks for Salesman
          if (type.equals("Salesman")) {
            employeeArray2014.add(new Salesman(name, monthlySalary, commissionOrStock));
          }
          
          // Checks for Executive
          else if (type.equals("Executive")) {
            employeeArray2014.add(new Executive(name, monthlySalary, commissionOrStock));
          }
          
          // Everyone else is a Employee
          else {
            employeeArray2014.add(new Employee(name, monthlySalary));
          }
        } // end if
                
          
        //Checks year for 2015
        if (year == 2015) { 
          String type = input.next();
          String name = input.next() + " " + input.next();
          int monthlySalary = input.nextInt();
          int commissionOrStock = input.nextInt();
          
          // Checks for Salesman
          if (type.equals("Salesman")) {
            employeeArray2015.add(new Salesman(name, monthlySalary, commissionOrStock));
          }
          
          // Checks for Executive
          else if (type.equals("Executive")) {
            employeeArray2015.add(new Executive(name, monthlySalary, commissionOrStock));
          }
          
          // Everyone else is a Employee
          else {
            employeeArray2015.add(new Employee(name, monthlySalary));
          }
        } // end if
      } // end while
    } // end try
    
    // finally statement
    finally {
 
      // Close input
      input.close();
      
      // System.out.println("Finally statement ran");   // used for ts
      
    }  // end finally
    
    /*
     * Print output to screen
     */
    
    // Print 2014 output to screen.
    
    // Title for output
    System.out.println("\t2014 EMPLOYEES");
    System.out.println("----------------------");
    
    // For loop to print output
    for (int i=0; i < employeeArray2014.size(); i++) {
      System.out.println(employeeArray2014.get(i));
    }
    
    // Footer for output
    System.out.println("----------------------");
    
    // Line break
    System.out.println("\n");
    
    
    // Print 2015 output to screen.
    
    // Title for output
    System.out.println("\t2015 EMPLOYEES");
    System.out.println("----------------------");
    
    // For loop to print output
    for (int i=0; i < employeeArray2015.size(); i++) {
      System.out.println(employeeArray2015.get(i));
    }
    
    // Footer for output
    System.out.println("----------------------");
    
  } // end main
} // end Project1