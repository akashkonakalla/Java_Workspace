package constructor;

public class Bike {

	int bikeId;
	String brand;
	String owner;
	String model;
	String color;
	
	public Bike() {
		// TODO Auto-generated constructor stub
		this.bikeId=0;
		this.brand="unknown";
		this.owner= "unknown";
		this.color="unknown";
		this.model="unknown";

		
	}
	
	
	
	public Bike(int bikeId, String brand, String owner, String model, String color) {
		super();
		this.bikeId = bikeId;
		this.brand = brand;
		this.owner = owner;
		this.model = model;
		this.color = color;
	}



	public Bike(int bikeId, String brand, String owner, String model) {
		super();
		this.bikeId = bikeId;
		this.brand = brand;
		this.owner = owner;
		this.model = model;
	}



	public Bike(int bikeId, String brand, String owner) {
		super();
		this.bikeId = bikeId;
		this.brand = brand;
		this.owner = owner;
	}



	public Bike(int bikeId, String brand) {
		super();
		this.bikeId = bikeId;
		this.brand = brand;
	}



	public static void main(String[] args) {
		   Bike b1 = new Bike();
		    b1.display();

		    Bike b2 = new Bike(101, "Yamaha");
		    b2.display();

		    Bike b3 = new Bike(102, "Honda", "Akash");
		    b3.display();

		    Bike b4 = new Bike(103, "Royal Enfield", "Rahul", "Classic 350");
		    b4.display();

		    Bike b5 = new Bike(104, "KTM", "Rohit", "Duke 390", "Orange");
		    b5.display();
		
	}
	
	void display() {

	    System.out.println("Bike ID : " + bikeId);
	    System.out.println("Brand   : " + brand);
	    System.out.println("Owner   : " + owner);
	    System.out.println("Model   : " + model);
	    System.out.println("Color   : " + color);
	    System.out.println();
	}

}
