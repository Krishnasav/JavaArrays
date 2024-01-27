package arrays;

public class FindthesecondLE 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,43,56,48,9,10};
		int n = arr.length;
		int  max = arr[0];
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max) max = arr[i];
		}
		int smax = arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>smax && arr[i] !=max) smax = arr[i];
		}
		System.out.println(max);
		System.out.println(smax);
		
		
	}

}
