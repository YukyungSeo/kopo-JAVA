package kr.ac.kopo.day04.homework0311;

public class HomeworkMain03 {

	public static void main(String[] args) {

		int snail = 0, hour = 0;

		while (snail < 100) {
			hour++;
			snail += snail < 50 ? 5-1 : 5-2;
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", hour, snail);
		}

		
//		int snail = 0, hour = 0;
//
//		while ((snail += 5) < 100) {
//			hour++;
//			snail += snail < 50 ? -1 : -2;
//			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", hour, snail);
//		}
//		System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", ++hour, snail);

//		int deep = 100;
//		int point = 0;
//		int speed = 5;
//		int slide1 = 1;
//		int slide2 = 2;
//
//		for (int time = 1; point < deep; time++) {
//
//			point += speed;
//			point -= point < 50 ? slide1 : slide2;
//
//			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", time, point);
//		}

	}
}
