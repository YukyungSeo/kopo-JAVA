package kr.ac.kopo.day04.homwork0311;

public class HomeworkMain08 {

	public static void main(String[] args) {

		int star = 1;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < star; j++) {
				System.out.print("-");
			}
			System.out.println();
			star += i < 4 ? 1 : -1;
		}
		System.out.println();
	}
}
