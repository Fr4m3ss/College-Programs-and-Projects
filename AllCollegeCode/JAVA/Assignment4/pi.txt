//Francesco Messina

import java.lang.Double;
import java.util.Scanner;

public class Pi
{
        public static void main(String[] Args)
	{
		//Instantiating Scanners
		Scanner num = new Scanner(System.in);

		//Instantiating Variables
		double denom = 1;
		double nume = 4;
		double pi = 4.0;	
	
		//User Input
		System.out.println("Please enter number of terms to compute to: ");
		int compute = num.nextInt();
		
		//Output Header
	 	System.out.println("terms   PI approximation");
		
		//Looping for as long as the user inputted
		for(int i = 1; i <= compute; i++)
		{
			//Approximating Pi
			if(i == 1)
			{
				pi = 4.000000000000000000;
			}
			//If the loop is on an odd interval, it adds
			else if(i%2 != 0)
			{
				pi = pi + (nume/denom); 
			}
			//If the loop is on an even interval, it subtracts
			else
			{
				pi = pi - (nume/denom);
			}
			
			//Printing out approximations
			System.out.print(i);
			System.out.printf("	%.6f\n", pi);
			
			//Incrementing the denominator by 2
			denom += 2;
		}	
		
				
	}
}
