import kareltherobot.*;

class Demo extends Robot {
	// constructor
	public Demo(int street, int avenue, Direction direction,
			int howmany) {
		super(street, avenue, direction, howmany);
	}

	// insert methods here
    void turnRight()
    {
    	turnLeft();
    	turnLeft();
    	turnLeft();
    }
	boolean leftIsBlocked()
	{
		turnLeft();
		if (!frontIsClear())
		{
			turnRight();
			return true;
		
		}
		{
			turnRight();
			return false;
		}
	}
		void moveMile()
		{
		move();	
		move();
		move();
		move();
		move();
		move();
		move();
		move();
	}
		void upAndOver()
		{
			turnLeft();
			move();
			turnRight();
			move();
			turnRight();
		    move();
		}
		boolean rightIsBlocked()
		{
			turnRight();
			if (!frontIsClear())
			{
				turnLeft();
				return true;
			
			}
			{
				turnLeft();
				return false;
			}
		}
}
