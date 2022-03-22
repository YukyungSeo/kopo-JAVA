package kr.ac.kopo.day09.abs02;

import java.util.Scanner;

public class Menu {

	private Scanner sc;

	public Menu() {
		super();
		this.sc = new Scanner(System.in);
	}

	private String select() {
		System.out.print("프린터를 선택하세요(1.LG  2.SAMSUNG  3.HP) => ");
		return sc.nextLine();
	}

	private void print(String type) {
		// 강제성을 이용해 표준화를 만든다.
		Printer printer = null;
		switch (type) {
		case "1":
			printer = new LGPrinter();
			break;
		case "2":
			printer = new SamsungPrinter();
			break;
		case "3":
			printer = new HPPrinter();
			break;
		}
		if (printer != null)
			printer.print();
	}
	
//	public void 설치 (LGPrinter lg) {
//		lg.print();
//	}
//	
//	public void 설치(SamsungPrinter sam) {
//		sam.print();
//	}
//	
//	public void 설치(Printer printer) {
//		printer.print();
//	}

//	public void print(String type) {
//		// 강제성을 이용해 표준화를 만든다.
//		switch (type) {
//		case "1":
//			LGPrinter lg = new LGPrinter();
//			lg.print();
//			break;
//		case "2":
//			SamsungPrinter sam = new SamsungPrinter();
//			sam.print();
//			break;
//		case "3":
//			HPPrinter hp = new HPPrinter();
//			hp.print();
//			break;
//		}
//	}

	public void process() {

		String type = select();
		print(type);
	}

}
