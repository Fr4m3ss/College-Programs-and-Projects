//Francesco Messina, personal Tic Tac Toe class
public class TicClass {
	
public void printBoard(String[][]b)
{	
	System.out.println("Game Board:             Positions:"); 
	System.out.println("");  
	System.out.printf( " %1s | %1s | %1s              1 | 2 | 3 \n", b[0][0], b[0][1], b[0][2]);
	System.out.printf( "-----------            -----------\n");
	System.out.printf( " %1s | %1s | %1s              4 | 5 | 6 \n", b[1][0], b[1][1], b[1][2]);
	System.out.printf( "-----------            -----------\n");
	System.out.printf( " %1s | %1s | %1s              7 | 8 | 9 \n", b[2][0], b[2][1], b[2][2]);
}
public void setSpot2(int x, int y, String[][] b)
{
	b[x][y] = "O";
}

public void setSpot1(int x, int y, String[][] b)
{
	b[x][y] = "X";
}

public boolean determineWinner2(String[][]b)
{
	if(b[0][0].equals("O")&& b[1][0].equals("O") && b[2][0].equals("O"))
            return true;
        else if (b[0][1].equals("O") && b[1][1].equals("O") && b[2][1].equals("O")) 
            return true; 
        else if (b[0][2].equals("O") && b[1][2].equals("O") &&b[2][2].equals("O")) //columns
            return true;
        else if (b[0][0].equals("O")&& b[0][1].equals("O") && b[0][2].equals("O"))
            return true;
        else if (b[1][0].equals("O") && b[1][1].equals("O") && b[1][2].equals("O")) 
            return true;
        else if (b[2][0].equals("O") && b[2][1].equals("O") &&b[2][2].equals("O")) //rows
            return true;
        else if (b[0][0].equals("O") && b[1][1].equals("O") && b[2][2].equals("O")) 
            return true;
        else if (b[0][2].equals("O") && b[1][1].equals("O") &&b[2][0].equals("O"))//diag
            return true;
	return false;
}
	
public boolean determineWinner1(String[][]b)
{
	if(b[0][0].equals("X")&& b[1][0].equals("X") && b[2][0].equals("X"))
            return true;
    	else if (b[0][1].equals("X") && b[1][1].equals("X") && b[2][1].equals("X")) 
            return true; 
    	else if (b[0][2].equals("X") && b[1][2].equals("X") &&b[2][2].equals("X")) //columns
            return true;
    	else if (b[0][0].equals("X")&& b[0][1].equals("X") && b[0][2].equals("X"))
            return true;
    	else if (b[1][0].equals("X") && b[1][1].equals("X") && b[1][2].equals("X")) 
            return true;
    	else if (b[2][0].equals("X") && b[2][1].equals("X") &&b[2][2].equals("X")) //rows
            return true;
    	else if (b[0][0].equals("X") && b[1][1].equals("X") && b[2][2].equals("X")) 
            return true;
    	else if (b[0][2].equals("X") && b[1][1].equals("X") &&b[2][0].equals("X"))//diag
            return true;
	return false;
}

public int winningMoveX(String[][]b)
{
	if(((b[1][0].equals("X") && b[2][0].equals("X")) || (b[0][1].equals("X")&& b[0][2].equals("X")) || (b[1][1].equals("X") && b[2][2].equals("X"))) && !b[0][0].equals("O"))
	{
		return 1;
	}
	else if(((b[1][2].equals("X") && b[2][2].equals("X")) || (b[0][0].equals("X")&& b[0][1].equals("X")) || (b[1][1].equals("X") && b[2][0].equals("X"))) && !b[0][2].equals("O"))
	{
		return 3;
	}
	else if(((b[1][0].equals("X") && b[0][0].equals("X")) || (b[2][1].equals("X")&& b[2][2].equals("X")) || (b[1][1].equals("X") && b[0][2].equals("X"))) && !b[2][0].equals("O"))
	{
		return 7;	
	}
	else if(((b[1][2].equals("X") && b[0][2].equals("X")) || (b[2][0].equals("X")&& b[2][1].equals("X")) || (b[1][1].equals("X") && b[0][0].equals("X"))) && !b[2][2].equals("O"))
	{
		return 9;
	}
	else if(((b[1][1].equals("X") && b[2][1].equals("X")) || (b[0][0].equals("X")&& b[0][2].equals("X"))) && !b[0][1].equals("O"))
	{
		return 2;
	}
	else if(((b[0][0].equals("X") && b[2][0].equals("X")) || (b[1][1].equals("X")&& b[1][2].equals("X"))) && !b[1][0].equals("O"))
	{
		return 4;	
	}
	else if(((b[1][0].equals("X") && b[1][1].equals("X")) || (b[2][2].equals("X")&& b[0][2].equals("X"))) && !b[1][2].equals("O"))
	{
		return 6;
	}
	else if(((b[0][1].equals("X") && b[1][1].equals("X")) || (b[2][0].equals("X")&& b[2][2].equals("X"))) && !b[2][1].equals("O"))
	{
		return 8;
	}
	else if(((b[0][1].equals("X") && b[2][1].equals("X")) || (b[1][0].equals("X")&& b[1][2].equals("X")) || (b[0][0].equals("X") && b[2][2].equals("X")) || (b[2][0].equals("X") && b[0][2].equals("X"))) && !b[1][1].equals("O"))
	{
		return 5;
	}
	return 0;
}

public int winningMoveO(String[][]b)
{
	if(((b[1][0].equals("O") && b[2][0].equals("O")) || (b[0][1].equals("O")&& b[0][2].equals("O")) || (b[1][1].equals("O") && b[2][2].equals("O"))) && !b[0][0].equals("X"))
        {   
                return 1;
        }   
        else if(((b[1][2].equals("O") && b[2][2].equals("O")) || (b[0][0].equals("O")&& b[0][1].equals("O")) || (b[1][1].equals("O") && b[2][0].equals("O"))) && !b[0][2].equals("X"))
        {   
                return 3;
        }   
        else if(((b[1][0].equals("O") && b[0][0].equals("O")) || (b[2][1].equals("O")&& b[2][2].equals("O")) || (b[1][1].equals("O") && b[0][2].equals("O"))) && !b[2][0].equals("X"))
        {   
                return 7;    
        }   
        else if(((b[1][2].equals("O") && b[0][2].equals("O")) || (b[2][0].equals("O")&& b[2][1].equals("O")) || (b[1][1].equals("O") && b[0][0].equals("O"))) && !b[2][2].equals("X"))
        {   
                return 9;
        }   
        else if(((b[1][1].equals("O") && b[2][1].equals("O")) || (b[0][0].equals("O")&& b[0][2].equals("O"))) && !b[0][1].equals("X"))
        {   
                return 2;
        }   
        else if(((b[0][0].equals("O") && b[2][0].equals("O")) || (b[1][1].equals("O")&& b[1][2].equals("O"))) && !b[1][0].equals("X"))
        {   
                return 4;    
        }   
        else if(((b[1][0].equals("O") && b[1][1].equals("O")) || (b[2][2].equals("O")&& b[0][2].equals("O"))) && !b[1][2].equals("X"))
        {   
                return 6;
        }   
        else if(((b[0][1].equals("O") && b[1][1].equals("O")) || (b[2][0].equals("O")&& b[2][2].equals("O"))) && !b[2][1].equals("X"))
        {   
                return 8;
        }   
        else if(((b[0][1].equals("O") && b[2][1].equals("O")) || (b[1][0].equals("O")&& b[1][2].equals("O")) || (b[0][0].equals("O") && b[2][2].equals("O")) || (b[2][0].equals("O") && b[0][2].equals("O"))) && !b[1][1].equals("X"))
        {   
                return 5;
        }   
	return 0;	
}

public boolean isBoardFull(String[][]b)
{
	for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            if (b[i][j].equals("")) 
                return false;
       
    return true;
}

public int randomChoice(int r, String[][]b)
{
	for(int i = 0; i < 3; i++)
	{
		for(int j = 0; j < 3; j++)
		{
			if(b[i][j].equals(""))
			{
				r--;
				if(r == 0)
				{
					if(i == 0 && j == 0)
					{
						return 1;
					}
					else if(i == 0 && j == 1)
					{
						return 2;
					}
					else if(i == 0 && j == 2)
					{
						return 3;
					}
					else if(i == 1 && j == 0)
					{
						return 4;
					}
					else if(i == 1 && j == 1)
					{
						return 5;
					}
					else if(i == 1 && j == 2)
					{	
						return 6;
					}
					else if(i == 2 && j == 0)
					{
						return 7;
					}
					else if(i == 2 && j == 1)
					{
						return 8;
					}
					else if(i == 2 && j == 2)
					{
						return 9;
					}
				}
			}
		}
	}
	return 0;
}

}
