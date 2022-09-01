import java.lang.Double;
import java.util.Scanner;

public class CmdLineAvg
{
	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		int counter = 0;
		double total = 0.0;

		for(int i = 0; i < args.length; i++)
		{
			total += Double.parseDouble(args[i]);
			counter++;
		}
		double avg = total/counter;
		System.out.printf("The Average is %.3f\n", avg); 
	}
}
