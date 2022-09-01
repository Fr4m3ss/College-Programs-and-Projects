// Frankie Messina ~ Framess
import kareltherobot.*;

class MyRobot extends UrRobot {
	// constructor
	public MyRobot(int street, int avenue, Direction direction,
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
void moveSquare()
{
	move();
	turnLeft();
	move();
	turnLeft();
	move();
	turnLeft();
	move();
	turnLeft();
}
void putBeeperSquare()
{
	move();
	putBeeper();
	turnLeft();
	move();
	putBeeper();
	turnLeft();
	move();
	putBeeper();
	turnLeft();
	move();
	putBeeper();
	turnLeft();
}
void moveBigSquareBeeper()
{
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	turnLeft();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	turnLeft();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	turnLeft();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	move();
	putBeeper();
	turnLeft();
}
void climbStair()
{
	turnLeft();
	move();
	turnRight();
	move();
}
void harvestSix()
{
	move();
	pickBeeper();
	move();
	pickBeeper();
	move();
	pickBeeper();
	move();
	pickBeeper();
	move();
	pickBeeper();
	move();
	pickBeeper();
}
void move_kilo_mile(int x)
{
	int c = 0;
	while (c != x)
		{
		move();
		move();
		move();
		move();
		move();
		move();
		move();
		move();
		c++;
		}
}
}
