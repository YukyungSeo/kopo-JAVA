package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
콘솔모드에서
$ java IOMain04_1 Koala.jpg Koala2.jpg 입력시

Koala.jpg -> Koala2.jpg 복사

*/
public class IOMain04_1 {

	public static void main(String[] args) {

		System.out.println("args : " + Arrays.toString(args));

		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("iotest/" + args[0]);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream("iotest/" + args[1]);
			bos = new BufferedOutputStream(fos);

			long start = System.currentTimeMillis();

			while (true) {
				// buffer로 여러 bytes 저장
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			bos.flush(); // 버퍼에 남아있을 수 있으므로 한번더 flush를 해주는 것이 좋다.

			long end = System.currentTimeMillis();

			System.out.println("소요시간 : " + (end - start) / 1000. + "초");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try-catch 문을 각각 작성해야한다.
			// fis.close()를 실행하다가 문제가 발생해도 fos.close()를 수행해야하므로.
			// 열린 순서 반대로 닫는다.(stack) filter부터 닫고 file을 닫는다.

			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			try {
				if (fis != null)
					fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("파일 복사가 완료되었습니다");
	}
}
