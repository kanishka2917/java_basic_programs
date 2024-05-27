class ContinueStatementDemoTwo
{
    public static void main (String args[])
     {
	   int i = 0;
	   while (i < 10)
	   {
	    if ((i % 2) == 0)
		   {
		     i++;
		     continue;
		   }
	    System.out.println("hello: "+ i);
	    i++;
	   }
     }
}