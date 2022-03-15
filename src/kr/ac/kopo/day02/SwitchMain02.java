package kr.ac.kopo.day02;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		
		String a = new String("Hello");
		
		// 문자(참조자료형)는 동등비교가 안먹힌다
		// switch는 먹힌다!!!! 1.7버전 이후부터 가능!!!
		System.out.println(a == "Hello");
		System.out.println(a.equals("Hello"));
		
		switch(a) {
		case "Hello":
			System.out.println("TRUE");
			break;
		default:
			System.out.println("FALSE");
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1-3 사이의 정수 입력 : ");
		String num = sc.next();
		
		switch (num) {
		case "1":
			System.out.println("ONE");
			break;
		case "2":
			System.out.println("TWO");
			break;
		case "3":
			System.out.println("THREE");
			break;
		default:
			System.out.println("ERROR");
		}
		
		sc.close();
	}
}
