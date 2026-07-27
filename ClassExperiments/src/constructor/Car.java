package constructor;

public class Car {

	int carId;
	String carName;
	String owner;
	String model;
	String color;
	
	
	
	public Car() {
		
		System.out.println("no arg constructor called ");	
		this.carId=0;
		this.carName="unknown";
		this.owner= "unknown";
		this.color="unknown";
		this.model="unknown";
		
	}
	
	
	
	
	public Car(int carId, String carName, String owner, String model, String color) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.owner = owner;
		this.model = model;
		this.color = color;
	}




	public Car(int carId, String carName, String owner, String model) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.owner = owner;
		this.model = model;
	}




	public Car(int carId, String carName, String owner) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.owner = owner;
	}




	public Car(int carId, String carName) {
		super();
		this.carId = carId;
		this.carName = carName;
	}

	


	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.display();
		c1=null;
		Car c2=new Car(2, "gtr");
		c2.display();
		Car c3=new Car (3, "bmw", "akash ");
		c3.display();
		Car c4= new Car(4, "audi", "akash", "model");
		c4.display();
		Car c5=new Car(5, "audi 2", "akash", "model x");
	}




	 void display() {
		  
		  System.out.println("car id : "+carId);
		  System.out.println("car name : "+carName); 
		  System.out.println("owner : "+owner);
		  System.out.println("model : "+model);
		  System.out.println("color : "+color);
		 
	}

}
