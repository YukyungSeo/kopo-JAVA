package kr.ac.kopo.day10;

import java.util.Random;

/* final */ class Super {
	@SuppressWarnings("unused")
	private /* final */ double PI = 3.14;

	Super() {
		PI = 3.141592;
	}

	public /* final */ void call() {
		System.out.println("SUPER::call()");
	}
}

class Sub extends Super {

	@Override
	public void call() {
		System.out.println("SUB::call()");
	}

}

@SuppressWarnings("serial")
class MyRandom extends Random {

	// nextInt(10) => 1 ~ 10
	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;
	}

	public int nextInt(int start, int end) {
		return super.nextInt(end - start) + start;
	}

}

public class FinalMain {

	public static void main(String[] args) {

//		Random r = new Random();
////		int random = r.nextInt(90) + 10; // 10~99
//		int random = r.nextInt(10) + 1; // 1~9

		Random r = new MyRandom();
		int random = r.nextInt(10);
		System.out.println(random);
		
		System.out.println(((MyRandom)r).nextInt(5, 20));
	}
}
