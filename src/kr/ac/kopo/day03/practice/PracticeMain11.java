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
public class PracticeMain11 {

	public static void main(String[] args) {
		
		// 반복문 5개, 조건문 1개
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 8 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i - 3; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		System.out.println();
		System.out.println();

//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (j < 5-i)
//					System.out.print("*");
////				else
////					System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
