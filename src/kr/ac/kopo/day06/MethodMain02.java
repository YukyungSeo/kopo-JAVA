package kr.ac.kopo.day06;

class 고양이 {
	void 잠자다() {
		System.out.println("고양이가 잠을 잔다");
	}

	void 냐용하다() {
		System.out.println("고양이가 냐용합니다");
	}
}

class Method {
	
	// 메소드 오버로딩(overloading)
	// 같은 클래스 내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른 것
	void call() {
		System.out.println("call() 메소드 호출 ...");
	}

//	void call(int i) {
//		System.out.println("call(int) 메소드 호출 ...");
//	}

	void call(double d) {
		System.out.println("call(double) 메소드 호출 ...");
	}
	
	void call(boolean b) {
		System.out.println("call(boolean) 메소드 호출 ...");
	}
	
	void call(String str, int n) {
		System.out.println("call(String, int) 메소드 호출 ...");
	}
}

public class MethodMain02 {

	public static void main(String[] args) {

		Method m = new Method();
		m.call();
		m.call(1); // void call(int i) 함수가 없어도 void call(double d)이 대신 호출될 수 있다. int->double 묵시적 형변환
		m.call(1.1);
		m.call(true);
		m.call("hello", 5);
//		m.call(5, "hello"); // 매개변수 순서 중요, error 발생
		

		고양이 나비 = new 고양이();
		나비.잠자다();
		나비.냐용하다();

	}
}
