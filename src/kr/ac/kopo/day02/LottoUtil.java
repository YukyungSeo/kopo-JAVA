package kr.ac.kopo.day02;

import java.util.Random;

/** -> 문서화 주석
 * 로또와 관련된 여러가기 기능클래스
 * @author DA
 *
 */
public class LottoUtil {
	/**
	 * 오늘의 로또 확률을 알려주는 메소드
	 */
	public void todayProbability() {

		Random r = new Random();
		int p = r.nextInt(101); // 0 ~ 100
		
		System.out.println("오늘의 로또 확률은 " + p + "%입니다 ");
	}
}
