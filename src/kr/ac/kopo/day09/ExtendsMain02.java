package kr.ac.kopo.day09;

// 상속관계
// java.lang.Object
// 		kr.ac.kopo.day09.A
// 			kr.ac.kopo.day09.B
// 				kr.ac.kopo.day09.C

class A extends Object {
	A() {
		System.out.println("A() 호출 ...");
	}
}

class B extends A {
	B() {
		// super(); 가 숨어있다.
		System.out.println("B() 호출 ...");
	}
}

class C extends B {
	C() {
		System.out.println("C() 호출 ...");
	}
}

public class ExtendsMain02 {

	public static void main(String[] args) {
//		new A();
//		new B();
		new C();
	}
}
