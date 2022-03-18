package kr.ac.kopo.day06;

import java.util.Scanner;

public class Gugudan {

	int getDan() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();

		sc.close();

		return dan;
	}

	/**
	 * 파라미터로 날아온 정수의 해당 구구단을 출력
	 * 
	 * @param dan
	 */
	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}

	/**
	 * 2-9단 사이의 구구단 출력
	 */
	void print() {
		print(2, 9);
		
//		for (int dan = 2; dan < 10; dan++) {
//			print(dan);
//		}
	}

	/**
	 * 파라미터로 날아온 시작단~종료단 사이의 구구단 출력
	 * 
	 * @param startDan
	 * @param endDan
	 */
	void print(int startDan, int endDan) {
		if (startDan > endDan) {
			int tmp = endDan;
			endDan = startDan;
			startDan = tmp;
		}

		for (int dan = startDan; dan <= endDan; dan++) {
			print(dan);
		}
	}
}
