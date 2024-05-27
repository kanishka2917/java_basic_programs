class CommandLineDemoOne
{
	public static void main (String args[])
	{
		System.out.println("input no.1 : " + args[0]);
	    System.out.println("input no.2 : " + args[1]);
		System.out.println("input no.3 : " + args[2]);
		 
        String s = args[0] + args[1] + args[2];
		System.out.println(s);
	}
}