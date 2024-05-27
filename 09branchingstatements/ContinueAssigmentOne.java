class ContinueAssigmentOne
{
	public static void main (String args[])
	{ 
		int z[] = { 24, 35, 48, 56, 78, 81, 22, 31, 18};
		
		int evenSum = 0;
        for (int a : z)
		{
		  if ((a % 2) == 0)continue;
		  evenSum += a;
		}
       System.out.println("the sum of even integers is : " + evenSum);
    }
}