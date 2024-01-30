package arrays;

import java.util.Arrays;

public class CopyofArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {32,23,45,76,89,12};
		
		for(int ele:arr)
		{
			System.out.print(ele +" ");
		}
		System.out.println();
		
		int[] nums =arr;  //shallow Copy(Changed happen into current array)
		nums[0] = 70;
		System.out.println(arr[0]);
		
		//deep copy(first its create new array with the help copy of current array then changed into new array0
		int[] brr = Arrays.copyOf(arr, arr.length);
		brr[0] = 70;
		for(int ele:brr) {
		System.out.print(ele +" ");
	
		}
		
	}

}
