package kr.ac.kopo.day05.homework0314;

import java.util.Scanner;

public class HomeworkMain05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nums = { 1, 2, 3, 4, 5 };

		System.out.println("< BEFORE >");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.print("Left(-), Right(+) : ");
		char ch = sc.next().charAt(0);

		System.out.print("Start Index(0 - 4) : ");
		int index = sc.nextInt();

		System.out.println("< AFTER >");
		int sign = ch == '+' ? 1 : -1;
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[(index + sign * i + nums.length) % nums.length] + " ");
		}

//		if (ch == '+') {
//			for (int i = 0; i < nums.length; i++) {
//				System.out.print(nums[(index + i) % nums.length] + " ");
//			}
//		} else if (ch == '-') {
//			for (int i = 0; i < nums.length; i++) {
//				System.out.print(nums[(index - i + nums.length) % nums.length] + " ");
//			}
//		}

//		 if (ch == '+') {
//			for (int i = index; i < nums.length; i++) {
//				System.out.print(nums[i] + " ");
//			}
//			for (int i = 0; i < index; i++) {
//				System.out.print(nums[i] + " ");
//			}
//		} else if (ch == '-') {
//			for (int i = index; i >= 0; i--) {
//				System.out.print(nums[i] + " ");
//			}
//			for (int i = nums.length - 1; i < index; i--) {
//				System.out.print(nums[i] + " ");
//			}
//		}
		sc.close();
	}
}
