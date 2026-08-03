package Switch;

import java.util.Scanner;

public class LaptopStore {
public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc = new Scanner(System.in);

	boolean exit = false;
	while (!exit) {
		System.out.println("\nenter your choice");
		System.out.println("========== Laptop Store ==========\r\n"
				+ "\r\n"
				+ "1. Dell\r\n"
				+ "2. HP\r\n"
				+ "3. Lenovo\r\n"
				+ "4. Acer\r\n"
				+ "5. Asus\r\n"
				+ "6. Exit\r\n"
				+ "\r\n"
				+ "Choose your laptop:");
		int ch = sc.nextInt();
		switch (ch) {
		default -> System.out.println("invalid choice");
		case 1 -> {

			System.out.println("Brand : Dell\r\n"
					+ "Model : Inspiron 15\r\n"
					+ "Processor : Intel Core i5 13th Gen\r\n"
					+ "RAM : 16 GB\r\n"
					+ "Storage : 512 GB SSD\r\n"
					+ "Graphics : Intel Iris Xe\r\n"
					+ "Display : 15.6-inch FHD\r\n"
					+ "Price : ₹65,000\r\n"
					+ "Warranty : 1 Year");
			break;
		}
		case 2 -> {
			System.out.println("Brand : HP\r\n"
					+ "Model : Pavilion 14\r\n"
					+ "Processor : Intel Core i7 13th Gen\r\n"
					+ "RAM : 16 GB\r\n"
					+ "Storage : 1 TB SSD\r\n"
					+ "Graphics : NVIDIA MX550\r\n"
					+ "Display : 14-inch FHD\r\n"
					+ "Price : ₹82,000\r\n"
					+ "Warranty : 2 Years");
			break;
		}
		case 3 -> {
			System.out.println("Brand : Lenovo\r\n"
					+ "Model : IdeaPad Slim 5\r\n"
					+ "Processor : AMD Ryzen 7\r\n"
					+ "RAM : 16 GB\r\n"
					+ "Storage : 512 GB SSD\r\n"
					+ "Graphics : AMD Radeon Graphics\r\n"
					+ "Display : 15.6-inch IPS\r\n"
					+ "Price : ₹70,000\r\n"
					+ "Warranty : 2 Years");
			break;

		}
		case 4->{
			System.out.println("Brand : Acer\r\n"
					+ "Model : Nitro V\r\n"
					+ "Processor : Intel Core i5\r\n"
					+ "RAM : 16 GB\r\n"
					+ "Storage : 512 GB SSD\r\n"
					+ "Graphics : RTX 3050\r\n"
					+ "Display : 15.6-inch FHD\r\n"
					+ "Price : ₹72,000\r\n"
					+ "Warranty : 1 Year");
		}
		case 5->
		{
			System.out.println("Brand : Asus\r\n"
					+ "Model : TUF Gaming f15\r\n"
					+ "Processor : Intel Core i5\r\n"
					+ "RAM : 8 GB\r\n"
					+ "Storage : 512 GB SSD\r\n"
					+ "Graphics : RTX 3050\r\n"
					+ "Display : 15.6-inch OLED\r\n"
					+ "Price : ₹60,000\r\n"
					+ "Warranty : 1 Year");
		}
		case 6 -> {
			System.out.println("Thank You for visiting our store :)");
			exit = true;
			break;
		}
	
		}
	}
 }
}
