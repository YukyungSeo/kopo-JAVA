package kr.ac.kopo.day06.practice;

import java.util.Scanner;

public class Icecream {
	Scanner sc = new Scanner(System.in);

	String name; // 아이스크림명
	int price; // 아이스크림가격

	public void setName() {
		System.out.print("아이스크림명 : ");
		this.name = sc.nextLine();
	}

	public void setPrice() {
		System.out.print("아이스크림가격 : ");
		this.price = Integer.parseInt(sc.nextLine());
	}

	public int getPrice() {
		return this.price;
	}

	public void print() {
		System.out.println(this.name + "\t" + this.price);
	}

}
