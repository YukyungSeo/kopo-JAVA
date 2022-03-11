package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {

		int a = 1, b = 0, c = -1;

//		boolean bool = ++a > 1 || ++b > 1; 
//		// := (++a > 1) || (++b > 1)
//		// || 뒤 관계관계연산자는 연산되지 않음
//		// ++b 수행 안됨
		
//		boolean bool = --a > 1 && ++b > 1 || ++c > 0; 
//		// (--a > 1 && ++b) > 1 || ++c > 0
//		// &&가 || 보다 우선순위가 높음
//		// && 뒤 관계관계연산자는 연산되지 않음
//		// ++b 수행 안됨
		
//		boolean bool = a++ > 0 || b-- >= 1 && c++ <= 0; 
//		// (--a > 1 && ++b) > 1 || ++c > 0
//		// &&가 || 보다 우선순위가 높지만 왼쪽부터 수행
//		// || 앞이 true이므로 뒤는 연산 X
		
		boolean bool = b-- >= 1 && c++ <= 0 || a++ > 0; 
		// (--a > 1 && ++b) > 1 || ++c > 0
		// &&가 || 보다 우선순위가 높지만 왼쪽부터 수행
		// || 앞이 true이므로 뒤는 연산 X

		System.out.println("bool : " + bool);
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);

	}
}
