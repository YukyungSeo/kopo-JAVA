package kr.ac.kopo.day11;

import java.io.FileReader;

public class ExceptionMain07 {

	public static void main(String[] args) {

		try { // 강제로 try/catch를 사용하게 함
			e();
			c();
			d();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		a();
		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void f() throws Exception {

	}

	public static void c() throws Exception {
		f();
	}

	public static void d() throws Exception {

	}

	public static void e() throws Exception {

	}

	public static void b() throws Exception {

		int[] arr = new int[3];
		System.out.println(arr[4]);

		FileReader fr = new FileReader("a.txt");
		fr.close();

	}

	@SuppressWarnings("null")
	public static void a() {

		try {
			String str = null;
			System.out.println(str.length());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
