package kr.ac.kopo.day11;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain06 {

	public static void main(String[] args) {

		System.out.println("main start...");

		try {

			FileReader fr = new FileReader("a.txt"); // checked Exception
			fr.close();
			
		}  catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("main end...");

	}
}
