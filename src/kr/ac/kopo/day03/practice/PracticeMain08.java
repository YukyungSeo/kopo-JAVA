package kr.ac.kopo.day03.practice;

public class PracticeMain08 {

	public static void main(String[] args) {
		// 방법 1
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 방법 2
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

		// 방법 3
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(j > i ? " " : "*");
			}
			System.out.println();
		}
	}
}
