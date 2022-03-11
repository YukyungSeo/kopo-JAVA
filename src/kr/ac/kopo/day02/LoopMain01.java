package kr.ac.kopo.day02;

/*
 * 반복문을 위한 기본요소 4가진
 * 1. 반복할문장(statement)
 * 2. 시작값(init)
 * 3. 증가/감소(incre/decre)
 * 4. 종료조건(expr)
 * 
 * 
 * 한바퀴 뛸 차례다;
 * while(조건) {
 * 		운동장 한바퀴 뛴다;
 * 		바퀴수 증가;
 * }
 * 
 * 1.init
 * while(2.expr) {
 * 		3.statement;
 * 		4.incre/decre;
 * }
 * 
 * 1 -> 2 조건 참		-> 3 -> 4
 *	 -> 2 조건 참		-> 3 -> 4
 *	 -> 2 조건 참		-> 3 -> 4
 *	 -> 2 조건 거짓
 * 
 * 조건이 거짓이 될 때까지 블럭스코프 내의 내용을 반복한다.
 * 
 * 
 * --------------------------------------------------
 * 
 * for(1.init; 2.expr; 3.incre/decre){
 * 		4.statement;
 * }
 * 
 * 
 * 1 -> 2 조건 참		-> 4 -> 3
 *	 -> 2 조건 참		-> 4 -> 3
 *	 -> 2 조건 참		-> 4 -> 3
 *	 -> 2 조건 거짓	-> 5
 * 
 * 조건이 거짓이 될 때까지 블럭스코프 내의 내용을 반복한다.
 * 
 */

public class LoopMain01 {

	public static void main(String[] args) {

		System.out.println("------for 반복문 시작-------");
		for (int cnt = 1; cnt <= 5; cnt++) {
			System.out.println("Hello");
		}
		System.out.println("------for 반복문 종료-------");

		System.out.println("------while 반복문 시작-------");
		int cnt = 1;
		while (cnt <= 5) {
			System.out.println("Hello");
			++cnt;
		}
		System.out.println("------while 반복문 종료-------");
	}
}
