//Francesco Messina, Assignment 3, Tic Tac Toe
import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

	public static void main(String[] args) {

		int c=1;
		int pl1x = 0; int pl1y = 0; int pl2x = 0; int pl2y = 0;
		TicClass t = new TicClass();
		String[][] board = {{"","",""},{"","",""},{"","",""}};
		int input = 0;
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		boolean isTaken = true;
		int spacesLeft = 9;

//Argument (Flag) input/checking

		int i = 0, j;
		String arg;
		char flag;
		char play;
		if(args.length == 1)
		{
			flag = args[0].charAt(1);
			if(flag == 'c')
			{		
				System.out.println("Player 1 is X, Player 2 is O!");
				while(true)
				{
					isTaken = true;
					if(t.determineWinner1(board)==true || t.determineWinner2(board)==true)
						break;
					else if(t.isBoardFull(board)==true) 
					{
						System.out.println();
						t.printBoard(board);
						System.out.println("\nTie!");
						break;
					}

					c++;
					System.out.println();
					t.printBoard(board);
			
					if(c%2==0) //player 1's choices
					{
						while(isTaken)
						{
							input = 0;
							isTaken = false;
							System.out.println();
							
							input = t.winningMoveX(board);//Winning move
							if(input == 0)
							{
								input = t.winningMoveO(board);//Block opponent
							}
							if(input == 0)
							{
								if(!board[1][1].equals("X") && !board[1][1].equals("O"))//Center Space
								{
									input = 5;
								}
							}
							if(input == 0)//Random Space (From open spaces)
							{
								int randomSpace = r.nextInt(spacesLeft)+1;
								input = t.randomChoice(randomSpace, board);
							}

							//Converting the input to coordinate points for the board 
							switch(input)
							{
							case 1:
								pl1x = 0; pl1y = 0;
								break;
							case 2:
								pl1x = 0; pl1y = 1;
								break;
							case 3:
								pl1x = 0; pl1y = 2;
								break;
							case 4:
								pl1x = 1; pl1y = 0;
								break;
							case 5:
								pl1x = 1; pl1y = 1;
								break;
							case 6:
								pl1x = 1; pl1y = 2;
								break;
							case 7:
								pl1x = 2; pl1y = 0;
								break;
							case 8:
								pl1x = 2; pl1y = 1;
								break;
							case 9:
								pl1x = 2; pl1y = 2;
								break;
							}
							
							//preventing duplication
							if((board[pl1x][pl1y].equals("X"))||(board[pl1x][pl1y].equals("O")))
							{
								isTaken = true;
								System.out.println("Spot taken, reenter.");
							}
							else
							{
								System.out.println("Player 1 chose position " + input);
								t.setSpot1(pl1x,pl1y,board);
							}
						}
						spacesLeft--;
					} //end of pl1
					else	//player 2's choices
					{
						while(isTaken)
						{
							input = 0;
							isTaken = false;
	
							input = t.winningMoveO(board);//Winning move
							if(input == 0)
							{
								input = t.winningMoveX(board);//Block opponent
							}
							if(input == 0)
							{
								if(!board[1][1].equals("X") && !board[1][1].equals("O"))//Center Space
								{
									input = 5;
								}
							}
							if(input == 0)//Random Space (From open spaces)
							{
								int randomSpace = r.nextInt(spacesLeft)+1;
								input = t.randomChoice(randomSpace, board);
							}
							
							//Converting the input to coordinate points for the board
							switch(input)
							{
							case 1:
								pl2x = 0; pl2y = 0;
								break;
							case 2:
								pl2x = 0; pl2y = 1;  
								break;
							case 3:
								pl2x = 0; pl2y = 2;
								break;
							case 4:
								pl2x = 1; pl2y = 0;
								break;
							case 5:
								pl2x = 1; pl2y = 1;
								break;
							case 6:
								pl2x = 1; pl2y = 2;
								break;
							case 7:
								pl2x = 2; pl2y = 0;
								break;
							case 8:
								pl2x = 2; pl2y = 1;
								break;
							case 9:
								pl2x = 2; pl2y = 2;
								break;
							} 

							//preventing duplication
							if((board[pl2x][pl2y].equals("X"))||(board[pl2x][pl2y].equals("O")))
							{
								isTaken = true;
								System.out.println("Spot taken, reenter.");
							}
							else
							{
								System.out.println("\nPlayer 2 chose position "     + input);
								t.setSpot2(pl2x,pl2y,board);
							}
						}
						spacesLeft--;
					}//end of pl2

					
				} //end of while
			
				if(t.determineWinner1(board)==true)
				{
					t.printBoard(board);
					System.out.println("Player 1 wins!");
				}
				if(t.determineWinner2(board)==true)
				{
					t.printBoard(board);
					System.out.println("Player 2 wins!");
				}
				
				}
				else//Argument Checking
				{
					System.out.println("Invalid flag: unable to run, please try again.");
				}
		}
		else if(args.length == 2)
		{
			flag = args[0].charAt(1);
			play = args[1].charAt(0);
			if(flag == 'c' && play == '1')
			{
				System.out.println("Player 1 is X, Player 2 is O!");
				while(true)
				{
					isTaken = true;
					if(t.determineWinner1(board)==true || t.determineWinner2(board)==true)
						break;
					else if(t.isBoardFull(board)==true) 
					{
						System.out.println();
						t.printBoard(board);
						System.out.println("\nTie!");
						break;
					}

					c++;
					System.out.println();
					t.printBoard(board);
			
					if(c%2==0) //player 1's choices
					{
						while(isTaken)
						{
							input = 0;
							isTaken = false;
							
							input = t.winningMoveX(board);//Winning move
							if(input == 0)
							{
								input = t.winningMoveO(board);//Block opponent
							}
							if(input == 0)
							{
								if(!board[1][1].equals("X") && !board[1][1].equals("O"))//Center Space
								{
									input = 5;
								}
							}
							if(input == 0)//Random Space (From open spaces)
							{
								int randomSpace = r.nextInt(spacesLeft)+1;
								input = t.randomChoice(randomSpace, board);
							}

							//Converting the input to coordinate points for the board 
							switch(input)
							{
							case 1:
								pl1x = 0; pl1y = 0;
								break;
							case 2:
								pl1x = 0; pl1y = 1;
								break;
							case 3:
								pl1x = 0; pl1y = 2;
								break;
							case 4:
								pl1x = 1; pl1y = 0;
								break;
							case 5:
								pl1x = 1; pl1y = 1;
								break;
							case 6:
								pl1x = 1; pl1y = 2;
								break;
							case 7:
								pl1x = 2; pl1y = 0;
								break;
							case 8:
								pl1x = 2; pl1y = 1;
								break;
							case 9:
								pl1x = 2; pl1y = 2;
								break;
							}
							
							//preventing duplication
							if((board[pl1x][pl1y].equals("X"))||(board[pl1x][pl1y].equals("O")))
							{
								isTaken = true;
								System.out.println("Spot taken, reenter.");
							}
							else
							{
								System.out.println("\nPlayer 1 chose position " + input);
								t.setSpot1(pl1x,pl1y,board);
							}
						}
						spacesLeft--;
					} //end of pl1
					else	//player 2's choices
					{
						while(isTaken)
						{
							isTaken = false;
							System.out.println();
							System.out.println("Player 2, please enter a move(1-9): ");
							input = in.nextInt();
							while (input>9 || input<=0) //invalid numbers
							{
								System.out.println("Invalid input, reenter.");
								input = in.nextInt();
							}
							
							//Converting the input to coordinate points for the board
							switch(input)
							{
							case 1:
								pl2x = 0; pl2y = 0;
								break;
							case 2:
								pl2x = 0; pl2y = 1;  
								break;
							case 3:
								pl2x = 0; pl2y = 2;
								break;
							case 4:
								pl2x = 1; pl2y = 0;
								break;
							case 5:
								pl2x = 1; pl2y = 1;
								break;
							case 6:
								pl2x = 1; pl2y = 2;
								break;
							case 7:
								pl2x = 2; pl2y = 0;
								break;
							case 8:
								pl2x = 2; pl2y = 1;
								break;
							case 9:
								pl2x = 2; pl2y = 2;
								break;
							} 

							//preventing duplication
							if((board[pl2x][pl2y].equals("X"))||(board[pl2x][pl2y].equals("O")))
							{
								isTaken = true;
								System.out.println("Spot taken, reenter.");
							}
							else
							{
								System.out.println();
								t.setSpot2(pl2x,pl2y,board);
							}
						}
						spacesLeft--;
					}//end of pl2

					
				} //end of while
			
				if(t.determineWinner1(board)==true)
				{
					t.printBoard(board);
					System.out.println("Player 1 wins!");
				}
				if(t.determineWinner2(board)==true)
				{
					t.printBoard(board);
					System.out.println("Player 2 wins!");
				}
			}
			else if(flag == 'c' && play == '2')
			{
				System.out.println("Player 1 is X, Player 2 is O!");
				while(true)
				{
					isTaken = true;
					if(t.determineWinner1(board)==true || t.determineWinner2(board)==true)
						break;
					else if(t.isBoardFull(board)==true) 
					{
						System.out.println();
						t.printBoard(board);
						System.out.println("\nTie!");
						break;
					}

					c++;
					System.out.println();
					t.printBoard(board);
			
					if(c%2==0) //player 1's choices
					{
						while(isTaken)
						{
							isTaken = false;
							System.out.println();
							System.out.println("Player 1, please enter a move(1-9): ");
							input = in.nextInt();
							while (input>9 || input<=0) //invalid numbers
							{
								System.out.println("Invalid input, reenter.");
								input = in.nextInt();
							}
							//Converting the input to coordinate points for the board 
							switch(input)
							{
							case 1:
								pl1x = 0; pl1y = 0;
								break;
							case 2:
								pl1x = 0; pl1y = 1;
								break;
							case 3:
								pl1x = 0; pl1y = 2;
								break;
							case 4:
								pl1x = 1; pl1y = 0;
								break;
							case 5:
								pl1x = 1; pl1y = 1;
								break;
							case 6:
								pl1x = 1; pl1y = 2;
								break;
							case 7:
								pl1x = 2; pl1y = 0;
								break;
							case 8:
								pl1x = 2; pl1y = 1;
								break;
							case 9:
								pl1x = 2; pl1y = 2;
								break;
							}
							
							//preventing duplication
							if((board[pl1x][pl1y].equals("X"))||(board[pl1x][pl1y].equals("O")))
							{
								isTaken = true;
								System.out.println("Spot taken, reenter.");
							}
							else
							{
								System.out.println();
								t.setSpot1(pl1x,pl1y,board);
							}
						}
						spacesLeft--;
					} //end of pl1
					else	//player 2's choices
					{
						while(isTaken)
						{
							input = 0;
							isTaken = false;
	
							input = t.winningMoveO(board);//Winning move
							if(input == 0)
							{
								input = t.winningMoveX(board);//Block opponent
							}
							if(input == 0)
							{
								if(!board[1][1].equals("X") && !board[1][1].equals("O"))//Center Space
								{
									input = 5;
								}
							}
							if(input == 0)//Random Space (From open spaces)
							{
								int randomSpace = r.nextInt(spacesLeft)+1;
								input = t.randomChoice(randomSpace, board);
							}
							
							//Converting the input to coordinate points for the board
							switch(input)
							{
							case 1:
								pl2x = 0; pl2y = 0;
								break;
							case 2:
								pl2x = 0; pl2y = 1;  
								break;
							case 3:
								pl2x = 0; pl2y = 2;
								break;
							case 4:
								pl2x = 1; pl2y = 0;
								break;
							case 5:
								pl2x = 1; pl2y = 1;
								break;
							case 6:
								pl2x = 1; pl2y = 2;
								break;
							case 7:
								pl2x = 2; pl2y = 0;
								break;
							case 8:
								pl2x = 2; pl2y = 1;
								break;
							case 9:
								pl2x = 2; pl2y = 2;
								break;
							} 

							//preventing duplication
							if((board[pl2x][pl2y].equals("X"))||(board[pl2x][pl2y].equals("O")))
							{
								isTaken = true;
								System.out.println("Spot taken, reenter.");
							}
							else
							{
								System.out.println("\nPlayer 2 chose position "     + input);
								t.setSpot2(pl2x,pl2y,board);
							}
						}
						spacesLeft--;
					}//end of pl2
		
				} //end of while
			
				if(t.determineWinner1(board)==true)
				{
					t.printBoard(board);
					System.out.println("Player 1 wins!");
				}
				if(t.determineWinner2(board)==true)
				{
					t.printBoard(board);
					System.out.println("Player 2 wins!");
				}

			}
			else//Argument Checking
			{
				System.out.println("Invalid option: Valid options are [1|2]. Unable to run, please try again.");
			}
		}
		else if(args.length == 0)
		{
			System.out.println("Player 1 is X, Player 2 is O!\n");
			while(true)
			{
				isTaken = true;
				if(t.determineWinner1(board)==true || t.determineWinner2(board)==true)
					break;
				else if(t.isBoardFull(board)==true) 
				{
					t.printBoard(board);
					System.out.println("\nTie!");
					break;
				}

				c++;
				t.printBoard(board);
		
				if(c%2==0) //player 1's choices
				{
					while(isTaken)
					{
						isTaken = false;
						System.out.println();
						System.out.println("Player 1, please enter a move(1-9): ");
						input = in.nextInt();
						while (input>9 || input<=0) //invalid numbers
						{
							System.out.println("Invalid input, reenter.");
							input = in.nextInt();
						}
						//Converting the input to coordinate points for the board 
						switch(input)
						{
						case 1:
							pl1x = 0; pl1y = 0;
							break;
						case 2:
							pl1x = 0; pl1y = 1;
							break;
						case 3:
							pl1x = 0; pl1y = 2;
							break;
						case 4:
							pl1x = 1; pl1y = 0;
							break;
						case 5:
							pl1x = 1; pl1y = 1;
							break;
						case 6:
							pl1x = 1; pl1y = 2;
							break;
						case 7:
							pl1x = 2; pl1y = 0;
							break;
						case 8:
							pl1x = 2; pl1y = 1;
							break;
						case 9:
							pl1x = 2; pl1y = 2;
							break;
						}
						
						//preventing duplication
						if((board[pl1x][pl1y].equals("X"))||(board[pl1x][pl1y].equals("O")))
						{
							isTaken = true;
							System.out.println("Spot taken, reenter.");
						}
						else
						{
							System.out.println();
							t.setSpot1(pl1x,pl1y,board);
						}
					}
				} //end of pl1
				else	//player 2's choices
				{
					while(isTaken)
					{
						isTaken = false;
						System.out.println();
						System.out.println("Player 2, please enter a move(1-9): ");
						input = in.nextInt();
						while (input>9 || input<=0) //invalid numbers
						{
							System.out.println("Invalid input, reenter.");
							input = in.nextInt();
						}
						
						//Converting the input to coordinate points for the board
						switch(input)
						{
						case 1:
							pl2x = 0; pl2y = 0;
							break;
						case 2:
							pl2x = 0; pl2y = 1;  
							break;
						case 3:
							pl2x = 0; pl2y = 2;
							break;
						case 4:
							pl2x = 1; pl2y = 0;
							break;
						case 5:
							pl2x = 1; pl2y = 1;
							break;
						case 6:
							pl2x = 1; pl2y = 2;
							break;
						case 7:
							pl2x = 2; pl2y = 0;
							break;
						case 8:
							pl2x = 2; pl2y = 1;
							break;
						case 9:
							pl2x = 2; pl2y = 2;
							break;
						} 

						//preventing duplication
						if((board[pl2x][pl2y].equals("X"))||(board[pl2x][pl2y].equals("O")))
						{
							isTaken = true;
							System.out.println("Spot taken, reenter.");
						}
						else
						{
							System.out.println();
							t.setSpot2(pl2x,pl2y,board);
						}
					}
				}//end of pl2

				
			} //end of while
		
			if(t.determineWinner1(board)==true)
			{
				t.printBoard(board);
				System.out.println("Player 1 wins!");
			}
			if(t.determineWinner2(board)==true)
			{
				t.printBoard(board);
				System.out.println("Player 2 wins!");
			}
			
		}
		else//Argument Checking
		{
			System.out.println("Invalid flag(s), option(s), or both: unable to run, please try again.");
		}
	}

}

