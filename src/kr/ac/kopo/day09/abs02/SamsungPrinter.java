package kr.ac.kopo.day09.abs02;

public class SamsungPrinter extends Printer {

	public SamsungPrinter() {
		super();
	}

	public SamsungPrinter(String model) {
		super(model);
	}

	@Override
	public void print() {
		System.out.println("SAMSUNG 프린터에서 출력합니다.");
	}

}
