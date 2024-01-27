package arrays;
public class SumofArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,32,43,45,13,43,54};
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		System.out.println(sum);
		
	}

}
