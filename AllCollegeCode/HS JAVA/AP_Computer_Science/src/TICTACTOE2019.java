import java.util.Scanner;

public class TICTACTOE2019 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String[][] b = {{"","",""},{"","",""},{"","",""}};
		int winner1 = 0;
		int winner2 = 0;
		int empty1 = 0;
		int c = 1;
		int pl1x = 0; 
		int pl1y = 0; 
		int pl2x = 0; 
		int pl2y = 0;
		System.out.println("Player 1 is O, Player 2 is X!");
		System.out.println("");
		
		while(10==10)
		{
			empty1=0;
			if(b[0][0].equals("O")&& b[1][0].equals("O") && b[2][0].equals("O"))
			{
				winner1 = 1;
			}
	        else if (b[0][1].equals("O") && b[1][1].equals("O") && b[2][1].equals("O")) 
	        {
	        	winner1 = 1;
			}
	        else if (b[0][2].equals("O") && b[1][2].equals("O") &&b[2][2].equals("O")) //columns
	        {
	        	winner1 = 1;
	        }
	        else if (b[0][0].equals("O")&& b[0][1].equals("O") && b[0][2].equals("O"))
	        {
	        	winner1 = 1;
	        }
	        else if (b[1][0].equals("O") && b[1][1].equals("O") && b[1][2].equals("O")) 
	        {
	        	winner1 = 1;
	        }
	        else if (b[2][0].equals("O") && b[2][1].equals("O") &&b[2][2].equals("O")) //rows
	        {
	        	winner1 = 1;
	        }
	        else if (b[0][0].equals("O") && b[1][1].equals("O") && b[2][2].equals("O")) 
	        {
	        	winner1 = 1;
	        }
	        else if (b[0][2].equals("O") && b[1][1].equals("O") &&b[2][0].equals("O"))//diag
	        {
	        	winner1 = 1;
	        }
				
			if(b[0][0].equals("X")&& b[1][0].equals("X") && b[2][0].equals("X"))
			{
				winner2 = 1;
			}
	        else if (b[0][1].equals("X") && b[1][1].equals("X") && b[2][1].equals("X")) 
	        {
	        	winner2 = 1;
			}
	        else if (b[0][2].equals("X") && b[1][2].equals("X") &&b[2][2].equals("X")) //columns
	        {
	        	winner2 = 1;
	        }
	        else if (b[0][0].equals("X")&& b[0][1].equals("X") && b[0][2].equals("X"))
	        {
	        	winner2 = 1;
	        }
	        else if (b[1][0].equals("X") && b[1][1].equals("X") && b[1][2].equals("X")) 
	        {
	        	winner2 = 1;
	        }
	        else if (b[2][0].equals("X") && b[2][1].equals("X") &&b[2][2].equals("X")) //rows
	        {
	        	winner2 = 1;
	        }
	        else if (b[0][0].equals("X") && b[1][1].equals("X") && b[2][2].equals("X")) 
	        {
	        	winner2 = 1;
	        }
	        else if (b[0][2].equals("X") && b[1][1].equals("X") &&b[2][0].equals("X"))//diag
	        {
	        	winner2 = 1;
	        }	
			for (int i = 0; i < 3; i++)
			{
				 for (int j = 0; j < 3; j++)
				 {
					 if (b[i][j].equals("")) 
					 {
						 empty1++;
					 }
				 }
			               
			}
			if(winner1==1 || winner2==1)
				break;
			else if(empty1==0) 
			{
				System.out.println();
				System.out.println("Tie!");
				break;
			}
			c++;
			System.out.println("  (0,0)  |  (0,1)  |  (0,2)   ");
			System.out.println("------------------------------");
			System.out.println("  (1,0)  |  (1,1)  |  (1,2)   ");
			System.out.println("------------------------------");
			System.out.println("  (2,0)  |  (2,1)  |  (2,2)   ");
			if(c%2==0) //player 1's choices
			{
				System.out.println();
				System.out.println("Player 1!\nInput your coordinates (x, then y):");
				pl1x = in.nextInt();
				while (pl1x>2 || pl1x<0) //invalid numbers
				{
					System.out.println("Invalid input, reenter.");
					pl1x = in.nextInt();
				}
				pl1y = in.nextInt();
				while (pl1y>2 || pl1y<0) //invalid numbers
				{
					System.out.println("Invalid input, reenter.");
					pl1y = in.nextInt();
				}
				
				//preventing duplication
				while((b[pl1x][pl1y].equals("X"))||(b[pl1x][pl1y].equals("O")))
				{
					System.out.println("Spot taken, reenter.");
					pl1x = in.nextInt();
					pl1y = in.nextInt();
				}
				
				System.out.println();
				b[pl1x][pl1y] = "O";
			} //end of pl1
		else	//player 2's choices
			{
				System.out.println();
				System.out.println("Player 2!\nInput your coordinates (x, then y):");
				pl2x = in.nextInt();
				while (pl2x>2 || pl2x<0) //invalid numbers
				{
					System.out.println("Invalid input, reenter.");
					pl2x = in.nextInt();
				}
				pl2y = in.nextInt();
				while (pl2y>2 || pl2y<0) //invalid numbers
				{
					System.out.println("Invalid input, reenter.");
					pl2y = in.nextInt();
				}
				
				//preventing duplication
				while((b[pl2x][pl2y].equals("X"))||(b[pl2x][pl2y].equals("O")))
				{
					System.out.println("Spot taken, reenter.");
					pl2x = in.nextInt();
					pl2y = in.nextInt();
				}
				
				System.out.println();
				b[pl2x][pl2y] = "X";
			} //end of pl2
			
			
			for(int row=0;row<3;row++)
			{
				for(int col=0;col<b.length;col++)
					System.out.print("   "+b[row][col]+"\t");
				System.out.println();
				
				if(row!=2)
				System.out.println("------|------|-----");
			}	
			
		}
		
		if(winner1==1)
			System.out.println("Player 1 wins!");
		if(winner2==1)
			System.out.println("Player 2 wins!");
		
	}

}