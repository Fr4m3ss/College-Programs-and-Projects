

import kareltherobot.*;

public class Carpet implements Directions {

	public static void task() {
		CarpetBot Framess = new CarpetBot(4,2,East,infinity); 
		Framess.carpetDone();
}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		World.readWorld("worlds/sixcarpet9.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

