//Frankie Messina~Framess

import kareltherobot.*;

public class SteepleChaseRoom implements Directions {

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
		World.setDelay(5);
		 World.readWorld("worlds/steeple2.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}