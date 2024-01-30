package arrays;

import java.util.Arrays;

public class BuiltinMethod 
{
	public static void main(String[] args) 
	{
		int[] arr = {30,32,23,10,54,45};
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
		// For each loop
		for(int ele:arr)
		{
			System.out.print(ele +" ");
		}
		Arrays.sort(arr);
	     System.out.println();
	     for(int i=0;i<arr.length;i++)
	     {
	    	 System.out.print(arr[i] + " ");
	     }
		
	}


}
