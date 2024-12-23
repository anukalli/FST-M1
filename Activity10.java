package activities;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		//Adding element to the HAshSet
		hs.add("M");
		hs.add("K");
		hs.add("A");
		hs.add("N");
		hs.add("U");
		hs.add("S");
		//Print HashSet
		System.out.println("Original Hashset"+hs);
		//Print the size of the hashset
		System.out.println("Size of the hashSet"+hs.size());
		//remove the element
		System.out.println("REmove the element"+ hs.remove("M"));
		//REmove the element which is not present
		if(hs.remove("Z"))
		{
			System.out.println("Z is removed from the list");
		} else {
			System.out.println("Z is not from the list");
		}
		
		//Search for the element
		System.out.println("checking if M is presrent "+hs.contains("A"));
		//Print updated HashSet
		System.out.println("Updated HashSet: "+hs);
	}

}
