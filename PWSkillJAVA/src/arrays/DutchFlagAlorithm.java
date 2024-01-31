package arrays;

public class DutchFlagAlorithm 
{
	public static void main(String[] args) 
	{
		//LeetCode Q-75(Sort Colors)
		int[] arr = {1,0,1,2,2,1,2,1,2,0,0};
		int n =arr.length;
		int mid =0, high = n-1, low = 0;
		
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				int temp =arr[mid];
				arr[mid] =arr[low];
				arr[low] = temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1)
				mid++;
			else {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
		
	}

}
