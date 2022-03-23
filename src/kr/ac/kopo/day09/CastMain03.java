package kr.ac.kopo.day09;

public class CastMain03 {

//	// overload

	public static void print(Child01 c) {
		c.print();
	}
//	
//	// overload
//	public static void print(Child02 c) {
//		c.print();
//	}

	Parent p = new Child01();

	public static void print(Parent p) {
		p.print();

		if (p instanceof Child01) {
			Child01 c = (Child01) p;
			c.study();
			c.sleep();
		} else if (p instanceof Child02) {
			Child02 c = (Child02) p;
			c.play();
			c.sing();
		}
	}

	public static void main(String[] args) {
//		Child01 c = new Child01();
//		Child02 c = new Child02();
		print(new Child01());
//		print(new Child02());
		print(new Parent());

	}
}
