package cmis242.prj1BrownevansY;

public class CMIS242PRJ1BrownevansY {
  public class Employee{
    // Constructor to create emp. sales, and exec. 

    // Declare variables
    public String name = null;
    public int monthlySalary = null;

    public static class annualSalary() {
      return this.monthlySalary * 12;
    }  

    public static class toString() {
      return System.out.println("Name: " + this.name + ". His annual salary is: $" + this.annualSalary());
    }
  }

  public class Salesman extends Employee{
    // Declare instance variable
    public String annualSales = null;

    public static class comission() {
      private int totComission = annualSales * .02;
      private String response = null;

      if (totComission > 20000)
        response = "Commission exceeds sales persons Max";
      else
        response = "Comission is " + totComission;

      return System.out.println(response);

  }

  public class Executive extends Employee{
    //
  }

  public static void main(String [] args) {
    //
  }
}
