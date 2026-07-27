package constructor;

public class Employee {

	int empId;
	String empName;
	String department;
	String designation;
	double salary;
	
	public Employee(int empId, String empName, String department, String designation, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public Employee() {
		super();
		this.empId = 0;
		this.empName = "unknown";
		this.department = "unknown";
		this.designation = "unknown";
		this.salary = 0;
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public Employee(int empId, String empName, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}

	public Employee(int empId, String empName, String department, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.designation = designation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
	    e1.display();

	    Employee e2 = new Employee(101, "Akash");
	    e2.display();

	    Employee e3 = new Employee(102, "Rahul", "IT");
	    e3.display();

	    Employee e4 = new Employee(103, "Priya", "HR", "Manager");
	    e4.display();

	    Employee e5 = new Employee(104, "Sneha", "Finance", "Accountant", 55000);
	    
	    e5.display();
	    e5=new Employee(105, "new", "New Finance", "New Accountant", 60000);
	    e5.display();
	}
	
	void display() {

	    System.out.println("Employee ID   : " + empId);
	    System.out.println("Employee Name : " + empName);
	    System.out.println("Department    : " + department);
	    System.out.println("Designation   : " + designation);
	    System.out.println("Salary        : " + salary);
	    System.out.println();
	}
	
	

}
