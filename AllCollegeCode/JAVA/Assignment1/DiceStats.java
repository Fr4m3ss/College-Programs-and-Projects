//Francesco Messina, Assignment 1, DiceStats.java
import java.util.Scanner;
import java.util.Random;

public class DiceStats
{
	public static void main(String[] args)
	{
		//Initializing Variables, Scanners, and RNG's
		Scanner num = new Scanner(System.in);
		Random r = new Random();
		double totalRolls = 0;		
		int diceTotal = 0;
	
		//User Input
		System.out.println("How many dice will constitute one roll? ");
		int numDie = num.nextInt();
		System.out.println("How many rolls");
		int numRolls = num.nextInt();
		
		//Array for counting
		int[] frequency = new int [1+(6 * numDie)];
		
		//Rolling the actual dice and storing data as necessary
		for(int i = 0; i < numRolls; i++)
		{
			for(int j = 0; j < numDie; j++)
			{		
				diceTotal += 1 + r.nextInt(6);
			}
			frequency[diceTotal] = frequency[diceTotal] + 1;
			diceTotal = 0;
			totalRolls++;
		}
		
		//Output
		System.out.printf("Sum	# of times	Percentage");
		
		for(int i = numDie; i < frequency.length; i++)
		{
			double avg = 100*(frequency[i]/totalRolls);
			System.out.print("\n" + i);
			System.out.print("	"+ frequency[i]);
			System.out.printf("		%.2f", avg);
			System.out.print(" %");
		}
		System.out.println();
	}
}
