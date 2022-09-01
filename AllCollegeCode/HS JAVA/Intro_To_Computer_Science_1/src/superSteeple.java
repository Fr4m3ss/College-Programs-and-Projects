import kareltherobot.*;

public class superSteeple implements Directions {

	public static void task() {
		superSteepleBot Framess = new superSteepleBot(1,1,East,infinity); 
		Framess.steepleJump();

}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(1);
		 World.readWorld("worlds/sixsupersteeple11.txt");
		World.setVisible();
		World.setSize(12,24);
		task();
	}
}

