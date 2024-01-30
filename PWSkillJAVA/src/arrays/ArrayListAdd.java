package arrays;

import java.util.ArrayList;

public class ArrayListAdd 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		System.out.println(list +" " + list.size());
		
		list.add(40);
		System.out.println(list +" " + list.size());
		
		list.add(30);
		System.out.println(list +" " + list.size());
		
		list.add(90);
		System.out.println(list +" " + list.size());
		
		list.add(80);
		System.out.println(list +" " + list.size());
		
		list.remove(2);
		System.out.println(list +" " + list.size());

		
	}

}
