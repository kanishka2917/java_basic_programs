class BreakStatementDemoTwo
{
    public static void main (String args[])
  {
	 int p = 1;
	 switch (p)
	 {
	  case 1: System.out.println("inside class 1");
	          break;
      
	  case 2: System.out.println("Inside class 2");
	          break;
      
	  case 3: System.out.println("Inside class 3");
	          break;

	 
	  default : System.out.println("inside default case");
     }
     System.out.println("outside switch case");
  } 
}