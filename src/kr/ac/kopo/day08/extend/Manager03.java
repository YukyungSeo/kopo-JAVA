package kr.ac.kopo.day08.extend;

// 관리자(Manager02)는 사원(Employee)의 한 형태다 조건 부합 -> 상속관계 표현
public class Manager03 extends Employee {

	Employee[] empList; // 관리 사원 목록

	public Manager03() {
		super();
	}

	Manager03(String name, int salary, String grade, Employee[] empList) {
		super(name, salary, grade); // 이 줄이 없다면, default인 super(); 생성자가 실행되어 초기화가 되지 않는다.
		this.empList = empList;
	}

	@Override // IDE가 compile 시점에 에러까지 체크해줌
	void info() {
		super.info();
		// System.out.println("사원명 : " + this.name + ", 연봉 : " + this.salary + "만원, 직급 :
		// " + this.grade);

		System.out.println("---------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("---------------------------------------");
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("---------------------------------------");
	}
}
