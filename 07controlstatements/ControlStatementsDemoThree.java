class ControlStatementsDemoThree
{
	public static void main (String args[])
	{
		int p = 1;
		
		if (p == 0)
		{
			System.out.println ("value of p = 0");
		}
		else if (p == 1)
		{
			System.out.println ("value of p = 1");
		}
		else if (p == 5)
		{
			System.out.println ("value of p = 5");
		}
		else
		{
			System.out.println ("value of p is not 0, 1 or 5");
		}
		System.out.println("end of if/else chain");
	}
}