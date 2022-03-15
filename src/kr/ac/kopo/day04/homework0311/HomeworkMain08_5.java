package kr.ac.kopo.day04.homework0311;

public class HomeworkMain08_5 {

	public static void main(String[] args) {

		int start = 0;
		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(j < start ? '-' : '*');
			}
			System.out.println();
			start += i < 4 ? 1 : -1;
		}
	}
}
