package activities;

public class Car {

	String color;
	String Transmission;
	int make;
	int tyres;
	int doors;
	
	
	Car(String color,String Transmission,int make ){
		this.color = color;
		this.make=make;
		this.tyres = 4;
		this.doors = 4;
		this.Transmission = Transmission;
		
	}
	
	public void dispalyCharacters()
	{
		
		System.out.println("color : "+ color);
		System.out.println("make : "+ make);
		System.out.println("tyres : "+ tyres);
		System.out.println("doors : "+ doors);
		System.out.println("Transmission : "+ Transmission);
	}
	
	public void accelarate()
	{
		System.out.println("Car is moving forward");
	}
	public void brake ()
	{
		System.out.println("Car is Stopped");
	}

}
