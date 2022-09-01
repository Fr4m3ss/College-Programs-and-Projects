

import kareltherobot.*;

public class Follow implements Directions {

	public static void task() {
		FollowBot a = new FollowBot(7,2,North,10);
		FollowBot b = new FollowBot(2,7,North,10);
		FollowBot c = new FollowBot(2,2,North,10);
		FollowBot d = new FollowBot(7,7,North,10);
        a.follow();
        b.follow();
        c.follow();
        d.follow();
      
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(5);
		 World.readWorld("worlds/follow.txt");
		World.setVisible();
		World.setSize(11,10);
		task();
	}
}

