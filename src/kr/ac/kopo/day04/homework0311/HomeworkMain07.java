package kr.ac.kopo.day04.homework0311;

public class HomeworkMain07 {

	public static void main(String[] args) {
		
		int step = 3;

		for (int dan = 2; dan <= 9; dan += step) {
			for (int value = 1; value < 10; value++) {
				for (int d = dan; d <= 9 && d < dan + step; d++) {
					System.out.printf("%d * %d = %2d\t", d, value, (d * value));
				}
				System.out.println();
			}
			System.out.println();

		}
	}
}
