package kr.ac.kopo.day04.homework0311;

public class HomeworkMain08_3 {

	public static void main(String[] args) {

		int star = 5;
		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 5 - star; j++) {
				System.out.print("-");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();

			if (i < 4)
				star--;
			else
				star++;
		}
	}
}
