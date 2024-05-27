class MethodDemoTwo                      
{
	static int[] bubblesort(int []inputArray)
	{
		int n = inputArray.length;
		int temp = 0;

		for (int i = 0; i < n; i++)
		{
			for (int j = 1; j < (n - 1); j++)
			{
				if (inputArray [j - 1] > inputArray [j])
				{
				temp = inputArray [j - 1];
				inputArray [j - 1] = inputArray [j];
				inputArray [j] = temp;
				}
			}
		}
		return inputArray;
	}
	public static void main(String args[])
	{
		int z[] = {95, 55, 75, 65, 25};

		System.out.println ("display of input array");
		for (int i = 0; i < z.length; i++)
		{
			System.out.println ("z [" + i + "] = " + z[i]);
		}


		int res[] = bubblesort(z);
		 
		System.out.println("\ndisplay of output array");
		for (int i = 0; i < res.length; i++)
		{
			System.out.println ("res [" + i + "] = " + res[1]);
		}
	}
}