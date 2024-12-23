package activities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create the Objects
		Scanner scan = new  Scanner(System.in);
		List<Integer> numArr = new ArrayList<>();
		Random indexGen = new Random();
		System.out.println("Enter the numbers for the ist");
		System.out.println("enter the EOL or any non-integer character to stop");
		while(scan.hasNextInt()) {
			numArr.add(scan.nextInt());
		}
		//Generate a random index
		int generatedindex =indexGen.nextInt(numArr.size());
		//Print the random index and the value at that index
		System.out.println("Random index generated" + generatedindex);
		System.out.println("The Number at Generated index is "+numArr.get(generatedindex));
	}


}
