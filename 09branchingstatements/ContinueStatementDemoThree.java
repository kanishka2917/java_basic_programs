class ContinueStatementDemoThree
{
    public static void main (String args[])
    {
    	System.out.println("## start of nested loop ##");
	    outer: for (int i = 0; i < 3; i ++ )
    	  {
	        System.out.println("-- inside outer loop --");
	 
	        inner : for (int j = 3; j > 0; j -- )
	          { 
				if (i == j)
				{
					continue;
				}
		        System.out.println("** inside inner loop **");
              }
            System.out.println("<-- outside inner loop -->");
	       }
	     System.out.println("## end of nested loops ##");
    }  
}