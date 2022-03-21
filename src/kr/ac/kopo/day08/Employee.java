package kr.ac.kopo.day08;

public class Employee {

	String name;
	int salary;
	String grade;
	static int employeeCnt; // 얘는 Employee class와 관련이 있는 변수이다. main보다는 Employee class에 있는게 좋다.
	
	public Employee() {
		// 매개변수가 있는 생성자를 만들 때,
		// 기본 생성자를 같이 만들어 주는 것이 좋다.
		// 아무 내용이 없더라도.
		// 그래야 에러가 덜난다.
		Employee.employeeCnt++; 
		// static 변수를 구분하기 위해 
		// 자신의 변수 내에서도 Employee.emplyeeCnt 라고 [클래스이름.static변수명] 으로 표기하는 것이 좋다.
	}

	public Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		Employee.employeeCnt++;
	}

	void info() {
		System.out.println("사원명 : " + this.name + ", 연봉 : " + this.salary + "만원, 직급 : " + this.grade);
	}
	
	static void employeeCntInfo() {
		// static을 사용하지 않아도 에러는 나지 않지만,
		// static 변수만 사용하므로, static method로 사용하는 것이 좋다.
		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
	}
}
