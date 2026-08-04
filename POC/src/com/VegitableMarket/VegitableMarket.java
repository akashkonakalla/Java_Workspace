package com.VegitableMarket;

import java.util.Scanner;

public class VegitableMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean exit = false;
		double fruitPrice = 0, vegPrice = 0;
		while (!exit) {

			System.out.println("enter the category veg or fruit, exit to close");
			String s = sc.next();
			switch (s) {
			case "veg" -> {
				boolean vegexit = false;
				while (!vegexit) {
					System.out.println("enter the vegitable code to buy or back to main menu:");
					String veg = sc.next();
					switch (veg) {

					case "tmt" -> {
						System.out.println("Tomato per kg = 40 rs");
						double currP = 40;
						vegPrice += currP;
					}
					case "ptt" -> {
						System.out.println("Potato per kg = 50 rs");
						double currP = 50;
						vegPrice += currP;

					}
					case "oni" -> {
						System.out.println("Onion per kg = 35 rs");
						double currP = 35;
						vegPrice += currP;
					}

					case "car" -> {
						System.out.println("Carrot per kg = 60 rs");
						double currP = 60;
						vegPrice += currP;
					}

					case "cab" -> {
						System.out.println("Cabbage per kg = 30 rs");
						double currP = 30;
						vegPrice += currP;
					}

					case "cau" -> {
						System.out.println("Cauliflower per kg = 45 rs");
						double currP = 45;
						vegPrice += currP;
					}

					case "bri" -> {
						System.out.println("Brinjal per kg = 40 rs");
						double currP = 40;
						vegPrice += currP;
					}

					case "lad" -> {
						System.out.println("Lady Finger per kg = 55 rs");
						double currP = 55;
						vegPrice += currP;
					}

					case "bea" -> {
						System.out.println("Beans per kg = 70 rs");
						double currP = 70;
						vegPrice += currP;
					}

					case "pea" -> {
						System.out.println("Green Peas per kg = 90 rs");
						double currP = 90;
						vegPrice += currP;
					}

					case "spi" -> {
						System.out.println("Spinach per bunch = 20 rs");
						double currP = 20;
						vegPrice += currP;
					}

					case "cor" -> {
						System.out.println("Coriander per bunch = 15 rs");
						double currP = 15;
						vegPrice += currP;
					}

					case "chi" -> {
						System.out.println("Green Chilli per kg = 80 rs");
						double currP = 80;
						vegPrice += currP;
					}

					case "cuc" -> {
						System.out.println("Cucumber per kg = 35 rs");
						double currP = 35;
						vegPrice += currP;
					}

					case "rad" -> {
						System.out.println("Radish per kg = 30 rs");
						double currP = 30;
						vegPrice += currP;
					}

					case "bit" -> {
						System.out.println("Beetroot per kg = 50 rs");
						double currP = 50;
						vegPrice += currP;
					}

					case "gin" -> {
						System.out.println("Ginger per kg = 120 rs");
						double currP = 120;
						vegPrice += currP;
					}

					case "gar" -> {
						System.out.println("Garlic per kg = 150 rs");
						double currP = 150;
						vegPrice += currP;
					}

					case "lem" -> {
						System.out.println("Lemon per dozen = 60 rs");
						double currP = 60;
						vegPrice += currP;
					}

					case "pun" -> {
						System.out.println("Pumpkin per kg = 25 rs");
						double currP = 25;
						vegPrice += currP;
					}

					case "bot" -> {
						System.out.println("Bottle Gourd per kg = 30 rs");
						double currP = 30;
						vegPrice += currP;
					}

					case "rid" -> {
						System.out.println("Ridge Gourd per kg = 45 rs");
						double currP = 45;
						vegPrice += currP;
					}
					case "back" -> {
						System.out.println("Going back to main menu");
						vegexit = true;
					}
					default -> System.out.println("Invalid vegitable code");

					}

				}
				System.out.println("Total Vegitable Price is : " + vegPrice);

			}

			case "fruit" -> {
				boolean exitFruit = false;
				do {
					System.out.println("enter the fruit code to buy or back to main menu");
					String fruit = sc.next();
					switch (fruit) {
					case "mgo" -> {
						System.out.println("Mango Price per kg = 200 rs");
						double currP = 200;
						fruitPrice += currP;
					}
					case "app" -> {
						System.out.println("Apple Price per kg = 180 rs");
						double currP = 180;
						fruitPrice += currP;
					}

					case "ban" -> {
						System.out.println("Banana Price per dozen = 70 rs");
						double currP = 70;
						fruitPrice += currP;
					}

					case "org" -> {
						System.out.println("Orange Price per kg = 120 rs");
						double currP = 120;
						fruitPrice += currP;
					}

					case "grp" -> {
						System.out.println("Grapes Price per kg = 90 rs");
						double currP = 90;
						fruitPrice += currP;
					}

					case "pom" -> {
						System.out.println("Pomegranate Price per kg = 220 rs");
						double currP = 220;
						fruitPrice += currP;
					}

					case "pap" -> {
						System.out.println("Papaya Price per kg = 60 rs");
						double currP = 60;
						fruitPrice += currP;
					}

					case "gua" -> {
						System.out.println("Guava Price per kg = 80 rs");
						double currP = 80;
						fruitPrice += currP;
					}

					case "pin" -> {
						System.out.println("Pineapple Price = 90 rs");
						double currP = 90;
						fruitPrice += currP;
					}

					case "wat" -> {
						System.out.println("Watermelon Price per piece = 150 rs");
						double currP = 150;
						fruitPrice += currP;
					}

					case "mus" -> {
						System.out.println("Muskmelon Price per kg = 70 rs");
						double currP = 70;
						fruitPrice += currP;
					}

					case "kiw" -> {
						System.out.println("Kiwi Price per kg = 350 rs");
						double currP = 350;
						fruitPrice += currP;
					}

					case "str" -> {
						System.out.println("Strawberry Price per box = 180 rs");
						double currP = 180;
						fruitPrice += currP;
					}

					case "che" -> {
						System.out.println("Cherry Price per kg = 400 rs");
						double currP = 400;
						fruitPrice += currP;
					}

					case "lic" -> {
						System.out.println("Litchi Price per kg = 160 rs");
						double currP = 160;
						fruitPrice += currP;
					}

					case "cus" -> {
						System.out.println("Custard Apple Price per kg = 140 rs");
						double currP = 140;
						fruitPrice += currP;
					}

					case "pea" -> {
						System.out.println("Pear Price per kg = 170 rs");
						double currP = 170;
						fruitPrice += currP;
					}

					case "plm" -> {
						System.out.println("Plum Price per kg = 200 rs");
						double currP = 200;
						fruitPrice += currP;
					}

					case "coc" -> {
						System.out.println("Coconut Price per piece = 50 rs");
						double currP = 50;
						fruitPrice += currP;
					}

					case "sap" -> {
						System.out.println("Sapota Price per kg = 90 rs");
						double currP = 90;
						fruitPrice += currP;
					}

					case "dra" -> {
						System.out.println("Dragon Fruit Price per kg = 250 rs");
						double currP = 250;
						fruitPrice += currP;
					}

					default -> {
						System.out.println("Invalid fruit code!");
					}
					case "back" -> {
						System.out.println("Going back to main menu");
						exitFruit = true;
					}
					}

				} while (!exitFruit);

				System.out.println("Total fruit price is : " + fruitPrice);

			}
			case "exit" -> {
				System.out.println("Thank you for shopping, visit again :) ");
				exit = true;
			}

			default -> System.out.println("Invalid choice");

			}
		}
		
		System.out.println("Total Price is : "+ (fruitPrice+vegPrice));

	}
}
