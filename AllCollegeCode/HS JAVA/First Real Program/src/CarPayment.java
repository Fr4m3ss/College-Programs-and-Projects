import java.util.Scanner;


public class CarPayment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stringinput = new Scanner (System.in);
		System.out.print("Enter the name of your car ->                         ");
		String carName = stringinput.nextLine();
		Scanner numberinput = new Scanner (System.in);
		System.out.print("Enter the sticker price of your car ->                ");
		int price = numberinput.nextInt();
		Scanner numberinput2 = new Scanner (System.in);
		System.out.print("Enter the cost of your features ->                    ");
		int features = numberinput2.nextInt();
		Scanner numberinput3 = new Scanner (System.in);
		System.out.print("Enter the value of your trade in (If applicable) ->   ");
		int trade = numberinput3.nextInt();
		Scanner numberinput4 = new Scanner (System.in);
		System.out.print("Enter the cost of your down payment ->                ");
		int downPayment = numberinput4.nextInt();
		Scanner numberinput5 = new Scanner (System.in);
		System.out.print("Enter the interest rate ->                            ");
		int interestRate = numberinput5.nextInt();
		Scanner numberinput6 = new Scanner (System.in);
		System.out.print("Enter the sales tax ->                                ");
		int salesTax = numberinput6.nextInt();
		Scanner numberinput7 = new Scanner (System.in);
		System.out.print("Enter the number of years for financing ->            ");
		int years = numberinput7.nextInt();
		
		int total = price + features;
		int total2 = (total-trade)-downPayment;
		int tax = total2*salesTax/100;
		int total3 = total2+tax;
		double total4 = total3*interestRate/100.00 + total3;
		double total5 = total4/+(years*12);
		
		System.out.println("");
		System.out.println("Name of your car ->                 "+carName);
		System.out.println("Sticker Price of your car ->        $"+price);
		System.out.println("Cost of your cars features ->       $"+features);
		System.out.println("Total ->                            $"+total);
		System.out.println("Trade in value ->                   $"+trade);
		System.out.println("Down payment cost ->                $"+downPayment);
		System.out.println("Total after down payments ->        $"+total2);
		System.out.println("Tax ->                              $"+tax);
		System.out.println("Total before financing ->           $"+total3);
		System.out.println("Interest Rate ->                    "+interestRate +"%");
		System.out.println("Total after financing ->            $"+total4); 
		System.out.println("MONTHLY PAYMENT ->                  $"+total5);
	    
		
		
		}

}
