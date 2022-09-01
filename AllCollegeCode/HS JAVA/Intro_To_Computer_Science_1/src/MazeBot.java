import kareltherobot.*;

class MazeBot extends Robot {
	// constructor
	public MazeBot(int street, int avenue, Direction direction,
			int howmany) {
		super(street, avenue, direction, howmany);
	}

	// insert methods here
void solveMaze()
{
	{
	while(rightIsBlocked())
	{
		if(rightIsBlocked())
		{
			if (!frontIsClear())
			{
				turnLeft();
			}
			else
			{
				move();
				if(!rightIsBlocked())
				{
					turnRight();
					move();
				}
				if(!rightIsBlocked())
				{
					turnRight();
					move();
				}
				if(nextToABeeper())
				{
					pickBeeper();
					turnOff();
				}

			}
		}
	}
	}
}
	
	
	
	

void turnRight()
{
	turnLeft();
	turnLeft();
	turnLeft();
}

boolean rightIsBlocked()
{
	turnRight();
	if (frontIsClear())
	{
		turnLeft();
		return false;
	}
	else
	{
		turnLeft();
		return true;
	}
}
boolean leftIsBlocked()
	{
		turnLeft();
		if (!frontIsClear())
		{
			turnRight();
			return true;
		}
		else
		{
			turnRight();
			return false;
		}
}



}
