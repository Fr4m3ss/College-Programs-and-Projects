import kareltherobot.*;

class ROGERROGERBOT extends Robot {
	// constructor
	public ROGERROGERBOT(int street, int avenue, Direction direction,
			int howmany) {
		super(street, avenue, direction, howmany);
	}

	// insert methods here
	void rowBeeperWhile()
	{
	while(frontIsClear())
	{
		while(nextToABeeper())
	{
	pickBeeper();
	}
	move();
	}
	}
	void findBeeper()
	{
		while (frontIsClear())
		{
			move();
			if(nextToABeeper())
			{
			pickBeeper();
			turnOff();
			}
			else
			{
			if (!frontIsClear())
			{
				turnLeft();
			}
			}
		}

	}
}
