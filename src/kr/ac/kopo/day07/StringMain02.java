package kr.ac.kopo.day07;

public class StringMain02 {

	public static void main(String[] args) {
		// RAM에 상수를 저장할 수 있는 공간(method 영역)이 있어,
		// "Hello"값이 그 공간에 저장되고,
		// str과 str2 모두 그곳을 가리키고 있다.
		// 이 영역은 가리키고 있는 참조변수가 없어도 Garbage collector가 수거해가지 않는다.
		// 프로그램이 종료될 때가지 존재한다.
//		String str = "Hello";	
//		String str2 = "Hello";	
		String str = new String("Hello");
		String str2 = new String("HELLO");

		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);

		if (str == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		if (str.equals(str2)) {
			System.out.println("문자열비교 : 같다");
		} else {
			System.out.println("문자열비교 : 다르다");
		}

		System.out.println("대소문자관계없이 문자열비교 : " + str.compareToIgnoreCase(str2));

		String[] names = { "홍길동", "홍길순", "홍길동", "박길동", "홍가네", "윤가네", "한길홍" };
		System.out.println("< 전체 이름이 홍길동인 사람 출력 >");
		for (String name : names) {
			if(name.equals("홍길동"))
				System.out.println(name);
		}
		
		System.out.println("< 성이 홍씨인 사람 출력 >");
		for (String name : names) {
			if(name.startsWith("홍"))
				System.out.println(name);
		}
		
		System.out.println("< 이름이 길동인 사람 출력 >");
		for (String name : names) {
			if(name.endsWith("길동"))
				System.out.println(name);
		}
		
		System.out.println("< 이름에 홍이 포함된 사람 출력 >");
		for (String name : names) {
			if(name.contains("홍"))
				System.out.println(name);
		}
		
		str = "apple";
		str2 = "banana";
//		str2 = "boat";
		int cmp = str.compareTo(str2);
		if(cmp == 0	) {
			System.out.println(str + " == " + str2);
		} else if(cmp > 0	) {
			System.out.println(str + " > " + str2);
		} else {
			System.out.println(str + " < " + str2);
		}
	}
}
