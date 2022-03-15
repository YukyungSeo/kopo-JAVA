package kr.ac.kopo.day05.homework0314;

import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		int[] sum = new int[2];
		Scanner sc = new Scanner(System.in);

		// 3. while문으로 작성
//		int loc = 0;
//		while (loc < nums.length) {
//			System.out.println(loc + 1 + "번째 정수 입력 : ");
//			nums[loc] = sc.nextInt();
//			if(nums[loc] >= 0) {
//				sum[nums[loc] % 2] += nums[loc];
//				loc++;
//			}
//		}

		// 2. loop 1개로 줄임 => best!
		for (int i = 0; i < nums.length; ) {
			System.out.print(i + 1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if (nums[i] >= 0) {
				sum[nums[i] % 2] += nums[i];
				i++;
			}
		}

		// 1. 2중 loop문 사용함
//		for (int i = 0; i < nums.length; i++) {
//			do {
//				System.out.print(i + 1 + "번째 정수 입력 : ");
//				nums[i] = sc.nextInt();
//			} while (nums[i] < 0);
//			sum[nums[i] % 2] += nums[i];
//		}

		String[] title = { "짝수", "홀수" };
		for (int mod = 0; mod <= 1; mod++) {
			System.out.println("< " + title[mod] + " >");
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] % 2 == mod)
					System.out.print(nums[i] + " ");
			}
			System.out.println();
			System.out.println(title[mod] + " 총합 : " + sum[mod]);

		}
		sc.close();
	}
}
