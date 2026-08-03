package Switch;

import java.util.Scanner;

public class RestaurantOrderingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the item you want to know the price : ");
		System.out.println("1. Pizza\r\n" + "2. Burger\r\n" + "3. Sandwich\r\n" + "4. Biryani\r\n" + "5. Pasta");
		int op = sc.nextInt();
		double price=switch (op) {
		case 1 ->{ 
			yield 200;
			}
		case 2 ->{ 
			yield 179;
			}
		case 3 ->{ 
			yield 250;
			}
		case 4 ->{ 
			yield 440;
			}
		case 5 ->{ 
			yield 170;
			}
		
		default ->{
			yield 0;
		 }
		};
		
		System.out.println("Price is : "+ price );

	}
}
