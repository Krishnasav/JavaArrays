package arrays;

public class FindRollNumber35 
{
	public static void main(String[] args) 
	{
		int [] arr = {40,54,67,32,87,34,89,98,76,65,8};
		int n = arr.length;
		
		for(int i =0;i<n;i++)
		{
			if(arr[i]<35)
				System.out.println("The Failed RollNumber is: " + i);
		}
	
	
		
	}

}
