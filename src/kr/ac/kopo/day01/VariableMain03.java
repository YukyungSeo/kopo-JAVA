package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String[] args) {

		int a;
		byte b = 10;

		a = /* (int) */b; // 묵시적 형변환 - 명시 생략가능

		b = (byte) a;

		System.out.println(b);

		System.out.println(10 + 20.0);
		System.out.println(10 + (int) 20.0);

		double d = 10 + 20.2;
//		int e = 10 + 20.2; error
		int e = (int) (10 + 20.2);

		System.out.println(d);
		System.out.println(e);
		
		final int NUM = 100;
		System.out.println("NUM : " + NUM);
//		NUM = 20; error
//		System.out.println("NUM : " + NUM);
		
		double aaa = Math.PI*10;
		System.out.println(aaa);
		
		char ch = '!';
		ch = '\'';
		ch = '\"';
		ch = '\\';
		System.out.println(ch);
		
		String path = "D:\\Lecture\\java-workspace";
		System.out.println(path);
		
		String str = "\"hi\"";
		System.out.println(str);
		
	}
}
