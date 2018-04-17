package day8;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	public static void main(String[] args) {
		//점검하려는 파일명이나 디렉토리명을 표준입력(키보드)로 받아 처리하도록 소스 수정
		//C:/gangdor/workspace/JavaExam/src/day7/Card.java
		Scanner scan = new Scanner(System.in);
		System.out.print("디렉토리 경로 입력 : ");
		String file = scan.nextLine();
		
		File f = new File(file);

		if (f.exists()) { // exists : f가 존재하는가 안하는가, boolean형임
			if (f.isDirectory()) { //isDirectory : 디렉토리냐 아니냐
				System.out.println("디렉토리입니다.");
			} else {
				System.out.println(f.length() + "바이트의 파일입니다."); 
				// length : 파일의 길이정보
			}
		} else {
			System.out.println("존재하지 않습니다.");
		}
		scan.close();
		System.out.println("프로그램 종료");
	}
}
