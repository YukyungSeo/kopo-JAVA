package kr.ac.kopo.day04.homwork0311;

public class HomeworkMain08_4 {

	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < 5; j++) {
					System.out.print(j < i ? '-' : '*');
				}
			} else {
				for (int j = 0; j < 5; j++) {
					System.out.print(j < 8 - i ? '-' : '*');
				}
			}
			System.out.println();
		}
	}
}
