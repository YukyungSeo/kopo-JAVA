package kr.ac.kopo.day06;

import java.util.Scanner;

public class ScannerMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.print("실수 : ");
		double realnum = Double.parseDouble(sc.nextLine());
		
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		// 방법 1 
		// 이렇게도 할 수 있으나, parsing을 더 많이 사용함 
		// 값들을 space로 구분하여 입력할 경우, 뒤의 값이 날아감 ex. 10 20 30 -> 10만 사용, 20 30 날아감
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		sc.nextLine(); //엔터까지의 문자(space 포함)가 모두 날아감

		// 문제 발생
//		System.out.print("정수 : ");
//		int num = sc.nextInt();

		System.out.print("문자열2 : ");
		String str = sc.nextLine();

		System.out.println(realnum);
		System.out.println(num);
		System.out.println(str);

		sc.close();
	}
}
