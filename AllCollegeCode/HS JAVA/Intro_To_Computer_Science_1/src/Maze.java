

import kareltherobot.*;

public class Maze implements Directions {

	public static void task() {
		MazeBot Framess = new MazeBot(1,1,East,10); 
		Framess.solveMaze();
}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(1);
		 World.readWorld("worlds/maze.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

