class ControlStatementsDemoTwo
{
	public static void main (String args[])
	{
		int a = 15;
		int b = 17;
		int c = 18;
		int d = 17;
		
		if (a <+ b)
		{ 
			System.out.println("inside if");

		}
		else
		{ 
	     	 System.out.println("inside else");
		}
		System.out.println("outside if/else");
	}
}