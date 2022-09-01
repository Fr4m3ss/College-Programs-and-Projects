     // Frankie Messina ~ Framess
import kareltherobot.*;

class PinSetterBot extends UrRobot {
	// constructor
	public PinSetterBot(int street, int avenue, Direction direction,
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
}
