package kr.ac.kopo.day03;

public class ExamMain01 {
	public static void main(String[] args) {
		
//		for (int i = 0; i < 10; i++) {
		for (int i = 10; i >= 1; i--) {
			System.out.println("Hello");
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		for (int i = 5; i > 0; i--) {
			System.out.print(i);			
		}
		System.out.println();
	}
}
