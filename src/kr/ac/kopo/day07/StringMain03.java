package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {

		String str = "hello world!";
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'r')
//				System.out.println("r 위치 : " + i);
//		}

//		char search = 'r';
//		String search = "llo";
//		String search = "l";
		String search = "p";
		System.out.println(search + " 위치 : " + str.indexOf(search));
		System.out.println(search + " 위치 : " + str.indexOf(search, 5));

		search = "l";
		System.out.println("< " + search + "위치 index 출력 >");
		int index = str.indexOf(search);
		while (index != -1) {
			System.out.println("시작인텍스 : " + index);
			index = str.indexOf(search, index + 1);
		}
//		int index = 0;
//		while (str.indexOf(search, index + 1)) {
//			System.out.println("시작인텍스 : " + index);
//			index = ;
//		}

		str = "hello world!";
		String subStr = str.substring(3, 8);
		System.out.println("susString(3,8) : " + subStr);
		System.out.println("susString(6) : " + str.substring(6));

		str = "hello" + "!!!!";
		subStr = "hello".concat("!!!!"); // 얜 그냥 더하기 쓰면 됨 ㅋㅋ
		System.out.println("concat() : " + subStr);

		String result = str.replace("l", "rr");
		System.out.println("replace(\"l\", \"rr\") : " + result);

		str = "     hello world     ";
		System.out.printf("[%s] 길이 : %d\n", str, str.length());
		result = str.trim();
		System.out.printf("[%s] 길이 : %d\n", result, result.length());

		str = "Hello world!!";
		System.out.println("str : " + str);
		System.out.println("대문자 : " + str.toUpperCase());
		System.out.println("소문자 : " + str.toLowerCase());

		String data = "홍길동전:허균:조선시대";
		String[] bookInfo = data.split(":");
		System.out.println("split() : " + Arrays.toString(bookInfo));

		int num = 123;
		String strNum = String.valueOf(num); // num + ""
		System.out.println(strNum + 100);
	}
}
