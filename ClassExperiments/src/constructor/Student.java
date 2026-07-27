package constructor;

public class Student {

	int studentId;
	String studentName;
	String branch;
	String college;
	String grade;
	
	public Student() {
		super();
		this.studentId = 0;
		this.studentName = "unknown";
		this.branch = "unknown";
		this.college = "unknown";
		this.grade = "unknown";
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}


	public Student(int studentId, String studentName, String branch, String college, String grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.branch = branch;
		this.college = college;
		this.grade = grade;
	}

	public Student(int studentId, String studentName, String branch, String college) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.branch = branch;
		this.college = college;
	}

	public Student(int studentId, String studentName, String branch) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.branch = branch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Student s1 = new Student();
		    s1.display();

		    Student s2 = new Student(101, "Akash");
		    s2.display();

		    Student s3 = new Student(102, "Karthik", "Computer Science");
		    s3.display();

		    Student s4 = new Student(103, "Shravan", "Information Technology", "ABC Engineering College");
		    s4.display();

		    Student s5 = new Student(104, "Catto", "Electronics", "XYZ Institute", "A");
		    s5.display();

		}
		
		void display() {
		    System.out.println("Student ID      : " + studentId);
		    System.out.println("Student Name    : " + studentName);
		    System.out.println("Branch          : " + branch);
		    System.out.println("College         : " + college);
		    System.out.println("Grade           : " + grade);
		}
		
	

}
