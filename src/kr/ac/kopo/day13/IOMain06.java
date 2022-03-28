package kr.ac.kopo.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain06 {

	public static void main(String[] args) {
		read();
		write();
	}

	private static void write() {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("iotest/data.dat");
			dos = new DataOutputStream(fos);
			char c = 'A';
			int num = 99;
			double f = 12.34;

			fos.write(c); // 1byte
			dos.writeChar(c); // 2bytes
			dos.writeInt(num); // 4bytes
			dos.writeDouble(f); // 8btes

			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}

		System.out.println("파일저장 완료...");
	}

	private static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			
			fis = new FileInputStream("iotest/data.dat");
			dis = new DataInputStream(fis);

			// 출력한 순서와 입력하는 순서가 같아야 읽을 수 있음
			int i = dis.read();
			char c = dis.readChar();
			int i2 = dis.readInt();
			double d = dis.readDouble();
			
			System.out.println("첫번재 문자 : " + (char)i);
			System.out.println("두번재 문자 : " + c);
			System.out.println("정수 : " + i2);
			System.out.println("실수 : " + d);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
	}
}
