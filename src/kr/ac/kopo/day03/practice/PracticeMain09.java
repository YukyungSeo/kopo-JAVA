package kr.ac.kopo.day03.practice;

/*

*
**
***
****
*****
****
***
**
*

 */
public class PracticeMain09 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 방법 1
		for (int i = 0; i < 9; i++) {
			if (i < 4) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 9-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < (i < 5 ? i : 8 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
