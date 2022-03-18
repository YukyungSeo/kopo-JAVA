package kr.ac.kopo.day06.practice;

import java.util.Scanner;

public class IcecreamMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int cnt = getIcecreamCount();

		// 입력
		Icecream[] icecreams = new Icecream[cnt];
		for (int i = 0; i < cnt; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i + 1);
			icecreams[i] = new Icecream();
			icecreams[i].setName();
			icecreams[i].setPrice();
		}

		// 출력
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", cnt);
		System.out.println("번호\t아이스크림명\t가격");
		int sum = 0;
		for (int i = 0; i < icecreams.length; i++) {
			System.out.print((i + 1) + "\t");
			icecreams[i].print();
			sum += icecreams[i].getPrice();
		}
		System.out.println("총 판매액 : " + sum + "원");
	}

	static int getIcecreamCount() {

		System.out.print("아이스크림 몇개 구입할꺼야? => ");
		int cnt = Integer.parseInt(sc.nextLine());

		return cnt;
	}
}
