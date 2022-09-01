

import kareltherobot.*;

public class HurdleMain implements Directions {

	public static void task() {
		Hurdle Framess = new Hurdle(1,1,East,10); 
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
		Framess.hurdle();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		 World.readWorld("worlds/hurdle.txt");
		World.setVisible();
		World.setSize(15,15);
		World.placeNSWall(1, 2, 2);
		task();
	}
}

