package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * alt+shift+s 누른 후, c 선택 => 기본 생성자
 * 						o 선택 => 매개변수 생성자
 * 						r 선택 => getter/setter
 * 						v 선택 => override/implement
 * 						s 선택 => toString() 
 * 
 */

public class MapMain02 {

	public static void main(String[] args) {

		Map<Member, Car> map = new HashMap<>();

		map.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "33가3333"));
		map.put(new Member("윤길동", "010-3333-4444"), new Car("K5", "45나1234"));
		// 홍길동 고객의 차량정보 변경
		map.put(new Member("홍길동", "010-1111-2222"), new Car("카니발", "82다8282"));

		System.out.println("총 개수 : " + map.size());
		System.out.println("");

		Set<Entry<Member, Car>> set = map.entrySet();
		for (Entry<Member, Car> entry : set) {
			Member member = entry.getKey();
			Car car = entry.getValue();

			System.out.println(member.toString());
			System.out.println(car.toString());
		}
	}
}

