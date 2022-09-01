

import kareltherobot.*;

public class ROGERROGER implements Directions {

	public static void task() {
		ROGERROGERBOT Framess = new ROGERROGERBOT(5,1,South,10);
         Framess.findBeeper ();
}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		World.placeBeepers(5,5,1);
		World.readWorld("Worlds/world.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

