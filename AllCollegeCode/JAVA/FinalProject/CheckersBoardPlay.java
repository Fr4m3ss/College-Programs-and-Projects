//Francesco Messina, Final Project, Checkers Board Play Panel
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Point;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*; 
import java.lang.*;

public class CheckersBoardPlay extends JPanel
{	
        //Instantiating Variables
	int xOffset = 0;
	int yOffset = 0;
	int x = 0;
	int y = 0;
	int size = 400;
	int boxSize = 0;
	int pieceSize = 0;
	int previousPiece = 0;
	int player = 1;
	boolean selected = false;
	int centerX = 0;
	int centerY = 0;
	int tempX = 0;
	int tempY = 0;
	double distance = 0.0;
	double lowestDistance = Double.MAX_VALUE;
	int lowestI = -1;
	int lowestJ = -1;
	int selectedI = -1;
	int selectedJ = -1;
	boolean loaded = false;
	CheckersBoard gameBoard = new CheckersBoard();

	public CheckersBoardPlay()
        {
		//Making Save button
		JButton save = new JButton("Save"); 
                setLayout(new BorderLayout()); 
                save.setBackground(new Color(210,180,140));
                add(save,BorderLayout.WEST);
	
		//Printing Gameboard to console for debugging purposes
        /*	gameBoard.printBoard();		*/
		
		//Checking if the save button is pressed
		save.addActionListener
                (   
                        new ActionListener()
                        {   
                                public void actionPerformed(ActionEvent e)
                                {
                                       gameBoard.saveGame(); 
                                }
                        }
                );

		//Resizing the board when the panel is resized
	 	addComponentListener
                (
                        new ComponentAdapter()
                        {
                                public void componentResized(ComponentEvent e)
                                {
                                        repaint();
                                }
                        }
                );

		//User input interface (Calling self made functions)
		addMouseListener
		(
			new MouseAdapter()
			{
				public void mouseClicked(MouseEvent e)
				{
					if(!selected)
					{
						selectPiece(e.getX(), e.getY());
					}
					else if(selected)
					{
						movePiece(e.getX(), e.getY());
					}
					else
					{
						repaint();
					}
				}
			}
		);		
	}
  
	private void selectPiece(int clickX, int clickY)
	{
		repaint();
		//Printing mouse coordinates for debugging purposes
	/*	System.out.println(x + " " + y);	*/

		//Setting variables to calculate the proper space you are clicking
		centerX = x + boxSize/2;
		centerY = y + boxSize/2;
		tempX = 0;
		tempY = 0;
		distance = 0.0;
		lowestDistance = Double.MAX_VALUE;
		lowestI = -1;
		lowestJ = -1;

		//Runs through the GUI Board to find the closest center of a box that you clicked
		for(int i = 1; i < 9; i++)
		{
			centerX = x + boxSize/2;
			for(int j = 1; j < 9; j++)
			{
				tempX = centerX - clickX;
				tempY = centerY - clickY;
				
				tempX = tempX*tempX;
				tempY = tempY*tempY;
				
				distance = Math.sqrt((tempX + tempY));
				if(distance < lowestDistance)
				{
					lowestDistance = distance;
					lowestI = i;
					lowestJ = j;
				}
				centerX += boxSize;
			}
			centerY += boxSize;
		}
		
		//Printing selected coordinates for debugging purposes
	/*	System.out.println("I: " + lowestI + "J: " + lowestJ);	*/

		//Selecting the piece as necessary, and setting variables as needed
		if(player == 1)
		{
			if(gameBoard.board[lowestI][lowestJ] == 1)
			{
				previousPiece = 1;
				gameBoard.board[lowestI][lowestJ] = 6;
				selected = true;
			}
			else if(gameBoard.board[lowestI][lowestJ] == 2)
			{
				previousPiece = 2;
				gameBoard.board[lowestI][lowestJ] = 7;
				selected = true;
			}
		}
		else if(player == 2)
		{
			if(gameBoard.board[lowestI][lowestJ] == 3)
			{
				previousPiece = 3;
				gameBoard.board[lowestI][lowestJ] = 6;
				selected = true;
			}
			else if(gameBoard.board[lowestI][lowestJ] == 4)
			{
				previousPiece = 4;
				gameBoard.board[lowestI][lowestJ] = 7;
				selected = true;
			}
		}
	
		if(selected)
		{
			selectedI = lowestI;
			selectedJ = lowestJ;
		}

		repaint();

	}

	private void movePiece(int clickX, int clickY)
	{
		repaint();
		
		//Printing mouse coordinates for debugging purposes
	/*	System.out.println(x + " " + y);	*/

		//Setting variables as needed to calculate moves
		centerX = x + boxSize/2;
		centerY = y + boxSize/2;
		tempX = 0;
		tempY = 0;
		distance = 0.0;
		lowestDistance = Double.MAX_VALUE;
		lowestI = -1;
		lowestJ = -1;

		for(int i = 1; i < 9; i++)
		{
			centerX = x + boxSize/2;
			for(int j = 1; j < 9; j++)
			{
				tempX = centerX - clickX;
				tempY = centerY - clickY;
				
				tempX = tempX*tempX;
				tempY = tempY*tempY;
				
				distance = Math.sqrt((tempX + tempY));
				if(distance < lowestDistance)
				{
					lowestDistance = distance;
					lowestI = i;
					lowestJ = j;
				}
				centerX += boxSize;
			}
			centerY += boxSize;
		}
		
		//Printing selected coordinates for debugging purposes
	/*	System.out.println("I: " + lowestI + "J: " + lowestJ);	*/
		
		
		//Moving correct pieces if valid moves are made
		if(gameBoard.board[lowestI][lowestJ] == 6)
		{
			gameBoard.board[lowestI][lowestJ] = previousPiece;
			selected = false;
		}
		else
		{
			if(player == 1)
			{
				if(gameBoard.isValid1(previousPiece, selectedI, selectedJ, lowestI, lowestJ))
				{
					player = 2;
					selected = false;
					gameBoard.makeKing();
				}
				else
				{
					gameBoard.board[selectedI][selectedJ] = previousPiece;
					selected = false;
					gameBoard.makeKing();
				}
			}
			else if(player == 2)
			{
				if(gameBoard.isValid2(previousPiece, selectedI, selectedJ, lowestI, lowestJ))
				{
					player = 1;
					selected = false;
					gameBoard.makeKing();
				}
				else
				{
					gameBoard.board[selectedI][selectedJ] = previousPiece;
					selected = false;
					gameBoard.makeKing();
				}
			}
		}
	
		gameBoard.makeKing();

		repaint();
	}
   
   	//Custom Method to load game if necessary
	public void loadIt()
	{
		gameBoard.loadGame();
	}

	//Painting the board and pieces based on 2d array, and the integer that is stored in it, signifying which piece is where
        @Override
        public void paintComponent(Graphics g)
        {
		//Drawing Gameboard
                super.paintComponent(g);
		if(getSize().width < getSize().height)
		{
			if((getSize().width-(getSize().width/3)) > 400)
			{
				if((getSize().width-(getSize().width/3))%8 == 0)
				{
					size = getSize().width-(getSize().width/3); 
				}
			}
			else
			{
				size = 400;
			}
		}
		else
		{
			if((getSize().height-(getSize().height/3)) > 400)
			{
				if((getSize().height-(getSize().height/3))%8 == 0)
				{
					size = getSize().height-(getSize().height/3);
				}
			}
			else
			{
				size = 400;
			}
		}	
		
		//Setting the colored blocks in board
		xOffset = (getSize().width-size)/2;
		yOffset = (getSize().height-size)/2;
		x = xOffset;
		y = yOffset;
		boxSize = size/8;
		
		g.setColor(Color.BLACK);
		g.drawRect(xOffset, yOffset, size, size);
		boolean solid = true;
		for(int i = 0; i < 8; i++)
		{
			xOffset = x;
			for(int j = 0; j < 8; j++)
			{
				if(solid)
				{
					solid = !solid;
					g.drawRect(xOffset, yOffset, boxSize, boxSize);
				}
				else
				{
					solid = !solid;
					g.fillRect(xOffset, yOffset, boxSize, boxSize);
				}
				xOffset += boxSize;
			}
			yOffset += boxSize;
			solid = !solid;
		}
                
		//Placing player pieces on board
		xOffset = x + (boxSize/12);
		yOffset = y + (boxSize/12);
		pieceSize = (boxSize-(boxSize/6));
		for(int i = 1; i < 9; i++)
		{
			xOffset = x + (boxSize/12);
			for(int j = 1; j < 9; j++)
			{
				if(gameBoard.board[i][j] == 3)//Player 2
				{
					g.setColor(Color.RED);
					g.fillArc(xOffset, yOffset, pieceSize, pieceSize, 0, 360);
				}
				else if(gameBoard.board[i][j] == 1)//Player 1
				{
					g.setColor(Color.WHITE);
					g.fillArc(xOffset, yOffset, pieceSize, pieceSize, 0, 360);
				}
				else if(gameBoard.board[i][j] == 4)//Player 2 King
				{
					g.setColor(Color.YELLOW);
					g.fillRoundRect(xOffset, yOffset, pieceSize, pieceSize, 20, 20);
					g.setColor(Color.RED);
					g.fillArc(xOffset, yOffset, pieceSize, pieceSize, 0, 360);
				}
				else if(gameBoard.board[i][j] == 2)//Player 1 King
				{
					g.setColor(Color.YELLOW);
					g.fillRoundRect(xOffset, yOffset, pieceSize, pieceSize, 20, 20);
					g.setColor(Color.WHITE);
					g.fillArc(xOffset, yOffset, pieceSize, pieceSize, 0, 360);
				}
				else if(gameBoard.board[i][j] == 6)//Normal Piece Selected
				{
					g.setColor(Color.GREEN);
					g.fillArc(xOffset, yOffset, pieceSize, pieceSize, 0, 360);
				}
				else if(gameBoard.board[i][j] == 7)//King Piece Selected
				{
					g.setColor(Color.YELLOW);
					g.fillRoundRect(xOffset, yOffset, pieceSize, pieceSize, 20, 20);
					g.setColor(Color.GREEN);
					g.fillArc(xOffset, yOffset, pieceSize, pieceSize, 0, 360);
				}
				xOffset += boxSize;
			}
			yOffset += boxSize;
		}

		//Setting font settings
		g.setColor(Color.BLUE);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 40)); 		
		
		//Printing whos turn it is
		if(!gameBoard.winner())
		{
			g.setFont(new Font("TimesRoman", Font.PLAIN, (getSize().height/16)));
			if(player == 1)
			{
				g.drawString("Player 1's Turn", ((getSize().width/2)-(getSize().height/5)), (getSize().height/16));
			}
			else
			{
				g.drawString("Player 2's Turn", ((getSize().width/2)-(getSize().height/5)), (getSize().height/16));
			}
		}
		
		//Printing winning outcome
		if(gameBoard.player1win())
		{
			g.drawString("Player 1 Wins!", ((getSize().width/2)-135), (getSize().height/2));
		}
		else if(gameBoard.player2win())
		{	
			g.drawString("Player 2 Wins!", ((getSize().width/2)-135), (getSize().height/2));
		}
		
		this.setBackground(new Color(210,180,140));
        }

	//Function to retrieve load boolean value from tempPanel.java
	public void getLoad(boolean loadedPassed)
	{
		loaded = loadedPassed;
	}
}

