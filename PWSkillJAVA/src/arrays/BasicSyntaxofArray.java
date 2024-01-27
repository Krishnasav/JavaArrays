package arrays;

public class BasicSyntaxofArray 
{
	public static void main(String[] args) 
	{
		//intialization of element
		int[] arr = new int[5];
		arr[0] = 21;
		arr[1] = 12;
		arr[2] = 18;
		arr[3] = 25;
		arr[4] = 29;
		System.out.println(arr[4]);
		
		//Update 
		arr[4] = 31;
		arr[4] += 9;
		arr[4] *= 9;
		
		//output
		System.out.println(arr[4]);
	}

}
