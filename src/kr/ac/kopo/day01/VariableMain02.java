package kr.ac.kopo.day01;

class Test {
	
}

public class VariableMain02 {
	
	public static void main(String[] args) {
		// "Hello" 문자열을 저장하기 위한 변수 str 선언
		String  str;
		str = "Hello";
		
		String str1 = "Hello1";
		String str2 = new String("Hello2");
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		Test t = new Test();
		System.out.println(t);
	}
	
}

