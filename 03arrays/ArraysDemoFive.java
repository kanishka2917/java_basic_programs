class ArraysDemoFive
{
	public static void main (String args[])
	{
		boolean []b = new boolean[3];
		b[0] = true;
		b[1] = false;
		b[2] = true;
		for(int i = 0; i < b.length; i++)
		{
			System.out.println("value of b[" + i + "] is : " + b[i]);
		}
		 
		double []d = {11.2, 13.34, 15.65, 8.02};
		for(int i = 0; i < d.length; i++)
		{
			System.out.println("value of d[" + i +"] is : " + d[i]);   
		}
	}
}