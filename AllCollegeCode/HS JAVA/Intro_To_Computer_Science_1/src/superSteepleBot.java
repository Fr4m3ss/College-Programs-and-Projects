import kareltherobot.*;

class superSteepleBot extends Robot {
	// constructor
	public superSteepleBot(int street, int avenue, Direction direction,
			int howmany) {
		super(street, avenue, direction, howmany);
	}

	// insert methods here
    void steepleJump()
    {
    	while(rightIsBlocked())
    	{
    		while(frontIsClear())
    		{
    			if(frontIsClear())
    			{
    				move();
    				if (nextToABeeper())
    				{
    				pickBeeper();
    				turnOff();
    				}
    			}
    		}
    	    turnLeft();
			while(rightIsBlocked())
			{
				move();
			}
			turnRight();
			move();
			while(rightIsBlocked())
			{
				move();
			}
			turnRight();
			while(frontIsClear())
			{
				move();
			}
			turnLeft();
			
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
