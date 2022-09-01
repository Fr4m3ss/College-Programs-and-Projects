//Francesco Messina, Fraction, Assignment 2, Advanced Java
// Class Fraction

class Fraction
{
  private int numerator = 0;		// numerator (and keeps sign)
  private int denominator = 1;		// always stores positive value

  public Fraction()
  {

  }

  public Fraction(int n)
  {
    this(n,1);
  }

  public Fraction(int n, int d)
  {
    if (set(n,d)==false)
	set(0,1);
  }

  public boolean set(int n, int d)
  {
    if (d > 0)
    {
	numerator = n;
	denominator = d;
	return true;
    }
    else
	return false;
  }
  
  public void show()
  {
    System.out.print(numerator + "/" + denominator);
  }

  public String toString()
  {
    return (numerator + "/" + denominator);
  }

  public int getNumerator()
  {
    return numerator;
  }

  public int getDenominator()
  {
    return denominator;
  }

  public double decimal()
  {
    return (double)numerator / denominator;
  }

  //MY ADDITIONS---------------------------------------------------------------------------------------------	
  public Fraction simplify()
  {
  	    Fraction result = new Fraction();
	    result.numerator = this.numerator;
	    result.denominator = this.denominator;
	    int gcd;

  	    if(result.numerator != 0)
	    {
	    	if(result.numerator < 0)
		{
			gcd = result.numerator * -1;
		}
		else
		{
	    		gcd = result.numerator;
		}
	    	while(gcd>1 && (result.numerator % gcd != 0 || result.denominator % gcd != 0))
	   		{
	    		gcd --; 
	   		}

		result.numerator /=gcd;
		result.denominator /=gcd;
	    }
	    if(denominator<0)
	    {
	    	result.numerator = -result.numerator;
	    	result.denominator = -result.denominator;
	    }
	    if(numerator == 0)
	    {
	    	result.numerator = 0;
		result.denominator = 1;
            }	
	    return result;
  }

  public Fraction add(Fraction f)
  {
	    Fraction result = new Fraction();
            
	    result.numerator = (this.numerator * f.denominator + f.numerator * this.denominator);
	    result.denominator = (this.denominator * f.denominator);
  	    
	    return result.simplify();
  }

  public Fraction subtract(Fraction f)
  {
            Fraction result = new Fraction();
           
  	    result.numerator = (this.numerator * f.denominator - f.numerator * this.denominator );
	    result.denominator = (this.denominator * f.denominator);	

	    return result.simplify();
  }

  public Fraction multiply(Fraction f)
  {
            Fraction result = new Fraction();
            
  	    result.numerator = (this.numerator * f.numerator);
	    result.denominator = (this.denominator * f.denominator);	
  
  	    return result.simplify();
  }

  public Fraction divide(Fraction f)
  {
            Fraction result = new Fraction();

	    if(f.numerator == 0)
	    {
	    	result.numerator = 0;
		result.denominator = 1;
	    	return result;
	    }
	    else
	    {
	    	result.numerator = (this.numerator * f.denominator);
	    	result.denominator = (this.denominator * f.numerator);
	    }

	    return result.simplify();
  }

  //--------------------------------------------------------------------------------------------------------
  // more features? -- think some up and add them!

  // sample test program
  public static void main(String[] args)
  {
    Fraction f1, f2;
    f1 = new Fraction();
    f2 = new Fraction(3, 5);

    System.out.print("\nFraction f1 = ");
    f1.show();
    System.out.print("\nFraction f2 = " + f2);	// uses toString

    System.out.println("\nCalling f1.set(11,14)");
    if (f1.set(11,14) == false)
	System.out.println("** set attempt failed");
    System.out.println("\nCalling f2.set(4,0)");
    if (!f2.set(4,0))
	System.out.println("** set attempt failed");

    System.out.print("\nFraction f1 = ");
    f1.show();
    System.out.print("\nFraction f2 = ");
    f2.show();

    System.out.println("\nDecimal value of f1 = " + f1.decimal());
    System.out.println("Decimal value of f2 = " + f2.decimal());
  }  

}
