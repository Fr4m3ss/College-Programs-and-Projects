import java.util.*;
public class WarMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int [] deck = new int[54];
	int c=2;
	
	for(int i=1;i<54;i++)
	{
		deck[i]=c;
		if(i%14==0)
			c=0;
		c++;
	}
	
	
	for(int k=0;k<deck.length;k++)
	{
		System.out.println(deck[k]);
	}
	
		
	}
}
