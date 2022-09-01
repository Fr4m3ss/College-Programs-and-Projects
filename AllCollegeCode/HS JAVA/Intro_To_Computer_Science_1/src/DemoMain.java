

import kareltherobot.*;

public class DemoMain implements Directions {

	public static void task() {
		Demo Framess = new Demo(1,1,East,infinity); 
		Framess.move();
		if (Framess.leftIsBlocked());
		{
		Framess.turnRight();
		}
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		 World.readWorld("worlds/maze.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

