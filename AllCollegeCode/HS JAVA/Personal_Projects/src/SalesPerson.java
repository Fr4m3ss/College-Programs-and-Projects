public class SalesPerson 
{
	private double TotalSales;
	private int TotalDays;

public SalesPerson (int hours, double salary, int vacDays)
{
	super(hours,salary,vacDays);
	TotalSales = 0;
	TotalDays = 0;
}

public double totalSalary (int sales)
{
	if (sales <5000)
		{
			TotalSales = super.getSalary()*1.05;
		}
	if (sales >5000 && sales <10000)
		{
			TotalSales = super.getSalary()*1.1;
		}
	if (sales >15000)
		{
			TotalSales = super.getSalary()*1.15;
		}

	return TotalSales;
}

public int setVacationDays (int days)
{
	if ( days <= 10)
	{
		TotalDays = super.getVacationDays() + 2;
	}
	else 
	if ( days > 10 && days <=15)
	{
		TotalDays = super.getVacationDays() + 4;
	}
	else
	if ( days >15)
	{
		TotalDays = super.getVacationDays() + 5;
	}

		return TotalDays;
	}
	
public String toString ()
{
	return super.toString() + "\n Total Sales: " + TotalSales + "\n Total Days of Vacation: " + TotalDays;
}

}