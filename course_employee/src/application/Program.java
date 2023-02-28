package application;

import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		Employee employee = new Employee ();
		
		System.out.println("Enter the data: ");
		employee.Name = sc.nextLine();
		employee.GrossSalary = sc.nextDouble();
		employee.Tax = sc.nextDouble();
		
		System.out.println(employee.EmployeeData());
		System.out.print("\nWhich percentage to increase salary?");
		employee.Percent = sc.nextDouble();
		System.out.println();
		System.out.println(employee.FinalEmployeeData());
		sc.close();
	}
}
