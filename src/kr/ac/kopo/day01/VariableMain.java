package kr.ac.kopo.day01;


/*
 * 기본자료형
 * 논리형 : boolean
 * 문자형 : char
 * 정수형 : byte, short, int(기본), long
 * 실수형 : float, double(기본)
 * 
 * 
 * 변수 선언
 * 자료형 변수명;
 * 
 * 변수 대입
 * 변수명 = 값;
 * 
 * 변수 초기화(선언과 동시에 값 대입)
 * 자료형 변수명 = 값;
 * 
 */

public class VariableMain {
	
	static char b; // 멤버변수 자동초기화O
	
	public static void main(String[] args) {
		
		// 대문자 A를 저장하기 위한 변수 a 선언
		char a;
		a = 'A';
		
		// 정수 123을 저장하기 위한 변수 c 선언
		int c;
		c = 123;
		
		// 실수 3개를 저장하기 위한 변수 d1, d2, d3 선언
		double d1 = 222.2, d2 = 0, d3 = 12.34;
				
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
	}
}
