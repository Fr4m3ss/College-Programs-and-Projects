//Francesco Messina, Section 7, Program 4: "Grid"

#include <iostream>
#include "grid.h"
#include <cstdlib>
#include <ctime>

using namespace std;

Grid::Grid()
{
	tp = 1;
	rows = 1;
	cols = 1;
	grid[rows][cols] = '>';
	for(int i = 0; i < rows; i++)
	{
		for(int j = 0; j< cols; j++)
		{
			gridP[i][j] = grid[i][j];
		}
	}
}
						
Grid::Grid(int r, int c)
{
	srand(time(0));
	tp = 1;

	//Input Checking
	if(r < 3)
	{
		rows = 3;	
	}
	else if(r > 40)
	{
		rows = 40;
	}
	else
	{
		rows = r;	
	}

	if(c < 3)
	{
		cols = 3;
	}
	else if(c > 40)
	{
		cols = 40;
	}
	else
	{
		cols = c;
	}
	
	//Filling the board with .'s
	for(int i = 0; i < 40; i++)
        {
                for(int j = 0; j < 40; j++)
                {
                	grid[i][j] = '.';
                }
        }	

	//Random Direction
	moveDir = rand() %4;
	
	//Random Placement
	moveRow = rand() %(rows-2) + 1;
	moveCol = rand() %(cols-2) + 1;

	//Random Exit Space
	int wall = rand() %4 + 1;
	int exitBlock;
	if(wall == 1)//north wall
	{
		exitBlock = rand() %(cols-2) + 1;	
	}
	else if (wall == 2)//east wall
	{
		exitBlock = rand() %(rows-2) + 1;	
	}
	else if (wall == 3)//south wall
	{
		exitBlock = rand() %(cols-2) + 1;	
	}
	else if (wall == 4)//west wall
	{
		exitBlock = rand() %(rows-2) + 1;	
	}
	
	//Putting up borders	
	for(int i = 0; i < rows; i++)
	{
		for(int j = 0; j < cols; j++)
		{
			if(wall == 1)
			{
				if(i == 0 && j != exitBlock)
				{
					grid[i][j] = '#';
				}
				if(j == 0)
				{
					grid[i][j] = '#';
				}
				if(j == cols-1)
				{
					grid[i][j] = '#';
				}	
				if(i == rows-1)
				{
					grid[i][j] = '#';
				}
			}
                        else if(wall == 2)
                        {
                                if(i == 0)
                                {
                                        grid[i][j] = '#';
                                }
                                if(j == 0)
                                {
                                        grid[i][j] = '#';
                                }
                                if(j == cols-1 && i != exitBlock)
                                {
                                        grid[i][j] = '#';
                                }
                                if(i == rows-1)
                                {
                                        grid[i][j] = '#';
                                }
                        }
                        else if(wall == 3)
                        {
                                if(i == 0)
                                {
                                        grid[i][j] = '#';
                                }
                                if(j == 0)
                                {
                                        grid[i][j] = '#';
                                }
                                if(j == cols-1)
                                {
                                        grid[i][j] = '#';
                                }
                                if(i == rows-1 && j != exitBlock)
                                {
                                        grid[i][j] = '#';
                                }
                        }
                        else if(wall == 4)
                        {
                                if(i == 0)
                                {
                                        grid[i][j] = '#';
                                }
                                if(j == 0 && i != exitBlock)
                                {
                                        grid[i][j] = '#';
                                }
                                if(j == cols-1)
                                {
                                        grid[i][j] = '#';
                                }
                                if(i == rows-1)
                                {
                                        grid[i][j] = '#';
                                }
                        }
			
			//Placing the Mover
			if(i == moveRow && j == moveCol)
			{
				if(moveDir == 0)
				{
					grid[i][j] = '^';
				}	
				else if(moveDir == 1)
				{
					grid[i][j] = '<';	
				}
				else if(moveDir == 2)
				{
					grid[i][j] = 'v';	
				}
				else if(moveDir == 3)
				{
					grid[i][j] = '>';	
				}
			}
			
		}
	}

	//Setting grid and gridP to be the same (Parallel 2d arrays)		
        for(int i = 0; i < rows; i++)
        {
                for(int j = 0; j< cols; j++)
                {
                        gridP[i][j] = grid[i][j];
                }
        }
}

Grid::Grid(int r, int c, int mr, int mc, int d)
{
        srand(time(0));
	tp = 1;

        //Input Checking
        if(r < 1)
        {
                rows = 1;
        }
        else if(r > 40)
        {
                rows = 40;
        }
        else
        {
                rows = r;
        }

        if(c < 1)
        {
                cols = 1;
        }
        else if(c > 40)
        {
                cols = 40;
        }
        else
        {
                cols = c;
        }

        //Filling the board with .'s
        for(int i = 0; i < 40; i++)       
	{
                for(int j = 0; j < 40; j++)
                {
                        grid[i][j] = '.';
                }
        }
	
	//Mover plaecment checking 	 
        if(mr < 0)
        {
                moveRow = 0;
        }
        else if(mr > rows)
        {
                moveRow = rows-1;
        }
        else
        {
                moveRow = mr;
        }

        if(mc < 0)
        {
                moveCol = 0;
        }
        else if(mc > cols)
        {
                moveCol = cols-1;
        }
        else
        {
                moveCol = mc;
        }	
	
	moveDir = d;
	
	//Placing the mover
        for(int i = 0; i < rows; i++)
        {
                for(int j = 0; j < cols; j++)
                {
                        if(i == moveRow && j == moveCol)
                        {
                                if(moveDir == 0)
                                {
                                        grid[i][j] = '^';
                                }
                                else if(moveDir == 1)
                                {
                                        grid[i][j] = '<';
                                }
                                else if(moveDir == 2)
                                {
                                        grid[i][j] = 'v';
                                }
                                else if(moveDir == 3)
                                {
                                        grid[i][j] = '>';
                                }
                        }
			
		}
	}
	
	//Setting grid and gridP to be the same (Parallel 2d arrays)            
	for(int i = 0; i < rows; i++)  
        {
        	for(int j = 0; j< cols; j++)
	        {
                	gridP[i][j] = grid[i][j];                                                                       
		} 
        }	        			
}

bool Grid::Move(int s)
{
	//Input Checking
	if(s > 0)
	{
		int tempRow = moveRow;
		int tempCol = moveCol;
		char tempGrid[40][40];
        	char tempGridP[40][40];
	
		//Setting tempGrid equal to the normal grid for pathing purposes
		for(int i = 0; i < rows; i++)
        	{
                	for(int j = 0; j< cols; j++)
                	{
                        	tempGrid[i][j] = grid[i][j];
				tempGridP[i][j] = gridP[i][j];
                	}
        	}				

		//Moving and pathing as necessary
		if(moveDir == 0)//^
                {
                        for(int i = 0; i < s; i++)
	     		{
                        	if(!FrontIsClear())
                        	{
                                	moveRow = tempRow;
                                	moveCol = tempCol;
					for(int i = 0; i < rows; i++)
                			{
                        			for(int j = 0; j< cols; j++)
                       				{
                                			grid[i][j] = tempGrid[i][j];
							gridP[i][j] = tempGridP[i][j];
                        			}	
                			}
                                	return false;
                        	}
                        	else
                        	{
                                        if(grid[moveRow][moveCol] == '@' && gridP[moveRow][moveCol] == '@')
                                        {
                                                grid[moveRow][moveCol] = '0';
                                                gridP[moveRow][moveCol] = '0';
                                        }
                                        else
                                        {
                                                grid[moveRow][moveCol] = ' ';
                                                gridP[moveRow][moveCol] = '.';
                                        }
                                	moveRow = moveRow - 1;
					if(grid[moveRow][moveCol] == '0' && gridP[moveRow][moveCol] == '0')
					{
						grid[moveRow][moveCol] = '@';
						gridP[moveRow][moveCol] = '@';
					}
					else
					{
						grid[moveRow][moveCol] = '^';
                                                gridP[moveRow][moveCol] = '^';
					}
                        	}
        	        }
			return true;
                }
                else if(moveDir == 1)//<
                {
                        for(int i = 0; i < s; i++)
                        {
                                if(!FrontIsClear())
                                {
                                        moveRow = tempRow;
                                        moveCol = tempCol;
                                        for(int i = 0; i < rows; i++)
                                        {
                                                for(int j = 0; j< cols; j++)
                                                {
                                                        grid[i][j] = tempGrid[i][j];
                                                        gridP[i][j] = tempGridP[i][j];
                                                }
                                        }
                                        return false;
                                }
                                else
                                {	
                                        if(grid[moveRow][moveCol] == '@' && gridP[moveRow][moveCol] == '@')
                                        {
                                                grid[moveRow][moveCol] = '0';
                                                gridP[moveRow][moveCol] = '0';
                                        }
                                        else
                                        {
                                                grid[moveRow][moveCol] = ' ';
                                                gridP[moveRow][moveCol] = '.';
                                        }
                                        moveCol = moveCol - 1;
                                        if(grid[moveRow][moveCol] == '0' && gridP[moveRow][moveCol] == '0')
                                        {
                                                grid[moveRow][moveCol] = '@';
                                                gridP[moveRow][moveCol] = '@';
                                        }
                                        else
                                        {
                                                grid[moveRow][moveCol] = '<';
                                                gridP[moveRow][moveCol] = '<';
                                        }
                                }
                        }
			return true;			
                }
                else if(moveDir == 2)//v
                {
                	for(int i = 0; i < s; i++)
                	{
                                if(!FrontIsClear())
                                { 
                                        moveRow = tempRow;
                                        moveCol = tempCol;
                                        for(int i = 0; i < rows; i++)
                                        {
                                                for(int j = 0; j< cols; j++)
                                                {
                                                        grid[i][j] = tempGrid[i][j];
                                                        gridP[i][j] = tempGridP[i][j];
                                                }
                                        }
                                        return false;
                                }
                                else
                                {
                                        if(grid[moveRow][moveCol] == '@' && gridP[moveRow][moveCol] == '@')
                                        {
                                                grid[moveRow][moveCol] = '0';
                                                gridP[moveRow][moveCol] = '0';
                                        }
                                        else
                                        {
                                                grid[moveRow][moveCol] = ' ';
                                                gridP[moveRow][moveCol] = '.';
                                        }
                                        moveRow = moveRow + 1;
                                        if(grid[moveRow][moveCol] == '0' && gridP[moveRow][moveCol] == '0')
                                        {
                                                grid[moveRow][moveCol] = '@';
                                                gridP[moveRow][moveCol] = '@';
                                        }
                                        else
                                        {
                                                grid[moveRow][moveCol] = 'v';
                                                gridP[moveRow][moveCol] = 'v';
                                        }
                                }
              		}
			return true;
                }
                else if(moveDir == 3)//>
                {
                	for(int i = 0; i < s; i++)
                	{	
                                if(!FrontIsClear())
                                { 
                                        moveRow = tempRow;
                                        moveCol = tempCol;
                                        for(int i = 0; i < rows; i++)
                                        {
                                                for(int j = 0; j< cols; j++)
                                                {
                                                        grid[i][j] = tempGrid[i][j];
                                                        gridP[i][j] = tempGridP[i][j];
                                                }
                                        }
                                        return false;
                                }
                                else
                                {
					if(grid[moveRow][moveCol] == '@' && gridP[moveRow][moveCol] == '@')
					{
                                        	grid[moveRow][moveCol] = '0';
                                        	gridP[moveRow][moveCol] = '0';
					}
					else
					{
						grid[moveRow][moveCol] = ' ';
                                                gridP[moveRow][moveCol] = '.';	
					}
					moveCol = moveCol + 1;
                                        if(grid[moveRow][moveCol] == '0' && gridP[moveRow][moveCol] == '0')
                                        {
                                                grid[moveRow][moveCol] = '@';
                                                gridP[moveRow][moveCol] = '@';
                                        }
                                        else
                                        {
                                                grid[moveRow][moveCol] = '>';
                                                gridP[moveRow][moveCol] = '>';
                                        }
                                }				
                	}
			return true;
                }
	}	
	else
	{
		return false;
	}
    
}

void Grid::TogglePath()
{
	//Setting path on or off
	if(tp == 1)
	{
		tp--;
	}	
	else if(tp == 0)
	{
		tp++;
	}
}

void Grid::TurnLeft()
{
	//Changing direction value and character if necessary
	if(moveDir == 0)
        {
		if(grid[moveRow][moveCol] != '@' && gridP[moveRow][moveCol] != '@')
        	{
			grid[moveRow][moveCol] = '<';
			gridP[moveRow][moveCol] = '<';
		}
		moveDir = 1;
        }
        else if(moveDir == 1)
        {
                if(grid[moveRow][moveCol] != '@' && gridP[moveRow][moveCol] != '@')
                {   
                	grid[moveRow][moveCol] = 'v';
                	gridP[moveRow][moveCol] = 'v';
		}
		moveDir = 2;
        }
        else if(moveDir == 2)
        {           
		if(grid[moveRow][moveCol] != '@' && gridP[moveRow][moveCol] != '@')
                {   
                	grid[moveRow][moveCol] = '>';
                	gridP[moveRow][moveCol] = '>';
		}
		moveDir = 3;
        }
        else if(moveDir == 3)
        {
                if(grid[moveRow][moveCol] != '@' && gridP[moveRow][moveCol] != '@')
                {   
                	grid[moveRow][moveCol] = '^';
                	gridP[moveRow][moveCol] = '^';
		}
		moveDir = 0;
        }	
}

void Grid::PutDown()
{
	//Placing item on player
	if(grid[moveRow][moveCol] != '@' && gridP[moveRow][moveCol] != '@')	
	{
		grid[moveRow][moveCol] = '@';
                gridP[moveRow][moveCol] = '@';
	}
}

bool Grid::PutDown(int r, int c)
{
	//Checking if spot is empty and placing item properly depending if player is there or not
	if(r < rows && r >= 0 && c < cols && c >= 0)
	{
		if(grid[r][c] != '#' && gridP[r][c] != '#' && grid[r][c] != '0' && gridP[r][c] != '0' && grid[r][c] != '@' && gridP[r][c] != '@')
		{
			if(grid[r][c] == '<' && gridP[r][c] == '<' || grid[r][c] == '>' && gridP[r][c] == '>' || grid[r][c] == '^' && gridP[r][c] == '^' || grid[r][c] == 'v' && gridP[r][c] == 'v')
			{
				grid[r][c] = '@';
				gridP[r][c] = '@';
				return true;
			}
			else if(grid[r][c] == '.' && gridP[r][c] == '.' || grid[r][c] == ' ' && gridP[r][c] == '.')
			{
				grid[r][c] = '0';
				gridP[r][c] = '0';
				return true;
			}
		}
	}
	else
	{
		return false;
	}
}

bool Grid::PickUp()
{
	//Verifying there is an item to pickup and picking up as necessary
	if(grid[moveRow][moveCol] == '@' && gridP[moveRow][moveCol] == '@')
	{
		if(moveDir == 0)
                {                                        
			grid[moveRow][moveCol] = '^';
                        gridP[moveRow][moveCol] = '^';
			return true;
                }
                else if(moveDir == 1)
                {
                        grid[moveRow][moveCol] = '<';
                        gridP[moveRow][moveCol] = '<';
                        return true;
                }                            
		else if(moveDir == 2)
                {                                        
			grid[moveRow][moveCol] = 'v';
                        gridP[moveRow][moveCol] = 'v';
                        return true;
                }
                else if(moveDir == 3)                                
		{
                        grid[moveRow][moveCol] = '>'; 
                        gridP[moveRow][moveCol] = '>';
                        return true;                               
		}
	}	
	else
	{
		return false;
	}
}

bool Grid::PlaceBlock(int r, int c)
{
	//Checking user input
	if(r < rows && r >= 0 && c < cols && c >= 0)
        {       
		//Verifying space is empty to place block
                if(grid[r][c] != '#' && gridP[r][c] != '#' && grid[r][c] != '0' && gridP[r][c] != '0' && grid[r][c] != '@' && gridP[r][c] != '@' || grid[r][c] != '<' && gridP[r][c] != '<' || grid[r][c] != '>' && gridP[r][c] != '>' || grid[r][c] != '^' && gridP[r][c] != '^' || grid[r][c] != 'v' && gridP[r][c] != 'v') 
                {
			grid[r][c] = '#';
                        gridP[r][c] = '#';
                        return true;
		}
	}
        else
        {
                return false;
        } 	
}

void Grid::Grow(int gr, int gc)
{
	//Checking user input and setting as necessary
        if(gr+rows > 40)
        {       
                rows = 40;
        }
        else
        {       
                rows = rows + gr;
        }

        //Checking user input and setting as necessary
        if(gc+cols > 40)
        {       
                cols = 40;
        }
        else
        {       
                cols = cols + gc;
        }	
}

void Grid::Display() const
{
	//Printing grid
	cout<<"The Grid: "<<endl;
	
	//Checking which board to print and printing as necessary
	if(tp == 1)
	{
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				cout<<grid[i][j]<<" ";
			}
			cout<<endl;
		}
	}
	else if(tp == 0)
	{
		for(int i = 0; i < rows; i++)
                {
                        for(int j = 0; j < cols; j++)
                        {
                                cout<<gridP[i][j]<<" ";
                        }
                        cout<<endl;
                }
	}
}

bool Grid::FrontIsClear() const
{
	if(moveDir == 0)//North
	{
		if(grid[moveRow-1][moveCol] != '#' && moveRow-1 >= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	else if(moveDir == 1)//West
	{
                if(grid[moveRow][moveCol-1] != '#' && moveCol-1 >= 0)
                {
                        return true;
                }
                else
                {
                        return false;
                }	
	}
	else if(moveDir == 2)//South
	{
                if(grid[moveRow+1][moveCol] != '#' && moveRow+1 <= rows-1)
                {
                        return true;
                }
                else
                {
                        return false;
                }		
	}
	else if(moveDir == 3)//East
	{
                if(grid[moveRow][moveCol+1] != '#' && moveCol+1 <= cols-1)
                {
                        return true;
                }
                else
                {
                        return false;
                }		
	}
}

bool Grid::RightIsClear() const
{
	if(moveDir == 0)//North
        {
                if(grid[moveRow][moveCol+1] != '#' && moveRow-1 >= 0)
                {
                        return true;
                }
                else
                {
                        return false;
                }
        }
        else if(moveDir == 1)//West
        {
                if(grid[moveRow-1][moveCol] != '#' && moveCol-1 >= 0)
                {
                        return true;
                }
                else
                {
                        return false;
                }
        }
        else if(moveDir == 2)//South
        {
                if(grid[moveRow][moveCol-1] != '#' && moveRow+1 <= rows-1)
                {
                        return true;
                }
                else
                {
                        return false;
                }
        }
        else if(moveDir == 3)//East
        {
                if(grid[moveRow+1][moveCol] != '#' && moveCol+1 <= cols-1)
                {
                        return true;
                }
                else
                {
                        return false;
                }
        }	
}

//Do you really need me to explain these? lolllll
int Grid::GetRow() const
{
	return moveRow;
}

int Grid::GetCol() const
{
	return moveCol;	
}

int Grid::GetNumRows() const
{
	return rows;	
}

int Grid::GetNumCols() const
{
	return cols;	
}
