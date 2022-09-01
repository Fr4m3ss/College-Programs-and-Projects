import java.util.*;

public class HEX_ROWAN {
	static String claim;
	static ArrayList<Integer>xrow=new ArrayList<>();
	static ArrayList<Integer>xcol=new ArrayList<>();
	static ArrayList<Integer>orow=new ArrayList<>();
	static ArrayList<Integer>ocol=new ArrayList<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean iso = false;
		boolean isx = false;
		//Instantiations
		Scanner string = new Scanner (System.in);
        Scanner num = new Scanner (System.in);
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //Input
        System.out.println("1.");
		int dataSetNum = num.nextInt();
		
		for(int i=0; i<dataSetNum;i++)
		{
			System.out.println("2.a");
			int boardSize = num.nextInt();
			System.out.println("2.b");
			String spacesTaken = string.nextLine();//LOL this variable is useless, just like me.
			System.out.println("2.c");
			String xSpace = string.nextLine();
			claim=xSpace;
			while(claim.length()>0)
				Spot(1);
			System.out.println("2.d");
			String oSpace = string.nextLine();
			claim=oSpace;
			while(claim.length()>0)
				Spot(2);

			
			//2-D Array
			String[][] board = new String[boardSize+1][boardSize+1];
			
			
			//Board Creation
			for(int r=1; r<boardSize+1; r++)
			{
				for(int c=1; c<boardSize+1; c++)
				{
					for(int j=0; j<xrow.size(); j++)
					{
						System.out.println("X-"+xrow.get(j)+"="+r+" "+xcol.get(j)+"="+c);
						if((int)(xrow.get(j))==(r)&&(int)(xcol.get(j))==(c))
						{
							board[r][c]="X";
							isx=true;
						}
					}
					if(!isx)
					{
						for(int j=0; j<orow.size(); j++)
						{
							System.out.println("O-"+orow.get(j)+"="+r+" "+ocol.get(j)+"="+c);
							if((int)(orow.get(j))==(r)&&(int)(ocol.get(j))==(c))
							{
								board[r][c]="O";
								iso=true;
							}
						}
					}
					if(!iso&&!isx)
					{
						board[r][c]="-";
					}
					iso=false;
					isx=false;
				}
			}
			
			//Print Board
			System.out.println("Analyzing "+dataSetNum+" data set(s)");	
			System.out.println("Data Set "+i);
			System.out.println("Board Position:");
			for(int r=1; r<boardSize+1; r++)
			{
				for(int c=1; c<boardSize+1; c++)
				{
					System.out.print(board[r][c]+"  ");
				}
			System.out.println("");
				for(int p=0; p<r; p++)
				{
					System.out.print("  ");
				}
			}
			System.out.println();
					
			xrow.clear();
			orow.clear();
			xcol.clear();
			ocol.clear();


			
			
		}//FOR LOOP END BRACKET
}//FINAL BRACKET
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	private static void Spot(int i)
	{
	String temp=claim.substring(0,2);
	int r=Integer.parseInt(temp.substring(1, 2));
	int c=0;
	if(temp.charAt(0)=='A')
		c=1;
	if(temp.charAt(0)=='B')
		c=2;
	if(temp.charAt(0)=='C')
		c=3;
	if(temp.charAt(0)=='D')
		c=4;
	if(temp.charAt(0)=='E')
		c=5;
	if(temp.charAt(0)=='F')
		c=6;
	if(temp.charAt(0)=='G')
		c=7;
	if(temp.charAt(0)=='H')
		c=8;
	if(temp.charAt(0)=='I')
		c=9;
	if(temp.charAt(0)=='J')
		c=10;
	if(temp.charAt(0)=='K')
		c=11;
	if(temp.charAt(0)=='L')
		c=12;
	if(temp.charAt(0)=='M')
		c=13;
	if(temp.charAt(0)=='N')
		c=14;
	if(temp.charAt(0)=='O')
		c=15;
	if(temp.charAt(0)=='P')
		c=16;
	if(temp.charAt(0)=='Q')
		c=17;
	if(temp.charAt(0)=='R')
		c=18;
	if(temp.charAt(0)=='S')
		c=19;
	if(temp.charAt(0)=='T')
		c=20;
	if(temp.charAt(0)=='U')
		c=21;
	if(temp.charAt(0)=='V')
		c=22;
	if(temp.charAt(0)=='W')
		c=23;
	if(temp.charAt(0)=='X')
		c=24;
	if(temp.charAt(0)=='Y')
		c=25;
	if(claim.length()!=2)
	claim=claim.substring(3);
	if(claim.length()==2)
	claim="";
	if(i==1)
	{
		xrow.add(r);
		xcol.add(c);
	}
	if(i==2)
	{
		orow.add(r);
		ocol.add(c);
	}
	}

		
		
	}


