//Leonardo Acefe, Frankie Messina, Sophia Rha
import java.util.*;
public class tic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		int col;
		int row;
		int ROWS=3;
		
		int pl1x = 0; int pl1y = 0; int pl2x = 0; int pl2y = 0;
		ticclass t = new ticclass();
		String[][] board = {{" "," "," "},{" "," "," "},{" "," "," "}};
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Player 1 is O, Player 2 is X!");
		while(10==10)
		{
			if(t.determineWinner1(board)==true || t.determineWinner2(board)==true)
				break;
			else if(t.isBoardFull(board)==true) 
			{
				System.out.println();
				System.out.println("---------------Tie!---------------");
				break;
			}

			c++;
			System.out.println();
			t.printBoard();
	
			if(c%2==0) //player 1's choices
				{
					System.out.println();
					System.out.println("Player 1!\nInput your coordinates (x [ENTER] then y [ENTER]):");
					System.out.println("X coordinate:");
					pl1x = in.nextInt();
					while (pl1x>2 || pl1x<0) //invalid numbers
					{
						System.out.println("Invalid input, reenter x coordinate.");
						System.out.println("X coordinate:");
						pl1x = in.nextInt();
					}
					System.out.println("Y coordinate:");
					pl1y = in.nextInt();
					while (pl1y>2 || pl1y<0) //invalid numbers
					{
						System.out.println("Invalid input, reenter y coordinate.");
						System.out.println("Y coordinate:");
						pl1y = in.nextInt();
					}
					
					//preventing duplication
					while((board[pl1x][pl1y].equals("X"))||(board[pl1x][pl1y].equals("O")))
					{
						System.out.println("Spot taken, reenter.");
						System.out.println("X coordinate:");
						pl1x = in.nextInt();
						while (pl1x>2 || pl1x<0) //invalid numbers
						{
							System.out.println("Invalid input, reenter x coordinate.");
							System.out.println("X coordinate:");
							pl1x = in.nextInt();
						}
						System.out.println("Y coordinate:");
						pl1y = in.nextInt();
						while (pl1y>2 || pl1y<0) //invalid numbers
						{
							System.out.println("Invalid input, reenter y coordinate.");
							System.out.println("Y coordinate:");
							pl1y = in.nextInt();
						}
					}
					
					System.out.println();
					t.setSpot1(pl1x,pl1y,board);
				} //end of pl1
			else	//player 2's choices
				{
					System.out.println();
					System.out.println("Player 2!\nInput your coordinates (x [ENTER] then y [ENTER]):");
					System.out.println("X coordinate:");
					pl2x = in.nextInt();
					while (pl2x>2 || pl2x<0) //invalid numbers
					{
						System.out.println("Invalid input, reenter x coordinate.");
						System.out.println("X coordinate:");
						pl2x = in.nextInt();
					}
					System.out.println("Y coordinate:");
					pl2y = in.nextInt();
					while (pl2y>2 || pl2y<0) //invalid numbers
					{
						System.out.println("Invalid input, reenter y coordinate.");
						System.out.println("Y coordinate:");
						pl2y = in.nextInt();
					}
					
					//preventing duplication
					while((board[pl2x][pl2y].equals("X"))||(board[pl2x][pl2y].equals("O")))
					{
						System.out.println("Spot taken, reenter.");
						System.out.println("X coordinate:");
						pl2x = in.nextInt();
						while (pl2x>2 || pl2x<0) //invalid numbers
						{
							System.out.println("Invalid input, reenter x coordinate.");
							System.out.println("X coordinate:");
							pl2x = in.nextInt();
						}
						System.out.println("Y coordinate:");
						pl2y = in.nextInt();
						while (pl2y>2 || pl2y<0) //invalid numbers
						{
							System.out.println("Invalid input, reenter y coordinate.");
							System.out.println("Y coordinate:");
							pl2y = in.nextInt();
						}
					}
					
					System.out.println();
					t.setSpot2(pl2x,pl2y,board);
				} //end of pl2
			
			for( row=0;row<3;row++)
			{
				for( col=0;col<board.length;col++)
					System.out.print("  "+board[row][col]+"  |");
				System.out.println();
		         if (row != ROWS - 1) {
		            System.out.println("-----------------|");
		         }
			}

			
		} //end of while
	
		if(t.determineWinner1(board)==true)
			System.out.println("----------Player 1 wins!----------");
		if(t.determineWinner2(board)==true)
			System.out.println("----------Player 2 wins!----------");
		

		
	}

}
