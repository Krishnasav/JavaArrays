package arrays;

public class MultiplexionofArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {10,20,2};
		int mul =1;
		for(int i=0;i<arr.length;i++)
		{
			mul *= arr[i];
		}
		System.out.println(mul);
		
		
	}

}
