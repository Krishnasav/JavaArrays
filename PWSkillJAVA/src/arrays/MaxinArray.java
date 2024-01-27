package arrays;

public class MaxinArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,43,56,79,9,10};
		int n = arr.length;
		int  max = arr[0];
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max) max = arr[i];
		}
		System.out.println(max);
		
	}

}
