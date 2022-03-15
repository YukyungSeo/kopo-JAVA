package kr.ac.kopo.day05;

public class ArrayMain06 {

	public static void main(String[] args) {

		// 두 방식은 동일하다
		// 1.
//		int[][] arr = new int[3][4];

		// 2.
		int[] ar01 = new int[4];
		int[] ar02 = new int[4];
		int[] ar03 = new int[4];
		int[][] arr = { ar01, ar02, ar03 };

		System.out.println("arr : " + arr);
		System.out.println("arr.length : " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %s\n", i, arr[i]);
		}

		for (int i = 0; i < arr[0].length; i++) {
			arr[0][i] = (i + 1) * 10;
		}
		
		for (int[] is : arr) {
			for (int i : is) {
				System.out.printf("%-3d ", i);
			}
			System.out.println();
		}
	}
}
