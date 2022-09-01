

import kareltherobot.*;

public class Window implements Directions {

	public static void task() {
		WindowBot Framess = new WindowBot(2,2,North,infinity); 
		Framess.windowBuild();

}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(1);
		 World.readWorld("worlds/windowman.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

