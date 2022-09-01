

import kareltherobot.*;

class Hurdle extends Robot {
	// constructor
	public Hurdle(int street, int avenue, Direction direction,
			int howmany) {
		super(street, avenue, direction, howmany);
	}

	// insert methods here
	void turnRight()
	{
		turnLeft();
		turnLeft();
		turnLeft();
		
	}
	boolean rightIsBlocked()
	{
		turnRight();
		if (!frontIsClear())
		{
			turnLeft();
			return false;
		}
		else
		{
			turnLeft();
			return true;
		}
	}
	boolean leftIsBlocked()
		{
			turnLeft();
			if (!frontIsClear())
			{
				turnRight();
				return false;
			}
			else
			{
				turnRight();
				return true;
			}
	}
	             //M E M E                                  //M E M E
	        //M E M E //M E M E                        //M E M E //M E M E
	      //M E M E     //M E M E                    //M E M E     //M E M E
	    //M E M E         //M E M E                //M E M E         //M E M E
	  //M E M E             //M E M E            //M E M E             //M E M E
	//M E M E                 //M E M E        //M E M E                 //M E M E
  //M E M E                     //M E M E    //M E M E                     //M E M E
//M E M E                         //M E M E//M E M E                         //M E M E
	void over()
    {
    	turnLeft();
    	if (!rightIsBlocked())
    	{
    	move();
    	}
        move();
        turnRight();
        move();
        turnRight();
        move();
        if (!frontIsClear())
        {
        	move();
        }
        turnLeft();       
    	
    }
    void hurdle() 
    {
    	
		
    }
}