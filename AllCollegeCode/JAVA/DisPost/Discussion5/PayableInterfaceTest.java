// Discussion 5: Using Polymorphism, instanceof, assert
// Fill in the four places where it states "PUT CODE HERE"

public class PayableInterfaceTest  {
   public static void main(String[] args) {

      Payable[] payableObjects = new Payable[5];
      
      //Populate each array element as described in the discussion:
      //PUT CODE HERE

      payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
      payableObjects[1] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
      payableObjects[2] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
      payableObjects[3] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
      payableObjects[4] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300.00);

      System.out.println("Invoices and Employees processed polymorphically:\n"); 

      for (Payable currentPayable : payableObjects) {
         
        //Output the String Representation of each Payable object
        //PUT CODE HERE
      	System.out.println(currentPayable);
         
        //If an object is a BasePlusCommissionEmployee, increase its base salary by 10% and 
        //print out the new base salary in the format noted in the discussion
        //PUT CODE HERE
	if(currentPayable instanceof BasePlusCommissionEmployee)
	{
		double salary = (((BasePlusCommissionEmployee)currentPayable).getBaseSalary() + (((BasePlusCommissionEmployee)currentPayable).getBaseSalary() / 10)); 
		((BasePlusCommissionEmployee)currentPayable).setBaseSalary(salary);
		System.out.printf("new base salary with 10%% increase is: $%,.2f\n", ((BasePlusCommissionEmployee)currentPayable).getBaseSalary());
	}

        System.out.printf("%s: $%,.2f\n\n", "payment due", currentPayable.getPaymentAmount());

        //Use assert to throw an exception if the payment expected is too low (< 600):
        //PUT CODE HERE
	
	assert (currentPayable.getPaymentAmount() >= 600) :"WARNING - Payment less than expected: " + currentPayable.getPaymentAmount();
      }
   }
}

