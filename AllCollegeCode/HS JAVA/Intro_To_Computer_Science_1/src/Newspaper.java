

import kareltherobot.*;

public class Newspaper implements Directions {

	public static void task() {
		UrRobot Framess = new UrRobot(3,4,East,10); 
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.pickBeeper();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.turnOff();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(15);
		 World.readWorld("worlds/world25.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

