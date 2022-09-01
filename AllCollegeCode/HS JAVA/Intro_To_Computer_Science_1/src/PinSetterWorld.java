

import kareltherobot.*;

public class PinSetterWorld implements Directions {

	public static void task() {
		PinSetterBot Framess = new PinSetterBot(1,5,North,infinity); 
		Framess.move();
		Framess.putBeeper();
		Framess.move();
		Framess.move();
		Framess.putBeeper();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.putBeeper();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.putBeeper();
		Framess.move();
		Framess.move();
		Framess.putBeeper();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.putBeeper();
		Framess.turnRight();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.putBeeper();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.putBeeper();
		Framess.move();
		Framess.move();
		Framess.putBeeper();
		Framess.move();
		Framess.move();
		Framess.putBeeper();
		Framess.turnRight();
		Framess.move();
		Framess.turnRight();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.turnRight();
		Framess.turnOff();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		// World.readWorld("fivehurdle.txt");
		World.setVisible();
		World.setSize(10,10);
		task();
	}
}

