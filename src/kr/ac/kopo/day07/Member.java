package kr.ac.kopo.day07;

public class Member {

	final static String NOWAY = "알수없음";

	String name = "알수없음"; // 값이 잘 변하지 않을 때, 상수로 사용할 수 있다. 사용가능하다.
	int age;
	String bloodType;

	
	// 메소드를 자주 호출하는 방법이 좋은 방법은 아니다. 속도가 더딜 수 있다.
	// 그렇지만 중복성을 생각해보면 이렇게 생성될 수도 있다.
	Member() {
		this("알수없음");
		// Member("알수없음", -1, "알수없음"); 이렇게 하면 이건 생성자가 아닌 함수를 호출하는 것이다.
	}

	Member(String name) {
		this(name, -1);
	}

	Member(String name, int age) {
		this(name, age, "알수없음");
	}

	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}

	void info() {
		System.out.println("이름 : " + this.name + ",\t나이 : " + this.age + ",\t혈액형 : " + this.bloodType);
	}
}


//public class Member {
//
//	final static String NOWAY = "알수없음";
//
//	String name = "알수없음"; // 값이 잘 변하지 않을 때, 상수로 사용할 수 있다. 사용가능하다.
//	int age;
//	String bloodType;
//
//	Member() {
//		this("알수없음", -1, "알수없음");
//		// Member("알수없음", -1, "알수없음"); 이렇게 하면 이건 생성자가 아닌 함수를 호출하는 것이다.
//	}
//
//	Member(String name) {
//		this(name, -1, "알수없음");
//	}
//
//	Member(String name, int age) {
//		this(name, age, "알수없음");
//	}
//
//	Member(String name, int age, String bloodType) {
//		this.name = name;
//		this.age = age;
//		this.bloodType = bloodType;
//	}
//
//	void info() {
//		System.out.println("이름 : " + this.name + ",\t나이 : " + this.age + ",\t혈액형 : " + this.bloodType);
//	}
//}

//public class Member {
//
//	final static String NOWAY = "알수없음";
//
//	String name = "알수없음"; // 값이 잘 변하지 않을 때, 상수로 사용할 수 있다. 사용가능하다.
//	int age;
//	String bloodType;
//
//	Member() {
//		this.name = "알수없음";
//		this.age = -1;
//		this.bloodType = "알수없음";
//	}
//
//	Member(String name) {
//		this.name = name;
//		this.age = -1;
//		this.bloodType = "알수없음";
//	}
//
//	Member(String name, int age) {
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알수없음";
//	}
//
//	Member(String name, int age, String bloodType) {
//		this.name = name;
//		this.age = age;
//		this.bloodType = bloodType;
//	}
//
//	// 자동 생성, super()가 추가
////	public Member(String name, int age, String bloodType) {
////		super();
////		this.name = name;
////		this.age = age;
////		this.bloodType = bloodType;
////	}
//
//	void info() {
//		System.out.println("이름 : " + this.name + ",\t나이 : " + this.age + ",\t혈액형 : " + this.bloodType);
//	}
//}
