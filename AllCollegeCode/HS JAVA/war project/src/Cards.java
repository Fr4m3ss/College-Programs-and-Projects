import java.util.*;
import java.util.Arrays;
public class Cards {

	private int [] deck;
	private String name;
	private int value;
	
	public Cards(int [] x)
	{
		deck=x;
	}
	
	public int[] shuffle()
	{
		int temp;
		
		for(int y=0; y<=654;y++)
		{
			int index = (int) (Math.random()*51);
			
			for(int i=0;i<deck.length;i++)
			{
				temp=deck[i];
				deck[i]=deck[index];
				deck[index]=temp;
			}
		}
		
		return deck;

	}
	public String getName(int x)
	{
		if(x==14)
			return "Ace";
		if(x==13)
			return "King";
		if(x==12)
			return "Queen";
		if(x==11)
			return "Jack";
		return "";
	}
	public int getValue()
	{
		return value;
	}
	public int compare(int p1, int p2)
	{
		if(p1>p2)
			return 1;
		if(p2>p1)
			return 2;
		if(p1==p2)
			return 0;
		return -1;
	}
	public String toString()
	{
		return getName(value)+" "+value;
	}
}
