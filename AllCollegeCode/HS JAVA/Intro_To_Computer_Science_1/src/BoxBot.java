//Frankie MEssina ~ Framess

import kareltherobot.*;

public class BoxBot implements Directions {

	public static void task() {
		MyRobot Framess = new MyRobot(1,1,East,infinity); 
	Framess.moveBigSquareBeeper();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		// World.readWorld("fivehurdle.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

