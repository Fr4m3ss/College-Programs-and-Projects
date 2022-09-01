

import kareltherobot.*;

public class Main implements Directions {

	public static void task() {
		MyRobot Framess = new MyRobot(1,1,North,10); 
		
		Framess.move_kilo_mile(1000);
		
		
		
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

