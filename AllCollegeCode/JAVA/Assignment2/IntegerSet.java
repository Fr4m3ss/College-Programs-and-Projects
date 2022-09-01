//Francesco Messina, Integer Set, Assignment 2, Advanced Java
//Class IntegerSet

class IntegerSet
{
	private boolean [] set = new boolean[101];

	public IntegerSet()
	{
		for(int i = 0; i < 101; i++)
		{
			set[i] = false;
		}
	}

	public IntegerSet union(IntegerSet iSet)
	{
		IntegerSet setUnion = new IntegerSet();
		
		for(int i = 0; i < 101; i++)
		{
			if(this.set[i] == true || iSet.set[i] == true)
			{
				setUnion.set[i] = true;
			}
			else
			{
				setUnion.set[i] = false;
			}	
		}
		
		return setUnion;
	}

	public IntegerSet intersection(IntegerSet iSet)
	{
		IntegerSet setUnion = new IntegerSet(); 
		
		for(int i = 0; i < 101; i++)
		{
			if(this.set[i] == true && iSet.set[i] == true)
			{
				setUnion.set[i] = true;
			}
			else
			{
				setUnion.set[i] = false;
			}
		}

		return setUnion;
	}

	public IntegerSet insertElement(int data)
	{
		set[data] = true;
		return this;
	}

	public IntegerSet deleteElement(int data)
	{
		set[data] = false;
		return this;
	}

	public boolean isEqualTo(IntegerSet iSet)
	{
		for(int i = 0; i < 101; i++)
		{
			if(this.set[i] != iSet.set[i])
			{
				return false;
			}
		}
		return true;
	}

	public String toString()
	{
		String result = "";
		boolean empty = true;
		for(int i = 0; i < 101; i++)
		{
			if(this.set[i] == true)
			{
				empty = false;
			}
		}
		if(empty == false)
		{
			for(int i = 0; i < 101; i++)
			{
				if(this.set[i] == true)
				{
					result += i;
					result += " ";
				}
			}
		}
		else
		{
			return "----";
		}

	 	return result;
	}

}
