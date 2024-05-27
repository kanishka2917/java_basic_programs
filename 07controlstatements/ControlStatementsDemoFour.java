class ControlStatementsDemoFour
{
	public static void main (String args[])
	{
		int p = 4;
		switch (p)
		{
			case 1: System.out.println("inside case 1");
			        System.out.println("2nd statement");
			        System.out.println("3rd statement");
					break;

            case 2: System.out.println("inside case 2");
			        break;

	    	case 3: System.out.println("inside case 3");
			        break;

		   	case 4: System.out.println("inside case 4");
			        break;

            default: System.out.println("inside default class");
		}
	System.out.println("outside switchcase");
	}
}