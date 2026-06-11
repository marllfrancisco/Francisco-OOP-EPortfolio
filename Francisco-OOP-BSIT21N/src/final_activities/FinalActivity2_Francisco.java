// my personal package - finals
package final_activities;

// necessary imports
import java.util.Scanner;

// OUTER CLASS -------------------------------------------------------
class Employee_Francisco {
	// OUTER CLASS VARIABLES
	String employeeName_Francisco, position_Francisco, department_Francisco;
	double grossSalary_Francisco, hoursWorked_Francisco, ratePHour_Francisco;
	
	// CONSTRUCTOR (ACCEPTS ARGUMENTS) ------------------------------
	public Employee_Francisco(String name, String position, String department) {
		this.employeeName_Francisco = name;
		this.position_Francisco = position;
		this.department_Francisco = department;
	}
	
	// INNER CLASS ---------------------------------------------------
	class Salary_Francisco {
		Scanner scan = new Scanner(System.in);
		
		// INNER METHOD - ACCEPTS INPUTS AND COMPUTE SALARY ----------
		public void computeSalary_Francisco() {
			// User inputs data
			System.out.print("Input how many hours you worked : ");
			hoursWorked_Francisco = scan.nextDouble();
	
			System.out.print("Input the rate per hour         : ");
			ratePHour_Francisco = scan.nextDouble();
			
			// gross salary formula
			System.out.println("\nComputing payroll...");
			grossSalary_Francisco = hoursWorked_Francisco * ratePHour_Francisco;
			
			scan.close();
		}
		
		// INNER METHOD 2 - DETERMINE STATUS OF SALARY -----------------
		public String salaryStatus_Francisco() {
			String status = "";
			
			System.out.println("Determining status...");
			
			// CONDITION TO DETERMINE STATUS
			if (grossSalary_Francisco > 0) {
				if (grossSalary_Francisco < 15000) {
					status = "Low Salary";
				} else if (grossSalary_Francisco < 30000) {
					status = "Average Salary";
				} else {
					status = "High Salary";
				}
			}
			return status;
		}
	}
	
	// OUTER METHOD - DISPLAYS THE EMPLOYEE DETAILS -------------------
	public void employeeDetails_Francisco(String status) {
		System.out.println("\n\n\t        OOP Business Inc.");
		System.out.println("\t\t SALARY INVOICE");
		System.out.println("     ======================================\n");
		System.out.println("Employee Name      \t:   \t" + employeeName_Francisco);
		System.out.println("Employee Position  \t:   \t" + position_Francisco);
		System.out.println("Employee Department\t:   \t" + department_Francisco);
		System.out.println("\n     --------------------------------------\n");
		System.out.println("  Hours Worked\tRate per hour\tGross Salary");
		System.out.println("      "+hoursWorked_Francisco+"\t     "+ratePHour_Francisco+
				"\t   "+grossSalary_Francisco);
		System.out.println("\n     --------------------------------------\n");
		
		System.out.println("Salary Status      \t:   \t" +  status);
		System.out.println("\n     ======================================\n");
		System.out.println("\t Thank you for your business :]");
		
	}
}


public class FinalActivity2_Francisco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// INITIAL INTERFACE ----------------------------------------
		System.out.println("\tWelcome to Employee Manager App.");
		System.out.println("\t\t  Dev: Marl :> ");
		System.out.println("     ======================================");
		System.out.print("\nInput your name       : ");
		String name_Francisco = sc.nextLine();
		System.out.print("Input your position   : ");
		String position_Francisco = sc.nextLine();
		System.out.print("Input your department : ");
		String department_Francisco = sc.nextLine();
		System.out.println("-------------------------------------------");
		
		// METHOD CALLINGS ------------------------------------------
		// this is an instance of Employee class that accepts 3 parameters
		Employee_Francisco employee = new Employee_Francisco(name_Francisco, 
				position_Francisco, department_Francisco);
		
		// while this is an instance to the inner class Salary
		Employee_Francisco.Salary_Francisco employee_salary = employee.new 
				Salary_Francisco();
		
		// static method call - inside inner class
		employee_salary.computeSalary_Francisco();
		
		// instance method call - inside inner class too
		String status = employee_salary.salaryStatus_Francisco();
		
		System.out.println("Generating invoice...");
		
		// static method call but accepts 1 parameter
		employee.employeeDetails_Francisco(status);
		
		sc.close();

	}

}
