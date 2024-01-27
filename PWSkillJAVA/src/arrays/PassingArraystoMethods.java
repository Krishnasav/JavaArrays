package arrays;

public class PassingArraystoMethods 
{
	public static void main(String[] args) 
	{
		int[] arr = {23,43,65,78,567,443,3443};
		System.out.println(arr[0]);
		change(arr);
		System.out.println(arr[0]);
		
	}

	public static void change(int[] x)
	{
		x[0]=97;
		
	}

}
