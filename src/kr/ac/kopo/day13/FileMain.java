package kr.ac.kopo.day13;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {

		// file 정보 확인
		File fileObj = new File("iotest/a.txt");
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();

		System.out.println("파일명 : " + fileName);
		System.out.println("부모 : " + parent);

		System.out.println("파일 존재여부  : " + fileObj.exists());

		long fileSize = fileObj.length();
		System.out.println("파일 크기 : " + fileSize + "byte(s)");
		System.out.println(fileObj.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기불가능");

		long lastTime = fileObj.lastModified();
		String pattern = "yyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime)));

		// dir 정보 확인
		File dirObj = new File("iotest/강아지/리트리버");
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("디렉토리여부 : " + dirObj.isDirectory());
		System.out.println("파일여부: " + dirObj.isFile());

		if (!dirObj.exists()) {
//			dirObj.mkdir(); // 맨 마지막 폴더를 만드는게 목적인데, 그 전까지의 경로가 없으면 만들 수 없음
			dirObj.mkdirs(); // 중간 폴더들도 모두 생성

			File dirObj2 = new File("iotest");
			if (dirObj2.exists()) {

				// File[]로 리턴 : listFiles()
				File[] list = dirObj2.listFiles();
				for (File f : list) {
					System.out.print(f.getName() + "\t");
					System.out.println(f.isDirectory() ? "디렉토리" : "파일");
				}

				// 파일 이름만 리턴 : list()
//			String[] list = dirObj2.list();
//			for (String data : list) {
//				System.out.println(data);
//				File fileObj = new File(dirObj2.getName() + "/" + data);
//				System.out.println(fileObj.isDirectory() ? "디렉토리" : "파일");
//			}
			}
		}
	}
}
