 import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
public class Survey {

	/**
	 * @param args     
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] tally = new int[6];
		String[] choice = {"Blue  ","Red   ","Green ","Orange","Purple","Violet"};
		System.out.println("How many people are taking the survey?");
		int amount = in.nextInt();
	for (int i=1;i<=amount;i++)
	{
		System.out.println("------------------------------------\nWhat color would you perfer?");
		System.out.println("(1)Blue \n(2)Red \n(3)Green \n(4)Orange \n(5)Purple \n(6)Violet\nYour Choice: ");
		int x = in.nextInt();
		tally[x-1]++;
		System.out.println("\n-=Tally So Far=-");
		for (int f=0;f<tally.length;f++)
		{
			System.out.println(choice[f]+": "+tally[f]);
		}
	}
	System.out.println("------------------------------------\n-=Final Total as in a Bar Graph=-");
	for(int r=0;r<tally.length;r++)
		{
		System.out.print(choice[r]+"-");
	  	for(int c=0;c<tally[r];c++)
	  	{ 
	  	System.out.print(" *");
	  	}
	  	System.out.println();
		}

}
	
}