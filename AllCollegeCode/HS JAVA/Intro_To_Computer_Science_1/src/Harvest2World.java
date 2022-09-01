      // Frankie Messina ~ Framess
     // Mod 3

import kareltherobot.*;

public class Harvest2World implements Directions {

	public static void task() {
		Harvester2 Framess = new Harvester2(1,6,North,infinity); 
		Framess.pickRow();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.move();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.pickBeeper();
		Framess.move();
		Framess.move();
		Framess.pickBeeper();
		Framess.move();
		Framess.move();
		Framess.pickBeeper();
		Framess.move();
		Framess.move();
		Framess.pickBeeper();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.turnLeft();
		Framess.pickBeeper();
		Framess.move();
		Framess.turnLeft();
		Framess.move();
		Framess.pickBeeper();
		Framess.move();
		Framess.diagonalPick();
		Framess.diagonalPick();
		Framess.diagonalPick();
		Framess.turnOff();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		 World.readWorld("worlds/harvest2.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

