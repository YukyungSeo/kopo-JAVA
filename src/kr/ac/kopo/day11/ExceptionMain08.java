package kr.ac.kopo.day11;

import java.util.Scanner;

@SuppressWarnings("serial")
class MismatchEvenException extends Exception {

	public MismatchEvenException() {
		super();
	}

	public MismatchEvenException(String message) {
		super(message);
	}

}

public class ExceptionMain08 {

	public static void main(String[] args) /* throws Exception */ {

//		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("짝수를 입력 : ");
			int num = sc.nextInt();

			if (num < 0 || num % 2 == 1) {
				throw new MismatchEvenException(num + "은 짝수가 아닌 정수입니다");
			} else {
				System.out.println("짝수 : " + num);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

		System.out.println("next");

//		Scanner sc = new Scanner(System.in);
//		System.out.print("짝수를 입력 : ");
//		int num = sc.nextInt();
//		
//		if(num < 0 || num % 2 == 1) {
//			System.out.println("잘못입력했습니다");
//		} else {
//			System.out.println("짝수 : " + num);
//		}
	}
}
