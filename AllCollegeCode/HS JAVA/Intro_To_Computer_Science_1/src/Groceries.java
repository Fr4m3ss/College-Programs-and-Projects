

import kareltherobot.*;

public class Groceries implements Directions {

	public static void task() {
		UrRobot Framess = new UrRobot(5,7,East,10); 
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.pickBeeper();
		Framess.move();
		Framess.pickBeeper();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.pickBeeper();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.pickBeeper();
		Framess.move();
		Framess.move();
		Framess.turnOff();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(15);
		 World.readWorld("worlds/world27.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

