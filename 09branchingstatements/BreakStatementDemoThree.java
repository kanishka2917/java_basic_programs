class BreakStatementDemoThree
{
    public static void main (String args[])
  {
	System.out.println("## start of nested loop ##");
	  for (int i = 0; i < 3; i ++ )
	  {
	    System.out.println("-- inside for loop --");
	    int j = 3;
	 
		while (j > 0)
	    {
		  if (i == j)
		  {
			  break;
		  }
		 System.out.println("** inside while loop **");
		 j --;
		}
       System.out.println("<-- outside while loop -->");
	  }
	  System.out.println("## end of nested loops ##");
  }  
}