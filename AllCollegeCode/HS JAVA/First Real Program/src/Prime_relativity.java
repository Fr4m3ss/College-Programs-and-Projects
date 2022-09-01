import java.util.Scanner;
//Frankie Messina
//(Ultimate Haxor)
//Mod 9
//Mr Marascio

public class Prime_relativity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner (System.in);
//People enter their numbers
		System.out.print("Enter your first number-  ");
		int n1 = num.nextInt();
		System.out.print("Enter your second number-  ");
		int n2 = num.nextInt();
//Tells if they are or are not relatively prime, and prints out justly
// also, after prints, it ends the program because otherwise it repeats that they are prime
		for (int i=2;i<=5;i++)
		{
		 if (n1%i==0 && n2%i==0)
		 {
			 System.out.println("These numbers are NOT relatively prime.");
		 break;
		}
		 else
		 if (n1%i!=0)
		 {
			 if(n2%i!=0)
			 {
					 System.out.println("These numbers ARE relatively prime.");
			break;
			 }
			 
		 }
		 
		
		}
		

		 

		 }

		}