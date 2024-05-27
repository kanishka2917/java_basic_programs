class DemoDataType
{
	public static void main(String args[])
	{
		byte b = 25; //range -128 to +127
		System.out.println("value of byte variable is" + b);

		short s = 375; //range -32768 to +32767
		System.out.println("value of short variable is" + s);

		int i = 420038; //range -2147483648 to +2147483647
		System.out.println("value of int variable is" + i);

		long l = 3486348785677677L; //range -2pow63 tp 2pow63-1
		System.out.println("value of long variable is" + l);

		float f = 3.6562f; //single precession decimal 2pow32
		System.out.println("value of float variable is" + f);

		double d = 35536.2356; //double precession decimal 2pow64
		System.out.println("value of double variable is" + d);

		char c = 'a'; //character variable 
		System.out.println("value of char variable is" + c);

		boolean bol = true; //boolean variable i.e true or false
		System.out.println("value of boolean variable is"  + bol);
     }
}