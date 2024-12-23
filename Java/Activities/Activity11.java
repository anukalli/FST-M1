package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "red");
		hashMap.put(2, "Green");
		hashMap.put(3, "blue");
		hashMap.put(4, "white");
		hashMap.put(5, "Black");
		hashMap.put(6,"Brown");
		
		//print the Map
		System.out.println("the Original map:"+hashMap);
		
		//REmove one color 
		hashMap.remove(4);
		//Map after removiign the color 
		System.out.println("After removign the white "+ hashMap);
		
		//Check if Green exists
		if(hashMap.containsValue("Green")) {
			System.out.println("Green exists in the Map");
		}
		else {
			System.out.println("Green does not exists in the Map");
		}
		//Print the size of the Map
		System.out.println("Number of pairs in the Map is "+hashMap.size());
		//Loop through map
		for(int key: hashMap.keySet()) {
			System.out.println(hashMap.get(key));
		}

	}

}
