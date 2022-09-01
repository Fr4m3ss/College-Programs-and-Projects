

import kareltherobot.*;

public class Tester implements Directions {

	public static void task() {
		MyRobot Framess = new MyRobot(1,20,North,10); 
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnRight();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.moveMile();
		Framess.moveMile();
		Framess.turnLeft();
		Framess.moveSquare();
		Framess.moveSquare();
		Framess.moveSquare();
		Framess.moveSquare();
		Framess.moveSquare();
		Framess.moveSquare();
		Framess.putBeeperSquare(); 
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(10);
		// World.readWorld("fivehurdle.txt");
		World.setVisible();
		World.setSize(20,20);
		task();
	}
}

