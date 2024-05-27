class MethodInvocationDemoOne
{
	static int add (int a, int b)
	{
		int c = a + b;
		return c;
	}
	public static void main (String args [])
	{                               	 
		int result = add (55, 65);
		System.out.println("sum of 55 and 65 is :" + result);
		System.out.println("sum of 5 and 2 is :" + add (5, 2));
	}
}