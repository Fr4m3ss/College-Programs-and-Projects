//Francesco Messina, Assignment 1: Reverse.java
import java.util.Scanner;

public class Reverse
{
	//Reversing Function
	public static long reverseDigits(long num)
	{
		//Initializing Variables, and turning num into string
		String longstr = Long.toString(num);	
		int[] reversenum = new int[longstr.length()];
		int counter = 0;
		long power = 1;
	
		//Turning string into an int array, and counting how many places the largest number is (hundreds, thousands, etc)
		for(int i = reversenum.length; i > 0; i--)
		{
			//Turning the string converted into the array
			reversenum[counter] = longstr.charAt(i-1) - 48;
			counter++;
			//Seeing how large the largest number is
			power = power*10;
		}
		
		//Converting 
		long answer = 0;
		for(int i = 0; i < reversenum.length; i++)
		{
			//Lowering the largest number as necessary
			power = power/10;
			//Converting the int array into reversed long
			answer = answer + (reversenum[i] * power);
		}
	
		//Outputting answer
		return answer;
	}

	public static void main(String[] args)
	{
		//Initializing Variables and Scanners
		Scanner num = new Scanner(System.in);
		long input = 1;
		
		//Looping until user exits
		while(input != 0)
		{
			//User input
			System.out.println("Please enter a long intetger (0 to quit): ");
			input = num.nextLong();
			
			//Checking user input
			if(input != 0)
			{
				//Outputting if necessary
				System.out.println("The number reversed is:	" + reverseDigits(input));
			}
		}
	
		//Exit message
		System.out.println("Goodbye!");
	}
}
