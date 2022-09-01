

import kareltherobot.*;

public class Mountain implements Directions {

	public static void task() {
		UrRobot Framess = new UrRobot(1,1,North,10); 
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.putBeeper();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(15);
		 World.readWorld("worlds/world26.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

