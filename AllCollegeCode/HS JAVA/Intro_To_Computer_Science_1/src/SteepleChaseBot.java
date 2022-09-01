//Frankie Messina~Framess
import kareltherobot.*;

class SteepleChaseBot extends Robot {
	// constructor
	public SteepleChaseBot(int street, int avenue, Direction direction,
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
		if (frontIsClear())
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
				return true;
			}
			else
			{
				turnRight();
				return false;
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
    	move();
    	if (rightIsBlocked())
    	{
    	move();
    	}
    	if (rightIsBlocked())
    	{
    	move();
    	}
        turnRight();
        move();
        turnRight();
        move();
        if (frontIsClear())
        {
        	move();
        } 
        if (frontIsClear())
        {
        	move();
        } 
        if(facingSouth())
        {
        	turnLeft();    
        }  
    	
    }
    void steepleJump()
    {
    
      	if (frontIsClear())
		{
    		move();
		}
		else
		{
			over();
		}
    }
}


