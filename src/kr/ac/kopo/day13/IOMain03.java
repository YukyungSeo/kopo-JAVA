package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	Koala.jpg -> Koala2.jpg 복사
 */
public class IOMain03 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");

			long start = System.currentTimeMillis();

			while (true) {
				// 1byte만 저장
				int c = fis.read();
				if (c == -1)
					break;
				fos.write(c);
			}
			fos.flush(); // 버퍼에 남아있을 수 있으므로 한번더 flush를 해주는 것이 좋다.

			long end = System.currentTimeMillis();

			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try-catch 문을 각각 작성해야한다.
			// fis.close()를 실행하다가 문제가 발생해도 fos.close()를 수행해야하므로.
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("파일 복사가 완료되었습니다");
	}
}
