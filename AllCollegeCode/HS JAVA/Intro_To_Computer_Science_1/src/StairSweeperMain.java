

import kareltherobot.*;

public class StairSweeperMain implements Directions {

	public static void task() {
		MyRobot Framess = new MyRobot(1,1,East,10); 
		Framess.climbStair();
		Framess.pickBeeper();
		Framess.climbStair();
		Framess.pickBeeper();
		Framess.climbStair();
		Framess.pickBeeper();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.turnOff();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(15);
		World.readWorld("worlds/stairs.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

