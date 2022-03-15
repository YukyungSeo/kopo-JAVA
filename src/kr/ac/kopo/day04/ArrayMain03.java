package kr.ac.kopo.day04;

public class ArrayMain03 {
	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		// 기본형 변수의 값을 수정하는데는 사용할 수 없음
//		int data = 1;
//		for (int i : arr) {
//			i = data++;
//		}

		System.out.println("< PRINT >");
//		System.out.println(Arrays.toString(arr));

		for (int i : arr) {
			System.out.print(i + "\t");
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + "\t");
//		}
//		System.out.println();

	}
}
