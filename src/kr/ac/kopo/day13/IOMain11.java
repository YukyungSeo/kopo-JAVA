package kr.ac.kopo.day13;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class IOMain11 {

	public static void main(String[] args) {
		FileWriter fw;
		PrintWriter pw;
		
		InputStream is;
		InputStreamReader isr;
		
		try {
			
			// url이 없을 수 있으므로 예외처리
			URL urlObj = new URL("https://www.naver.com");

			fw = new FileWriter("iotest/naver.html");
			pw = new PrintWriter(fw); // println을 사용하여 write를 한다. 
			
			is = urlObj.openStream(); // naver server에 있는 file 내용을 읽고 싶다!! 연결해달라!
			isr = new InputStreamReader(is, "utf-8"); // utf는 3byte씩를 읽는다. 문자를 어떤 형식으로 읽을 건지 추가해줄 수 있다.
			
			while(true) {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char) c);
				pw.print((char)c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
