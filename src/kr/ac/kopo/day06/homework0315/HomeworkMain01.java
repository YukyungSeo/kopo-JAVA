package kr.ac.kopo.day06.homework0315;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림 몇개 구입하시겠습니까? => ");
		int count = sc.nextInt();
		sc.nextLine(); // 이렇게도 할 수 있으나, parsing을 더 많이 사용함

		Icecream[] iceArr = new Icecream[count];
		for (int i = 0; i < count; i++) {

			iceArr[i] = new Icecream();

			System.out.println("*** " + (i + 1) + "번째 아이스크림 구매정보 입력 ***");
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine();

			System.out.print("아이스크림가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine()); // 올바른 정수만 입력 가능
			// 정수가 올바르게 입력되지 않을 시(ex. 1-) 에러 발생
		}

		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", count);
		System.out.println("번호\t아이스크림명\t가격");
		int no = 1;
		for (Icecream ice : iceArr) {
			System.out.println(no++ + "\t" + ice.name + "\t\t" + ice.price);
		}
//		System.out.println("총 판매액 : " + sum + "원");

		sc.close();
	}
}
