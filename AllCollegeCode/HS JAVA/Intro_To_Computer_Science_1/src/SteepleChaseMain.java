//Frankie Messina~Framess

import kareltherobot.*;

public class SteepleChaseMain implements Directions {

	public static void task() {
		SteepleChaseBot Framess = new SteepleChaseBot(1,1,East,10); 
		Framess.steepleJump();
		Framess.steepleJump();
		Framess.steepleJump();
		Framess.steepleJump();
		Framess.steepleJump();
		Framess.steepleJump();
		Framess.steepleJump();
		Framess.steepleJump();
		Framess.steepleJump();
		
		
		
	}
      
	// Main entry point
	static public void main(String[] args) {
		World.setDelay(25);
		 World.readWorld("worlds/steeple1.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

