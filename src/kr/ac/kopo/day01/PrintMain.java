package kr.ac.kopo.day01;

/*
 * 상수종류
 * 1. 정수형 상수
 * 2. 실수형 상수
 * 3. 문자형 상수 : 대문자, 소문자, 숫자문자, 특수문자, 공백문자(' ', '\n', '\t'), 한글
 * 4. 문자열 상수
 * 5. 논리형 상수 
 */

/*
 * 출력메소드
 * 1.println	: 개행문자 포함
 * 2.print		: 개행문자 포함X
 * 3.printf		: JDK1.5 추가, 개행문자 포함X, 출력문자형태
 * 		출력문자
 * 			%d	: 정수
 * 			%f	: 실수
 * 			%c	: 문자
 * 			%s	: 문자열
 * 			%b	: 논리값
 */

public class PrintMain {
	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(11.2);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);
		System.out.println(23 + "살");
		System.out.println(25+34+"살");
		System.out.println(25+34.5+"살");
		System.out.println("살" + 4 + 12);
		System.out.println("넹넹" + '!');
		System.out.println("이것은 "+ true);
		System.out.println('a' + 'b');
		
		System.out.println(10 + "+" + 20 + " = " + 10 + 20);		
		System.out.println(10 + "+" + 20 + " = " + (10 + 20));
		System.out.printf("%d살\n", 23);
		System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
		
		System.out.printf("[%-7d]\n", 1200);
		System.out.printf("[%7d]\n", 950);
		System.out.printf("[%07d]\n", 11200);
		System.out.printf("[%f]\n", 12.23); //default는 아래 6자리
		System.out.printf("[%.2f]\n", 12.3456);
		System.out.printf("[%.7f]\n", 12.456);
	}
}
