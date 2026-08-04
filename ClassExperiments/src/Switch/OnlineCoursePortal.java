package Switch;

import java.util.Scanner;

public class OnlineCoursePortal {

	public static void main(String[] args) {

		boolean exit=false;
		do {
		System.out.println("""

				=========================================

				         ONLINE COURSE PORTAL

				=========================================

				1. Java
				2. Python
				3. SQL
				4. DevOps
				5. Artificial Intelligence
				6. Exit

				Enter your choice:""");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1 -> {System.out.println("""

				Course Name     : Java Programming

				Instructor      : James Gosling

				Duration        : 3 Months

				Level           : Beginner to Advanced

				Projects        :
				• Student Management System
				• Banking Application
				• Library Management System

				Course Fee      : ₹4,999

				Certificate     : Yes

				Placement Support : Available

				Prerequisites   : None""");
		        try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		case 2 -> {System.out.println("""
				Course Name     : Python Programming

				Instructor      : Guido van Rossum

				Duration        : 2 Months

				Level           : Beginner

				Projects        :
				• Calculator
				• Snake Game
				• File Manager

				Course Fee      : ₹3,999

				Certificate     : Yes

				Placement Support : Available

				Prerequisites   : Basic Computer Knowledge

								""");
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		case 3 -> {System.out.println("""
								Course Name     : SQL Database

				Duration         : 45 Days

				Database         : MySQL

				Topics

				• DDL
				• DML
				• DQL
				• TCL
				• DCL
				• Joins
				• Functions
				• Views
				• Procedures

				Projects

				• Employee Database
				• Online Shopping Database

				Course Fee       : ₹2,999

				Certificate      : Yes
								""");
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		case 4 ->{ System.out.println("""
				Course Name     : DevOps

				Duration        : 4 Months

				Tools Covered

				• Git
				• GitHub
				• Docker
				• Kubernetes
				• Jenkins
				• Terraform
				• AWS

				Projects

				• CI/CD Pipeline
				• Docker Deployment
				• Kubernetes Deployment

				Course Fee      : ₹6,999

				Certificate     : Yes
								""");
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		case 5 ->{ System.out.println("""
				Course Name     : Artificial Intelligence

				Duration        : 5 Months

				Topics

				• Machine Learning
				• Deep Learning
				• NLP
				• Computer Vision
				• Generative AI

				Libraries

				• NumPy
				• Pandas
				• Scikit-learn
				• TensorFlow

				Projects

				• Chatbot
				• Face Detection
				• Recommendation System

				Course Fee      : ₹8,999

				Certificate     : Yes
								""");
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		case 6-> {
			System.out.println("Thank You, visit again :)");
			exit= true;
		}
		default -> System.out.println("Invalid course selected");
		

		}

	}while(!exit);

  }
}
