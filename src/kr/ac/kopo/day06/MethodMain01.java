package kr.ac.kopo.day06;

/*

	**********
	Hello
	**********
	Hi
	**********
	Bye
	**********
	
	반환형 메소드명([파라미터]) {
		문장;
		문장;
	}

 */
public class MethodMain01 {

	static int printStar(char ch, int cnt) {

		for (int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();

		return ch + cnt;
	}

	public static boolean aaa() {
		boolean bool = true;
		System.out.println("A");
		System.out.println("B");
		
		if(bool)
			return false;

		System.out.println("C");
		System.out.println("D");
		
		return true;
		
	}
	public static void main(String[] args) {

		// 반복되는 요소가 있으나 이게 연속되지 않으면 for문을 사용할 수 없다.
		// 이런 중복은 함수를 사용할 수 있다.
		
//		aaa();
		
		int code = printStar('A', 10);
		System.out.println(code);
		
		System.out.println("Hello");
		printStar('B', 20);
		System.out.println("Hi");
		printStar('a', 5);
		System.out.println("Bye");
		printStar('z', 8);
		System.out.println(5.5);
	}
}
