package kr.ac.kopo.day02;

/*
 * 조건문
 * if(조건){
 * 		문장;
 * }
 * 
 * if(조건){
 * 		문장1;
 * } else {
 * 		문장2;
 * }
 * 조건 ? 문장1 : 문장2;
 * 
 * 보유하고 있는 책 권수 입력 : 1
 * 1 book
 * 
 * 보유하고 있는 책 권수 입력 : 5
 * 5 books
 */

public class IFMain01 {

	public static void main(String[] args) {

		int book = 5;

		System.out.print(book + "books");
		if (book > 1) {
			System.out.println("s");
		}
		
	}
}
