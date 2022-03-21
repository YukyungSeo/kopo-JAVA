package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {

		"hello".length(); // nonStatic
		String.valueOf(false); // static 클래스명.함수명
		Math.random(); // static 클래스명.함수명
		
//		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
		Employee.employeeCntInfo();
		
		Employee e = new Employee("홍길동", 3300, "사원");
		Employee e2 = new Employee("강길동", 3800, "대리");

		e.info();
		e2.info();
		Employee.employeeCntInfo();

	}
}
