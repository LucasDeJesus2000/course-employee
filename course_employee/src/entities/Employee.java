package entities;

public class Employee {
	public String Name;
	public double GrossSalary;
	public double Tax;
	public double Percent;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public double IncreaseSalary() {
		return ((GrossSalary * Percent)/100) + NetSalary(); 
	}
	public String EmployeeData() {
		return "Employee: " 
				+ Name 
				+ ", $ "
				+ String.format("%.2f", NetSalary());
	}
	public String FinalEmployeeData() {
		return "Update data:"
				+ Name 
				+ ", $ "
				+ String.format("%.2f",IncreaseSalary());
		
	}
}
