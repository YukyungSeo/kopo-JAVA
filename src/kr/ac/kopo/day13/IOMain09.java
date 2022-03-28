package kr.ac.kopo.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain09 {

	public static void write() {

		Icecream ice = new Icecream("비비빅", 1000, "");

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {

			fos = new FileOutputStream("iotest/icecream.txt");
			dos = new DataOutputStream(fos);

			// 문자열을 잘 못 읽을 수 있음
//			dos.writeUTF(ice.getName());
//			dos.writeInt(ice.getPrice());
			
			dos.writeUTF(ice.getName() + "#" + ice.getPrice());

			dos.flush();

			System.out.println("icecream.txt에 저장완료...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}

	}

	private static void read() {

		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("iotest/icecream.txt");
			dis = new DataInputStream(fis);

			// 문자열을 잘 못 읽을 수 있음
//			String name = dis.readUTF();
//			int price = dis.readInt();
//			Icecream ice = new Icecream(name, price);

			String[] data = dis.readUTF().split("#");
			Icecream ice = new Icecream(data[0], Integer.parseInt(data[1]));

			System.out.println("로딩된 아이스크림 : " + ice);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
	}

	public static void main(String[] args) {

		write();
		read();
	}

}
