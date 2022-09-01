
//Frankie Messina~Framess
import kareltherobot.*;

public class Room implements Directions {

	public static void task() {
		RoomBot Framess = new RoomBot(1,1,East,10); 
		Framess.roomMile();
		
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		 World.readWorld("worlds/carpetsmall.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

