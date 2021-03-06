package kr.ac.kopo.day06.practice.mvc;

public class IcecreamMain {

	public static void main(String[] args) {

		View view = new View();

		int cnt = view.getIcecreamCount();

		// 입력
		Icecream[] icecreams = new Icecream[cnt];
		for (int i = 0; i < icecreams.length; i++) {
			view.headlineGetIcecreamInfo(i + 1);
			icecreams[i] = new Icecream();
			icecreams[i].setName(view.getIcecreamName());
			icecreams[i].setPrice(view.getIcecreamPrice());
		}

		// 출력
		view.headlinePrintIcecreamInfo(cnt);
		int sum = 0;
		int num = 1;
		for (Icecream icecream : icecreams) {
			view.printIcecreamInfo(num++, icecream);
			sum += icecream.getPrice();
		}
		view.printSumOfIcecreamPrice(sum);
	}

}
