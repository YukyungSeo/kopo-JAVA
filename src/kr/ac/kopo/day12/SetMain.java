package kr.ac.kopo.day12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 	Set : 순서 X, 중복 X
 		- HashSet
 		- TreeSet
 */
public class SetMain {

	public static void main(String[] args) {

//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>(); // 문자열 오름차열로 저장됨
		System.out.println("\"one\" 입력 성공여부 : " + set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		System.out.println("\"one\" 입력 성공여부 : " + set.add("one")); // 중복 허용 X

		System.out.println("전체 원소의 개수 : " + set.size() + "개");

		// 전체 데이터 접근방법 3가지
		// 1. 1.5버전의 for문을 이용
		// 2. toArray() 메소드 이용
		// 3. Iterator 객체 이용

		System.out.println("< 1.5버전을 이용한 출력 >");
		for (String str : set) { // 어떤 순서로 출력될지는 모름
			System.out.println(str);
		}

		System.out.println("< toArray() 이용한 출력 >");
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// iterator(순환객체) 주요메소드
		// - hasNext() : 데이터의 존재 여부 판단
		// - next() : 데이터 접근
		System.out.println("< Iterator 이용한 출력 >");
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

//		System.out.println(set.remove("one"));
	}
}
