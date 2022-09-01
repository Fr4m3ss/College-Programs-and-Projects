//Frankie Messina~Framess
import kareltherobot.*;

class FollowBot extends Robot {
	// constructor
	public FollowBot(int street, int avenue, Direction direction,
			int howmany) {
		super(street, avenue, direction, howmany);
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

	
	void follow()
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
			}
		}
	}

}

    
    



	


	

	

