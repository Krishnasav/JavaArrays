package arrays;

import java.util.ArrayList;

public class BasicofArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<>(5);
		arr.add(0,20);  //Intilize
		arr.add(1,30);
		arr.add(2,40);
		arr.add(3,50);
		arr.add(4,60);
		System.out.println(arr); //Printing all arrayList element
		arr.set(4, 100); // Update/modify 
		System.out.println(arr);
		System.out.println(arr.get(3)); // print to 3rd index value of arrayList element
		arr.add(103);   // add value last in arraylist without indexing
		System.out.println(arr);
		
	}

}
