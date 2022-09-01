//Frankie Messina~Framess
import kareltherobot.*;

class RoomBot extends Robot {
	// constructor
	public RoomBot(int street, int avenue, Direction direction,
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
	void roomBeeper()
	{
		if(rightIsBlocked())
		{
			if(leftIsBlocked())
			{
				if(!frontIsClear())
				{
					putBeeper();
				}
			}
		}
	}
	void roomMile()
	{
	move();
	turnLeft();
	move();
	roomBeeper();
	turnLeft();
	turnLeft();
	move();
    turnLeft();
    //
    move();
	turnLeft();
	move();
	roomBeeper();
	turnLeft();
	turnLeft();
	move();
    turnLeft();
    //
    move();
	turnLeft();
	move();
	roomBeeper();
	turnLeft();
	turnLeft();
	move();
    turnLeft();
    //
    move();
	turnLeft();
	move();
	roomBeeper();
	turnLeft();
	turnLeft();
	move();
    turnLeft();
    //
    move();
	turnLeft();
	move();
	roomBeeper();
	turnLeft();
	turnLeft();
	move();
    turnLeft();
    //
    move();
	turnLeft();
	move();
	roomBeeper();
	turnLeft();
	turnLeft();
	move();
    turnLeft();
    //
    move();
	turnLeft();
	move();
	roomBeeper();
	turnLeft();
	turnLeft();
	move();
    turnLeft();
    //
    move();
	turnLeft();
	move();
	roomBeeper();
	turnLeft();
	turnLeft();
	move();
    turnLeft();
    
    
	}
}

	


	

	

