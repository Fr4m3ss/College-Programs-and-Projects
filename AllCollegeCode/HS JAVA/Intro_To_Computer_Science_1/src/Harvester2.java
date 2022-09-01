import kareltherobot.*;

class Harvester2 extends UrRobot {
	// constructor
	public Harvester2(int street, int avenue, Direction direction,
			int howmany) {
		super(street, avenue, direction, howmany);
	}

	// insert methods here
void diagonalPick()
{
	move();
    pickBeeper();
	move();
	turnLeft();
	move();
	pickBeeper();
	move();
}
void pickRow()
{
	move();
	pickBeeper();
	move();
	move();
	pickBeeper();
	move();
	move();
	pickBeeper();
	move();
	move();
	pickBeeper();
}
}
