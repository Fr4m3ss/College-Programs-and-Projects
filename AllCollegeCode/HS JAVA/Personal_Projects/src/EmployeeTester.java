public class EmployeeTester
{
	
public static void main (String[]args)
   {
      Employee Sem = new Employee(1,5.00,0);
      
      Employee no = new SalesPerson(2,10.00,1);
      
      SalesPerson s = new SalesPerson(2,10.0,1);
      
      
      
      System.out.println (no.totalSalary(20000));
      System.out.println (no.setVacationDays(15));
      
      
      
     System.out.println (no);
     System.out.println();
     System.out.println (Sem);
     System.out.println();
     System.out.println(s);
   }
}