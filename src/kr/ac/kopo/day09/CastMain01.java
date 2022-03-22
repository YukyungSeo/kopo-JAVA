package kr.ac.kopo.day09;

public class CastMain01 {

	
//	// overload
//	public static void print(Child01 c) {
//		c.print();
//	}
//	
//	// overload
//	public static void print(Child02 c) {
//		c.print();
//	}
	
	// overload
	// 객체형변환(묵시적형변환) - 상속관계만 가능!
	public static void print(Parent p) {
		p.print(); // override한 메소드가 호출
//		p.play(); // error
		
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.play();
			c.sing();
		}
		
//		System.out.println("Child01 : " + (p instanceof Child01));
//		System.out.println("Child02 : " + (p instanceof Child02));
//		System.out.println("Parent : " + (p instanceof Parent)); 
//		// Child0x 는 Parent 메모리 공간을 가지고 있으므로 true가 반환된다
//		System.out.println();
	}
	
	public static Object returnfun() {
		
		Object o = new Object();
		o.equals(o);
		
//		return new java.util.Random(); // 가능
		return 10; // 가능
//		return new java.util.Scanner(System.in); // 가능
	}
	
	public static void main(String[] args) {
		
		print(new Child01());
		print(new Child02());
		print(new Parent());
		
//		Child01 c01 = new Child01();
//		c01.print();
		
//		Child02 c02 = new Child02();
//		c02.print();
		
//		Parent p = new Parent();
//		p.print();
		
	}
}
