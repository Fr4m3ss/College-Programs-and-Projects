public class Employee extends SalesPerson
{
	private int baseHours;
	private double baseSalary;
	private int baseVacationDays;
	
	public Employee(int hours, double salary, int vacDays)
	{
		baseHours = hours;
		baseSalary = salary;
		baseVacationDays = vacDays;
	
	}
	
	public int getHours()
	{
		return baseHours;
	}
	
	public double getSalary()
	{
		return baseSalary;
	}
	
	public int getVacationDays()
	{
		return baseVacationDays;
	}
	
	public String toString()
	{
		return "Total Base Hours: " + baseHours + "\n Salary: " + baseSalary + "\n Vacation Time: " + baseVacationDays;
	}
}