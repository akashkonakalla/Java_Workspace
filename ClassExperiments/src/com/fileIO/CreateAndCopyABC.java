package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndCopyABC {

	public static void main(String[] args) {

		try (FileWriter fw1 = new FileWriter("C:\\Users\\akhil\\Music\\new\\a.txt")) {
			fw1.write("This is the content in file a");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileWriter fw2 = new FileWriter("C:\\Users\\akhil\\Music\\new\\b.txt")) {

			fw2.write("This is the content in file b");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\akhil\\Music\\new\\a.txt"));
				BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\akhil\\Music\\new\\b.txt"));
				FileWriter fw3 = new FileWriter("C:\\Users\\akhil\\Music\\new\\c.txt")
		) {
			String input;
			
			while((input = br1.readLine() )!= null) {
				fw3.write(input + "\n");
//				fw3.write("\n");
			}
			
			while((input = br2.readLine())!=null) {
				fw3.write(input + "\n");
				
			}
			
			System.out.println("Copied successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
