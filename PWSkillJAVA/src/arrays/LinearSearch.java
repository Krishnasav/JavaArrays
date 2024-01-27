package arrays;

import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Target element: ");
		int x = sc.nextInt();
		System.out.print("Enter Array Size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter Array element :");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		for(int i=0;i<n;i++)
{
	      if(arr[i]==x)
	      {
	    	  flag = true;
	    	  break;
	      }
}
		if(flag==true)
			System.out.print("Element Found");
		else
			System.out.print("element not found");
		
	}

}
