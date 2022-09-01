//Francesco Messina, Final Project, Checkers Board Class
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Point;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class CheckersBoard
{
	//Instantiating Variables
	boolean place = false;	
	public int[][] board = new int[10][10];
        int[][] validBoard = new int[10][10];
	public int[][] boardLoad = new int[10][10];
        int[][] validBoardLoad = new int[10][10];
	File save = new File("SavedGame.txt");


	public CheckersBoard()
        {
		//Setting the board array to default starting setup
		for(int i = 1; i < 4; i++)
		{
			for(int j = 1; j < 9; j++)
			{
				if(place)
				{
					place = !place;
					board[i][j] = 3;
				}
				else
				{
					place = !place;
					board[i][j] = 0;
				}
			}
			place = !place;
		}
		
		for(int i = 6; i < 9; i++)
		{
			for(int j = 1; j < 9; j++)
			{
				if(place)
				{
					place = !place;
					board[i][j] = 1;
				}
				else
				{
					place = !place;
					board[i][j] = 0;
				}
			}
			place = !place;
		}
		
		//Setting parallel 2d array to check for valid spaces to move
		for(int i = 1; i < 9; i++)
		{
			for(int j = 1; j < 9; j++)
			{
				if(place && board[i][j] == 0)
				{
					place = !place;
					validBoard[i][j] = 5;
				}
				else
				{
					place = !place;
					validBoard[i][j] = 0;
				}
			}
			place = !place;
		} 
	}

	//Custom loading method
	public void loadGame()
	{
		//Error checking
		try
		{
			//Making default file if it doesn't already exist
      			if (save.createNewFile()) 
			{
				for(int i = 1; i < 4; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						if(place)
						{
							place = !place;
							boardLoad[i][j] = 3;
						}
						else
						{
							place = !place;
							boardLoad[i][j] = 0;
						}
					}
					place = !place;
				}
				
				for(int i = 6; i < 9; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						if(place)
						{
							place = !place;
							boardLoad[i][j] = 1;
						}
						else
						{
							place = !place;
							boardLoad[i][j] = 0;
						}
					}
					place = !place;
				}

				for(int i = 1; i < 9; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						if(place && board[i][j] == 0)
						{
							place = !place;
							validBoardLoad[i][j] = 5;
						}
						else
						{
							place = !place;
							validBoardLoad[i][j] = 0;
						}
					}
					place = !place;
				}

				//Writing Game to File
				FileWriter writer = new FileWriter(save);
				for(int i = 1; i < 9; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						writer.write(boardLoad[i][j]);
					}
				}
				for(int i = 1; i < 9; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						writer.write(validBoardLoad[i][j]);
					}
				}
				writer.close();	
      			} 
			else 
			{
				//Reading in saved file if it exists and is valid
        			FileReader reader = new FileReader(save);
				for(int i = 1; i < 9; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						board[i][j] = reader.read();
					}
				}
				for(int i = 1; i < 9; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						validBoard[i][j] = reader.read();;
					}
				}
				reader.close();	

      			}
    		}
		//Exception handling sent to the console command line
		catch (IOException e) 
		{
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}
	}

	//Custom save function
	public void saveGame()
	{
		//Error checking
		try
		{
      			if (save.createNewFile()) 
			{	
				//Writing Game to File
				FileWriter writer = new FileWriter(save);
				for(int i = 1; i < 9; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						writer.write(board[i][j]);
					}
				}
				for(int i = 1; i < 9; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						writer.write(validBoard[i][j]);
					}
				}
				writer.close();	
      			} 
			else 
			{
        			//Writing Game to File
				FileWriter writer = new FileWriter(save);
				for(int i = 1; i < 9; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						writer.write(board[i][j]);
					}
				}
				for(int i = 1; i < 9; i++)
				{
					for(int j = 1; j < 9; j++)
					{
						writer.write(validBoard[i][j]);
					}
				}
				writer.close();	
			}
    		}
		//Exception handling, printing error to command line output
		catch (IOException e) 
		{
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}
	}

	//Board printing method for testing/debugging purposes
	public void printBoard()
	{
		for(int i = 1; i < 9; i++)
		{		
			for(int j = 1; j < 9; j++ )
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.print("\n");
		}

		System.out.print("\n");
		for(int i = 1; i < 9; i++)
		{		
			for(int j = 1; j < 9; j++ )
			{
				System.out.print(validBoard[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	//Custom method to check if any pieces must be turned into king pieces
	public void makeKing()
	{
		for(int i = 1; i < 9; i++)
		{
			for(int j = 1; j < 9; j++)
			{
				if(i == 1 && board[i][j] == 1)
				{
					board[i][j] = 2;
				}
				else if(i == 8 && board[i][j] == 3)
				{
					board[i][j] = 4;
				}
			}
		}
	}

	//Checking if player 1's moves are valid
	public boolean isValid1(int previous, int iSelected, int jSelected, int iMove, int jMove)
	{
		//Normal Pieces Valid Moves
		if(previous == 1)
		{
			if(validBoard[iMove][jMove] == 5)
			{
				if((iSelected - 1) == iMove && ((jSelected + 1) == jMove || (jSelected - 1) == jMove))
				{
					board[iSelected][jSelected] = 0;
					board[iMove][jMove] = previous;
					validBoard[iSelected][jSelected] = 5;
					validBoard[iMove][jMove] = 0;
					return true;
				}
				if(board[iSelected - 1][jSelected + 1] == 3 || board[iSelected - 1][jSelected + 1] == 4)
				{
					if((iSelected - 2) == iMove && (jSelected + 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
						
						board[iSelected - 1][jSelected + 1] = 0;
						validBoard[iSelected - 1][jSelected + 1] = 5;

						return true;
					}
				}
				if(board[iSelected - 1][jSelected - 1] == 3 || board[iSelected - 1][jSelected - 1] == 4)
				{
					if((iSelected - 2) == iMove && (jSelected - 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;

						board[iSelected - 1][jSelected - 1] = 0;
						validBoard[iSelected - 1][jSelected - 1] = 5;

						return true;	
					}
				}

			}
		}
		//Kings Valid Moves
		if(previous == 2)
		{
			if(validBoard[iMove][jMove] == 5)
			{
				if(((iSelected - 1) == iMove || (iSelected + 1) == iMove) && ((jSelected + 1) == jMove || (jSelected - 1) == jMove))
				{
					board[iSelected][jSelected] = 0;
					board[iMove][jMove] = previous;
					validBoard[iSelected][jSelected] = 5;
					validBoard[iMove][jMove] = 0;
					return true;
				}
				if(board[iSelected - 1][jSelected - 1] == 3 || board[iSelected - 1][jSelected - 1] == 4)
				{
					if((iSelected - 2) == iMove && (jSelected - 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
						
						board[iSelected - 1][jSelected - 1] = 0;
						validBoard[iSelected - 1][jSelected - 1] = 5;

						return true;	
					}
				}
				if(board[iSelected - 1][jSelected + 1] == 3 || board[iSelected - 1][jSelected + 1] == 4)
				{
					if((iSelected - 2) == iMove && (jSelected + 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
						
						board[iSelected - 1][jSelected + 1] = 0;
						validBoard[iSelected - 1][jSelected + 1] = 5;

						return true;
					}
				}
				if(board[iSelected + 1][jSelected - 1] == 3 || board[iSelected + 1][jSelected - 1] == 4)
				{
					if((iSelected + 2) == iMove && (jSelected - 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
						
						board[iSelected + 1][jSelected - 1] = 0;
						validBoard[iSelected + 1][jSelected - 1] = 5;

						return true;
					}
				}
				if(board[iSelected + 1][jSelected + 1] == 3 || board[iSelected + 1][jSelected + 1] == 4)
				{
					if((iSelected + 2) == iMove && (jSelected + 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
					
						board[iSelected + 1][jSelected + 1] = 0;
						validBoard[iSelected + 1][jSelected + 1] = 5;

						return true;
					}
				}



			}
		}
		
		return false;	
	}
	
	//Checking player 2's moves to see if valid
	public boolean isValid2(int previous, int iSelected, int jSelected, int iMove, int jMove)
	{
		//Normal piece validation
		if(previous == 3)
		{
			if(validBoard[iMove][jMove] == 5)
			{
				if((iSelected + 1) == iMove && ((jSelected + 1) == jMove || (jSelected - 1) == jMove))
				{
					board[iSelected][jSelected] = 0;
					board[iMove][jMove] = previous;
					validBoard[iSelected][jSelected] = 5;
					validBoard[iMove][jMove] = 0;
					return true;
				}
				if(board[iSelected + 1][jSelected - 1] == 1 || board[iSelected + 1][jSelected - 1] == 2)
				{
					if((iSelected + 2) == iMove && (jSelected - 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
						
						board[iSelected + 1][jSelected - 1] = 0;
						validBoard[iSelected + 1][jSelected - 1] = 5;

						return true;
					}
				}
				if(board[iSelected + 1][jSelected + 1] == 1 || board[iSelected + 1][jSelected + 1] == 2)
				{
					if((iSelected + 2) == iMove && (jSelected + 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
						
						board[iSelected + 1][jSelected + 1] = 0;
						validBoard[iSelected + 1][jSelected + 1] = 5;

						return true;
					}
				}

			}
		}
		//King piece validation
		if(previous == 4)
		{
			if(validBoard[iMove][jMove] == 5)
			{
				if(((iSelected - 1) == iMove || (iSelected + 1) == iMove) && ((jSelected + 1) == jMove || (jSelected - 1) == jMove))
				{
					board[iSelected][jSelected] = 0;
					board[iMove][jMove] = previous;
					validBoard[iSelected][jSelected] = 5;
					validBoard[iMove][jMove] = 0;
					return true;
				}
				if(board[iSelected - 1][jSelected - 1] == 1 || board[iSelected - 1][jSelected - 1] == 2)
				{
					if((iSelected - 2) == iMove && (jSelected - 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
						
						board[iSelected - 1][jSelected - 1] = 0;
						validBoard[iSelected - 1][jSelected - 1] = 5;
	
						return true;	
					}
				}
				if(board[iSelected - 1][jSelected + 1] == 1 || board[iSelected - 1][jSelected + 1] == 2)
				{
					if((iSelected - 2) == iMove && (jSelected + 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
						
						board[iSelected - 1][jSelected + 1] = 0;
						validBoard[iSelected - 1][jSelected + 1] = 5;

						return true;
					}
				}
				if(board[iSelected + 1][jSelected - 1] == 1 || board[iSelected + 1][jSelected - 1] == 2)
				{
					if((iSelected + 2) == iMove && (jSelected - 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
						
						board[iSelected + 1][jSelected - 1] = 0;
						validBoard[iSelected + 1][jSelected - 1] = 5;

						return true;
					}
				}
				if(board[iSelected + 1][jSelected + 1] == 1 || board[iSelected + 1][jSelected + 1] == 2)
				{
					if((iSelected + 2) == iMove && (jSelected + 2) == jMove)
					{
						board[iSelected][jSelected] = 0;
						board[iMove][jMove] = previous;
						validBoard[iSelected][jSelected] = 5;
						validBoard[iMove][jMove] = 0;
						
						board[iSelected + 1][jSelected + 1] = 0;
						validBoard[iSelected + 1][jSelected + 1] = 5;

						return true;
					}
				}

			}
		}
		
		return false;
	}

	//Calling individual winning functions to check if either player won
	public boolean winner()
	{
		boolean win = false;
		if(player1win())
		{
			win = true;
		}
		else if(player2win())
		{
			win = true;
		}
		return win;
	}
	
	//Checks if player 1 won
	public boolean player1win()
	{
		boolean win = true;
		for(int i = 1; i < 9; i++)
		{
			for(int j = 1; j < 9; j++)
			{
				if(board[i][j] == 3 || board[i][j] == 4 || board[i][j] == 6)
				{
					win = false;
				}
			}
		}
		return win;
	}

	//Checks if player 2 won
	public boolean player2win()
	{
		boolean win = true;
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if(board[i][j] == 1 || board[i][j] == 2 || board[i][j] == 6)
				{
					win = false;
				}
			}
		}
		return win;	
	}


}

