package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain07 {

	public static void main(String[] args) {

		int[][] ar = new int[3][];
		for (int i = 0; i < ar.length; i++) {
//			ar[i] = new int[(int)(Math.random()*3)+2];	// 2, 3, 4 중에 출력	
			ar[i] = new int[3 + i]; // 2, 3, 4 중에 출력
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
//				System.out.printf("ar[%d][%d] ", i, j);
				ar[i][j] = i * 10 + j + 1;
			}
//			System.out.println();
		}

		for (int[] is : ar) {
			System.out.println(Arrays.toString(is));
		}
	}
}
