package kr.ac.kopo.day08.extend;

public class Employee {

	// public은 보안에 취약하다.
	// private으로 하면 자식도 접근할 수 없음
	// -> Manager02는 에러남, Manager03은 super()로 접근하기 때문에 에러 안남

	String name;
	int salary;
	String grade;

	Employee() {
	}

	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}

	void info() {
		System.out.println("사원명 : " + this.name + ", 연봉 : " + this.salary + "만원, 직급 : " + this.grade);
	}
}
