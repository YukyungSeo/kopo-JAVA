package kr.ac.kopo.day05;

// 실행클래스 : 하나의 실행 클래스(main 메소드)와 여러개의 참조 클래스를 가짐
public class CarMain {

	public static void main(String[] args) {

		Car c = new Car();
		c.name = "소나타";
		c.company = "현대";

		Car c2 = new Car();
		c2.name = "K9";
		c2.company = "기아";

		System.out.println("첫번째 자동차명 : " + c.name);
		System.out.println("두번째 자동차명 : " + c2.name);
		System.out.println(c.toString());
		System.out.println(c2.toString());
	}
}
