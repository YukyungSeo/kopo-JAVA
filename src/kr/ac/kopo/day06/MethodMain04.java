package kr.ac.kopo.day06;

public class MethodMain04 {

	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
		
		System.out.print("2 - 9 사이의 단을 입력 : ");
		int dan = gugudan.getDan();
		
		gugudan.print(dan);
		
//		gugudan.print();
		
		System.out.print("시작단 입력 : ");
		int startDan = gugudan.getDan();
		
		System.out.print("종료단 입력 : ");
		int endDan = gugudan.getDan();

		System.out.println(startDan + " : " + endDan);
		
		gugudan.print(startDan, endDan);
	}
}
