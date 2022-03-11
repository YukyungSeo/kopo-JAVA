package kr.ac.kopo.day03.practice;

/*

*****
****
***
**
*
**
***
****
*****

 */
public class PracticeMain10 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < i - 3; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 5-i)
					System.out.print("*");
//				else
//					System.out.print("*");
			}
			System.out.println();
		}
	}
}
