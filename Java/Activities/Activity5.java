package activities;

abstract class Book {
	// Varialble to hold the book title

	String title;

	// Abstract method to set the title
	abstract void setTitle(String title);
	// Concrete method to return the title of a book

	public String getTitle() {
		return this.title;
	}
}

class MyBook extends Book {
	//Implement the setTitle function
	
	public void setTitle(String title) {
		this.title = title;
	}
}
public class Activity5 {
	public static void main(String[] args) {
		MyBook bookObj = new MyBook();
		bookObj.setTitle("PLAYING IT MY WAY : Sachin Tendulkar");
		System.out.println("Title of the book is :"+ bookObj.getTitle() );
		
	}
	
	
}