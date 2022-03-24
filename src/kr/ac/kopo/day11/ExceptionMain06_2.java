package kr.ac.kopo.day11;

import java.io.FileReader;

public class ExceptionMain06_2 {

	public static void main(String[] args) {

		System.out.println("main start...");
		
		FileReader fr;
		try {
			System.out.println("ex before...");
			
			fr = new FileReader("a.txt"); // checked Exception
			fr.close();
			
			System.out.println("ex after...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("fianlly");
		}

		System.out.println("main end...");

	}
}

