package constructor;


public class Person {

	String name;
	int id;
	double balance;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
		
		this("unknown 0");
		System.out.println("no argument constructor");
		this.id=0;
		this.balance=0;
		this.name="unknown";
		
	}
	

	public Person(String name, int id) {
		
		this("unknown2", 2, 2);System.out.println("String name, int id");
		this.name = name;
		this.id = id;
	}


	public Person(String name) {
		
		this("unknown",1);System.out.println("String name");
		this.name = name;
		
	}


	public Person(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		System.out.println("String name, int id, double balace");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();p1.display();
		Person p2=new Person("hello 1");p2.display();
		Person p3=new Person("hello 2",222222);p3.display();
		Person p4=new Person("hello 3",333333,300000);p4.display();
		
		
		
		
	}

	private  void display() {
		// TODO Auto-generated method stub
		System.out.println("********************");
		System.out.println("Person id  : "+id);
		System.out.println("Person name : "+ name);
		System.out.println("balance :" + balance);
		System.out.println("********************");
		
		
	}

}
