package com.file.task_23_09_2026;

/*
 * Today's Assignment 
Java-

1.Create a Java program to create and open student.txt using FileInputStream. 
If the file is not available, handle the Exception
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling1 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\akhil\\Music\\new\\sample.txt");
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream ff = new FileInputStream(f);
			int i = ff.read();

			while (i != -1) {
				System.out.print((char) i);
				i = ff.read();

				Thread.sleep(500);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ee) {
			ee.getStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
