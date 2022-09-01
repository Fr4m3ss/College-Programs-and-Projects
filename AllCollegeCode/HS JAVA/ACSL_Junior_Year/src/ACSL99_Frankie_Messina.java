import java.util.*;

public class ACSL99_Frankie_Messina {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner string = new Scanner (System.in);
		Scanner num = new Scanner (System.in);
		
		String p1a = null; String p2a = null;
		String p1b = null; String p2b = null;
		String p1c = null; String p2c = null;
		String p1d = null; String p2d = null;
		String p1e = null; String p2e = null;
		String replacestring = null; String playerwon = null;
		
		int p1an = 0; int p2an = 0;
		int p1bn = 0; int p2bn = 0;
		int p1cn = 0; int p2cn = 0;
		int p1dn = 0; int p2dn = 0;
		int p1en = 0; int p2en = 0;
		int total = 0;int repeat = 0;
		int inputnumber = 2; int replace = 0;
		int inputrepeat=0; int addfive=0;
		int addfive2=0; int winscore=0;
		int stopper=0;int repeater=0;
				
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~				
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~		
		System.out.print("1. ");
		p1a = string.nextLine(); 
		p1b = string.nextLine(); 
		p1c = string.nextLine(); 
		p1d = string.nextLine(); 
		p1e = string.nextLine(); 
		p2a = string.nextLine();
		p2b = string.nextLine();
		p2c = string.nextLine();
		p2d = string.nextLine();
		p2e = string.nextLine();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
		while(repeat<5)
		{inputrepeat=0;
		stopper=0;
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
		if(p1a.equals("2"))
		{
			p1an=2;
		}
		if(p1b.equals("2"))
		{
			p1bn=2;
		}
		if(p1c.equals("2"))
		{
			p1cn=2;
		}
		if(p1d.equals("2"))
		{
			p1dn=2;
		}
		if(p1e.equals("2"))
		{
			p1en=2;
		}
		if(p2a.equals("2"))
		{
			p2an=2;
		}
		if(p2b.equals("2"))
		{
			p2bn=2;
		}
		if(p2c.equals("2"))
		{
			p2cn=2;
		}
		if(p2d.equals("2"))
		{
			p2dn=2;
		}
		if(p2e.equals("2"))
		{
			p2en=2;
		}
		
		
		if(p1a.equals("3"))
		{
			p1an=3;
		}
		if(p1b.equals("3"))
		{
			p1bn=3;
		}
		if(p1c.equals("3"))
		{
			p1cn=3;
		}
		if(p1d.equals("3"))
		{
			p1dn=3;
		}
		if(p1e.equals("3"))
		{
			p1en=3;
		}
		if(p2a.equals("3"))
		{
			p2an=3;
		}
		if(p2b.equals("3"))
		{
			p2bn=3;
		}
		if(p2c.equals("3"))
		{
			p2cn=3;
		}
		if(p2d.equals("3"))
		{
			p2dn=3;
		}
		if(p2e.equals("3"))
		{
			p2en=3;
		}

		
		if(p1a.equals("4"))
		{
			p1an=4;
		}
		if(p1b.equals("4"))
		{
			p1bn=4;
		}
		if(p1c.equals("4"))
		{
			p1cn=4;
		}
		if(p1d.equals("4"))
		{
			p1dn=4;
		}
		if(p1e.equals("4"))
		{
			p1en=4;
		}
		if(p2a.equals("4"))
		{
			p2an=4;
		}
		if(p2b.equals("4"))
		{
			p2bn=4;
		}
		if(p2c.equals("4"))
		{
			p2cn=4;
		}
		if(p2d.equals("4"))
		{
			p2dn=4;
		}
		if(p2e.equals("4"))
		{
			p2en=4;
		}
		
		if(p1a.equals("5"))
		{
			p1an=5;
		}
		if(p1b.equals("5"))
		{
			p1bn=5;
		}
		if(p1c.equals("5"))
		{
			p1cn=5;
		}
		if(p1d.equals("5"))
		{
			p1dn=5;
		}
		if(p1e.equals("5"))
		{
			p1en=5;
		}
		if(p2a.equals("5"))
		{
			p2an=5;
		}
		if(p2b.equals("5"))
		{
			p2bn=5;
		}
		if(p2c.equals("5"))
		{
			p2cn=5;
		}
		if(p2d.equals("5"))
		{
			p2dn=5;
		}
		if(p2e.equals("5"))
		{
			p2en=5;
		}
		
		if(p1a.equals("6"))
		{
			p1an=6;
		}
		if(p1b.equals("6"))
		{
			p1bn=6;
		}
		if(p1c.equals("6"))
		{
			p1cn=6;
		}
		if(p1d.equals("6"))
		{
			p1dn=6;
		}
		if(p1e.equals("6"))
		{
			p1en=6;
		}
		if(p2a.equals("6"))
		{
			p2an=6;
		}
		if(p2b.equals("6"))
		{
			p2bn=6;
		}
		if(p2c.equals("6"))
		{
			p2cn=6;
		}
		if(p2d.equals("6"))
		{
			p2dn=6;
		}
		if(p2e.equals("6"))
		{
			p2en=6;
		}
		
		if(p1a.equals("7"))
		{
			p1an=7;
		}
		if(p1b.equals("7"))
		{
			p1bn=7;
		}
		if(p1c.equals("7"))
		{
			p1cn=7;
		}
		if(p1d.equals("7"))
		{
			p1dn=7;
		}
		if(p1e.equals("7"))
		{
			p1en=7;
		}
		if(p2a.equals("7"))
		{
			p2an=7;
		}
		if(p2b.equals("7"))
		{
			p2bn=7;
		}
		if(p2c.equals("7"))
		{
			p2cn=7;
		}
		if(p2d.equals("7"))
		{
			p2dn=7;
		}
		if(p2e.equals("7"))
		{
			p2en=7;
		}
		
		if(p1a.equals("8"))
		{
			p1an=8;
		}
		if(p1b.equals("8"))
		{
			p1bn=8;
		}
		if(p1c.equals("8"))
		{
			p1cn=8;
		}
		if(p1d.equals("8"))
		{
			p1dn=8;
		}
		if(p1e.equals("8"))
		{
			p1en=8;
		}
		if(p2a.equals("8"))
		{
			p2an=8;
		}
		if(p2b.equals("8"))
		{
			p2bn=8;
		}
		if(p2c.equals("8"))
		{
			p2cn=8;
		}
		if(p2d.equals("8"))
		{
			p2dn=8;
		}
		if(p2e.equals("8"))
		{
			p2en=8;
		}
		
		if(p1a.equals("9"))
		{
			p1an=9;
		}
		if(p1b.equals("9"))
		{
			p1bn=9;
		}
		if(p1c.equals("9"))
		{
			p1cn=9;
		}
		if(p1d.equals("9"))
		{
			p1dn=9;
		}
		if(p1e.equals("9"))
		{
			p1en=9;
		}
		if(p2a.equals("9"))
		{
			p2an=9;
		}
		if(p2b.equals("9"))
		{
			p2bn=9;
		}
		if(p2c.equals("9"))
		{
			p2cn=9;
		}
		if(p2d.equals("9"))
		{
			p2dn=9;
		}
		if(p2e.equals("9"))
		{
			p2en=9;
		}
		
		if(p1a.equals("T"))
		{
			p1an=-10;
		}
		if(p1b.equals("T"))
		{
			p1bn=-10;
		}
		if(p1c.equals("T"))
		{
			p1cn=-10;
		}
		if(p1d.equals("T"))
		{
			p1dn=-10;
		}
		if(p1e.equals("T"))
		{
			p1en=-10;
		}
		if(p2a.equals("T"))
		{
			p2an=-10;
		}
		if(p2b.equals("T"))
		{
			p2bn=-10;
		}
		if(p2c.equals("T"))
		{
			p2cn=-10;
		}
		if(p2d.equals("T"))
		{
			p2dn=-10;
		}
		if(p2e.equals("T"))
		{
			p2en=-10;
		}
		
		if(p1a.equals("J"))
		{
			p1an=11;
		}
		if(p1b.equals("J"))
		{
			p1bn=11;
		}
		if(p1c.equals("J"))
		{
			p1cn=11;
		}
		if(p1d.equals("J"))
		{
			p1dn=11;
		}
		if(p1e.equals("J"))
		{
			p1en=11;
		}
		if(p2a.equals("J"))
		{
			p2an=11;
		}
		if(p2b.equals("J"))
		{
			p2bn=11;
		}
		if(p2c.equals("J"))
		{
			p2cn=11;
		}
		if(p2d.equals("J"))
		{
			p2dn=11;
		}
		if(p2e.equals("J"))
		{
			p2en=11;
		}
		
		if(p1a.equals("Q"))
		{
			p1an=12;
		}
		if(p1b.equals("Q"))
		{
			p1bn=12;
		}
		if(p1c.equals("Q"))
		{
			p1cn=12;
		}
		if(p1d.equals("Q"))
		{
			p1dn=12;
		}
		if(p1e.equals("Q"))
		{
			p1en=12;
		}
		if(p2a.equals("Q"))
		{
			p2an=12;
		}
		if(p2b.equals("Q"))
		{
			p2bn=12;
		}
		if(p2c.equals("Q"))
		{
			p2cn=12;
		}
		if(p2d.equals("Q"))
		{
			p2dn=12;
		}
		if(p2e.equals("Q"))
		{
			p2en=12;
		}
		
		if(p1a.equals("K"))
		{
			p1an=13;
		}
		if(p1b.equals("K"))
		{
			p1bn=13;
		}
		if(p1c.equals("K"))
		{
			p1cn=13;
		}
		if(p1d.equals("K"))
		{
			p1dn=13;
		}
		if(p1e.equals("K"))
		{
			p1en=13;
		}
		if(p2a.equals("K"))
		{
			p2an=13;
		}
		if(p2b.equals("K"))
		{
			p2bn=13;
		}
		if(p2c.equals("K"))
		{
			p2cn=13;
		}
		if(p2d.equals("K"))
		{
			p2dn=13;
		}
		if(p2e.equals("K"))
		{
			p2en=13;
		}
		
		if(p1a.equals("A"))
		{
			p1an=14;
		}
		if(p1b.equals("A"))
		{
			p1bn=14;
		}
		if(p1c.equals("A"))
		{
			p1cn=14;
		}
		if(p1d.equals("A"))
		{
			p1dn=14;
		}
		if(p1e.equals("A"))
		{
			p1en=14;
		}
		if(p2a.equals("A"))
		{
			p2an=14;
		}
		if(p2b.equals("A"))
		{
			p2bn=14;
		}
		if(p2c.equals("A"))
		{
			p2cn=14;
		}
		if(p2d.equals("A"))
		{
			p2dn=14;
		}
		if(p2e.equals("A"))
		{
			p2en=14;
		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~		
		int[] player1 = {p1an, p1bn, p1cn, p1dn, p1en};
		int[] player2 = {p2an, p2bn, p2cn, p2dn, p2en};
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		int temp1;

		for (int i = 0; i < player1.length; i++)
		{
		       for(int j = -1; j < player1.length-1; j++)
		       {
		                if(player1[i] > player1[j + 1])
		                {
		                            temp1 = player1 [j + 1];
		                            player1 [j + 1]= player1 [i];
		                            player1 [i] = temp1;
		                }
		        }
		}
		
		int temp2;

		for (int i = 0; i < player2.length; i++)
		{
		       for(int j = -1; j < player2.length-1; j++)
		       {
		                if(player2[i] > player2[j + 1])
		                {
		                            temp2 = player2 [j + 1];
		                            player2 [j + 1]= player2 [i];
		                            player2 [i] = temp2;
		                }
		        }
		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	while(inputrepeat>=0&&inputrepeat<=11)
	{
	if(inputrepeat==0)
	{
		System.out.println(inputnumber+". "); inputnumber++;
		total = num.nextInt();
		stopper=0;
	}
	while(inputrepeat!=0&&inputrepeat<=11)
	{
		if(inputrepeat<=10)
		{
			replacestring = string.nextLine();
		}
		else
		{
			replacestring.equals("2");
		}
	addfive=0;
	addfive2=0;
if(total<=33)
{
	addfive=1;
}
if(total<=55&&total>=34)
{
	addfive=2;
}
if(total<=77&&total>=56)
{
	addfive=3;
}
if(total>=34)
{
	addfive2=4;
}
if(total>=56)
{
	addfive2=5;
}
if(total>=78)
{
	addfive2=6;
}
	if(replacestring.equals("2"))
	{
		replace=2;
	}
	if(replacestring.equals("3"))
	{
		replace=3;
	}
	if(replacestring.equals("4"))
	{
		replace=4;
	}
	if(replacestring.equals("5"))
	{
		replace=5;
	}
	if(replacestring.equals("6"))
	{
		replace=6;
	}
	if(replacestring.equals("7"))
	{
		replace=7;
	}
	if(replacestring.equals("8"))
	{
		replace=8;
	}
	if(replacestring.equals("9"))
	{
		replace=9;
	}
	if(replacestring.equals("T"))
	{
		replace=10;
	}
	if(replacestring.equals("J"))
	{
		replace=11;
	}
	if(replacestring.equals("Q"))
	{
		replace=12;
	}
	if(replacestring.equals("K"))
	{
		replace=13;
	}
	if(replacestring.equals("A"))
	{
		replace=14;
	}

	temp1=0;

	for (int i = 0; i < player1.length; i++)
	{
	       for(int j = -1; j < player1.length-1; j++)
	       {
	                if(player1[i] > player1[j + 1])
	                {
	                            temp1 = player1 [j + 1];
	                            player1 [j + 1]= player1 [i];
	                            player1 [i] = temp1;
	                }
	        }
	}
																								
	
	temp2=0;

	for (int i = 0; i < player2.length; i++)
	{
	       for(int j = -1; j < player2.length-1; j++)
	       {
	                if(player2[i] > player2[j + 1])
	                {
	                            temp2 = player2 [j + 1];
	                            player2 [j + 1]= player2 [i];
	                            player2 [i] = temp2;
	                }
	        }
	}
																								
	if(inputrepeat==1||inputrepeat==3||inputrepeat==5||inputrepeat==7||inputrepeat==9)
	{
		if(player1[2]==2)
		{
			total=total+2;
		}

		if(player1[2]==3)
		{
			total=total+3;
		}

		if(player1[2]==4)
		{
			total=total+4;
		}

		if(player1[2]==5)
		{
			total=total+5;
		}

		if(player1[2]==6)
		{
			total=total+6;
		}

		if(player1[2]==7)
		{
			if(7+total>=100)
			{
			total=total+1;	
			}
			else
			{
			total=total+7;	
			}	
		}
		if(player1[2]==8)
		{
			total=total+8;
		}

		if(player1[2]==9)
		{
			total=total+0;
		}
		if(player1[2]==10)
		{
			total=total-10;
		}
		if(player1[2]==11)
		{
			total=total+11;
		}

		if(player1[2]==12)
		{
			total=total+12;
		}

		if(player1[2]==13)
		{
			total=total+13;
		}

		if(player1[2]==14)
		{
			total=total+14;
		}

		/*else
		{
			System.out.println("total before adding player1 "+total+"player1 "+player1[2]);
		total=total+player1[2];
		System.out.println("total after adding player1 "+total+"player1 "+player1[2]);
		}
		*/
		if(addfive==1)
		{
			if(total>=34)
			{ 
				total=total+5;
			}
		}
		if(addfive==2)
		{
			if(total>=56)
			{
				total=total+5;
			}
		}
		if(addfive==3)
		{
			if(total>=78)
			{
				total=total+5;
			}
		}
		if(addfive2==4)
		{
			if(total<=33)
			{
				total=total+5;
			}
		}
		if(addfive2==5)
		{
			if(total<=55)
			{
				total=total+5;
			}
		}
		if(addfive2==6)
		{
			if(total<=77)
			{
				total=total+5;
			}
		}
	player1[2]=replace;
	
	temp1=0;

	for (int i = 0; i < player1.length; i++)
	{
	       for(int j = -1; j < player1.length-1; j++)
	       {
	                if(player1[i] > player1[j + 1])
	                {
	                            temp1 = player1 [j + 1];
	                            player1 [j + 1]= player1 [i];
	                            player1 [i] = temp1;
	                }
	        }
	}
	}
	
	if(inputrepeat==2||inputrepeat==4||inputrepeat==6||inputrepeat==8||inputrepeat==10)
	{
		
		if(player2[2]==2)
		{
			total=total+2;
		}

		if(player2[2]==3)
		{
			total=total+3;
		}

		if(player2[2]==4)
		{
			total=total+4;
		}

		if(player2[2]==5)
		{
			total=total+5;
		}

		if(player2[2]==6)
		{
			total=total+6;
		}

		if(player2[2]==7)
		{
			if(7+total>=100)
			{
			total=total+1;	
			}
			else
			{
			total=total+7;	
			}	
		}
		if(player2[2]==8)
		{
			total=total+8;
		}

		if(player2[2]==9)
		{
			total=total+0;
		}
		if(player2[2]==10)
		{
			total=total-10;
		}
		if(player2[2]==11)
		{
			total=total+11;
		}

		if(player2[2]==12)
		{
			total=total+12;
		}

		if(player2[2]==13)
		{
			total=total+13;
		}

		if(player2[2]==14)
		{
			total=total+14;
		}
		/*else
		{
			System.out.println("total before adding player2 "+total+"player2 "+player2[2]);
		total=total+player2[2];
		System.out.println("total before adding player2 "+total+"player2 "+player2[2]);
		}
		*/
		if(addfive==1)
		{
			if(total>=34)
			{
				total=total+5;
			}
		}
		if(addfive==2)
		{
			if(total>=56)
			{
				total=total+5;
			}
		}
		if(addfive==3)
		{
			if(total>=78)
			{
				total=total+5;
			}
		}
		if(addfive2==4)
		{
			if(total<=33)
			{
				total=total+5;
			}
		}
		if(addfive2==5)
		{
			if(total<=55)
			{
				total=total+5;
			}
		}
		if(addfive2==6)
		{
			if(total<=77)
			{
				total=total+5;
			}
		}
	player2[2]=replace;	
	temp2=0;

	for (int i = 0; i < player2.length; i++)
	{
	       for(int j = -1; j < player2.length-1; j++)
	       {
	                if(player2[i] > player2[j + 1])
	                {
	                            temp2 = player2 [j + 1];
	                            player2 [j + 1]= player2 [i];
	                            player2 [i] = temp2;
	                }
	        }
	}
	}
	
	
	temp1=0;

	for (int i = 0; i < player1.length; i++)
	{
	       for(int j = -1; j < player1.length-1; j++)
	       {
	                if(player1[i] > player1[j + 1])
	                {
	                            temp1 = player1 [j + 1];
	                            player1 [j + 1]= player1 [i];
	                            player1 [i] = temp1;
	                }
	        }
	}
	
	temp2=0;

	for (int i = 0; i < player2.length; i++)
	{
	       for(int j = -1; j < player2.length-1; j++)
	       {
	                if(player2[i] > player2[j + 1])
	                {
	                            temp2 = player2 [j + 1];
	                            player2 [j + 1]= player2 [i];
	                            player2 [i] = temp2;
	                }
	        }
	}
		if(total>=100&&stopper==0)
		{
			if(inputrepeat==1||inputrepeat==3||inputrepeat==5||inputrepeat==7||inputrepeat==9)
			{
				playerwon="Player #2";
				winscore=total;
				stopper++;
				
			}
			
			if(inputrepeat==2||inputrepeat==4||inputrepeat==6||inputrepeat==8||inputrepeat==10)
			{
				playerwon="Player #1";
				winscore=total;
				stopper++;
			}
		}
	
	inputrepeat++;
	}
	if(inputrepeat!=0)
	{
	System.out.println(winscore+", "+playerwon);
	}
	inputrepeat++;
	}
repeat++;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
		

		
}
}
