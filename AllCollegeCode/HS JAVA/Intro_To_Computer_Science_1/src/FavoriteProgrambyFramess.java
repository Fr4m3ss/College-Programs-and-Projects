

import kareltherobot.*;

public class FavoriteProgrambyFramess implements Directions {

	public static void task() {
		UrRobot Framess = new UrRobot(1,1,East,1);
		UrRobot Zoat = new UrRobot(5,5,East,1);
		UrRobot Lish = new UrRobot(3,3,East,1);
		UrRobot Gigi = new UrRobot(7,7,East,1);
		Framess.move();
		Zoat.move();
		Lish.move();
		Gigi.move();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.move();
		Zoat.move();
		Lish.move();
		Gigi.move();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.putBeeper();
		Zoat.putBeeper();
		Lish.putBeeper();
		Gigi.putBeeper();
		Framess.move();
		Zoat.move();
		Lish.move();
		Gigi.move();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.move();
		Zoat.move();
		Lish.move();
		Gigi.move();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.pickBeeper();
		Zoat.pickBeeper();
		Lish.pickBeeper();
		Gigi.pickBeeper();
		Framess.move();
		Zoat.move();
		Lish.move();
		Gigi.move();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.move();
		Zoat.move();
		Zoat.move();
		Zoat.move();
		Zoat.move();
		Zoat.move();
		Lish.move();
		Lish.move();
		Lish.move();
		Gigi.move();
		Gigi.move();
		Gigi.move();
		Gigi.move();
		Gigi.move();
		Gigi.move();
		Gigi.move();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.turnLeft();
		Zoat.turnLeft();
		Lish.turnLeft();
		Gigi.turnLeft();
		Framess.turnOff();
		Zoat.turnOff();
		Lish.turnOff();
		Gigi.turnOff();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		// World.readWorld("fivehurdle.txt");
		World.setVisible();
		task();
	}
}

