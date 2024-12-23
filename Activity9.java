package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create An array List
		List<String> myList = new ArrayList<>();
		myList.add("Apple");
		myList.add("Mango");
		myList.add("pineapple");
		myList.add("Papayya");
		myList.add("Water Melon");
		
		//Print all the elements using a loop
		for(String name : myList) {
			System.out.println(name);
		}
		//Print the 3rd Element
		System.out.println("The Third element is "+ myList.get(2));
		//Search for a specific Name 
		System.out.println("Is shahil in the list?: "+myList.contains("Saahil"));
		//Print the size of the List
		System.out.println("No of elements 	in the list before Remove:"+ myList.size());
		//Remove the elements
		myList.remove(1);
		myList.remove("Water Melon");
		//Print the size of the list after remove()
		System.out.println("No fo elements in the list after remove "+ myList.size());

	}

}
