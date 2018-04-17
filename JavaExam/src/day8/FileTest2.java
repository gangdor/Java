package day8;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("점검하려는 파일명을 프로그램 아규먼트로 전달하세요.");
			return; // 프로그램 종료
		}
		File f = new File(args[0]);
		if (f.exists()) { // exists : f가 존재하는가 안하는가, boolean형임
			if (f.isDirectory()) { // isDirectory : 디렉토리냐 아니냐
				System.out.println("디렉토리입니다.");
			} else {
				System.out.println(f.length() + "바이트의 파일입니다.");
				// length : 파일의 길이정보
			}
		} else {
			System.out.println("존재하지 않습니다.");
		}
		System.out.println("프로그램 종료");
	}
}
