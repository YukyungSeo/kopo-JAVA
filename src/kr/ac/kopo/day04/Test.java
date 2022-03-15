package kr.ac.kopo.day04;

public class Test {
	public static void main(String[] args) {
		char[] ch = new char[2];
		System.out.println(ch[0]);

		char a = '\0';
		char b = '\u0000';

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println(a == b ? true : false);
	}
}
