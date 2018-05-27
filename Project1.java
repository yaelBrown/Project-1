package CMISProject1;
/*
 * FileName: CMIS242PRJ1BrownevansY.java
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