
public class WarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] deck = new int[52];
	
		Cards v = new Cards(deck);
		int c=1;
		for(int i=0;i<deck.length;i++)//creating the deck of cards
		{
			deck[i]=c+1;
			
			if(i%13==0)
			{
				c=1;
			}
			if(i==13 || i==26 || i==39)
				deck[i]=2;
			c++;
		}
		
		for(int k=0;k<deck.length;k++)//printing out the deck with names
		{
			if(deck[k]==11 || deck[k]==12 || deck[k]==13 || deck[k]==14)
				System.out.print(v.getName(deck[k])+" ");
			if(deck[k]!=11 && deck[k]!=12 && deck[k]!=13 && deck[k]!=14)
				System.out.print(deck[k]+" ");
		}
		
		System.out.println();
		
		v.shuffle();//shuffling
		for(int q=0;q<deck.length;q++)//printing out the deck with names as shuffled
		{
			if(deck[q]==11 || deck[q]==12 || deck[q]==13 || deck[q]==14)
				System.out.print(v.getName(deck[q])+" ");
			if(deck[q]!=11 && deck[q]!=12 && deck[q]!=13 && deck[q]!=14)
				System.out.print(deck[q]+" ");
		}
		
		int [] p1 = new int[26];//creating the players arrays
		int [] p2 = new int[26];
		int [] garbage = new int [52];//trash pile 
		
		for(int d=0;d<26;d++)//split the deck
		{
			p1[d]=deck[d];
		}
		int c2=0;
		for(int f=26;f<52;f++)
		{
			p2[c2]=deck[f];//split the deck
			c2++;
		}
		System.out.println();
		for(int b=0;b<p1.length;b++)
			System.out.print(p1[b]+" ");
		System.out.println();
		for(int p=0;p<p2.length;p++)
			System.out.print(p2[p]+" ");
		
		//SCORING CODE
		int p1score = 26;//base score 
		int p2score = 26;
		
		int h=0; //starting index
		if(h<p1.length)//REGULAR SHIFT
		{
			System.out.println();
			System.out.println();
			System.out.println("Player 1's card: "+p1[h]);
			System.out.println("Player 2's card: "+p2[h]);
	
			while(v.compare(p1[h],p2[h])==0)//WAR
			{
				System.out.println("You Got War!");
				h+=4;//updating index
				System.out.println("Player 1's card: "+p1[h]);
				System.out.println("Player 2's card: "+p2[h]);
				System.out.println();
			}
			if(v.compare(p1[h],p2[h])==1)
			{
				System.out.println("Player 1 wins");
			}
			if(v.compare(p1[h],p2[h])==2)
			{
				System.out.println("Player 2 Wins");
			}
			h++;
		}
	}

}
