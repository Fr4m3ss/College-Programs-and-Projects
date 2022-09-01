

import kareltherobot.*;

public class HarvesterWorld implements Directions {

	public static void task() {
		MyRobot Framess = new MyRobot(1,1,North,10); 
		Framess.turnRight();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.harvestSix();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnRight();
		Framess.harvestSix();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.harvestSix();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnRight();
		Framess.harvestSix();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.harvestSix();
		Framess.move();
		Framess.turnOff();
		MyRobot Framess2 = new MyRobot(5,4,East,infinity); 
		Framess2.moveBigSquareBeeper();
		Framess2.move();
		Framess2.move();
		Framess2.turnLeft();
		Framess2.move();
		Framess2.move();
		Framess2.turnOff();
		MyRobot Framess3 = new MyRobot(7,7,North,infinity);
		Framess3.turnOff();
		MyRobot Framess5 = new MyRobot(8,6,North,infinity);
		Framess5.turnOff();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		 World.readWorld("worlds/harvest.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

