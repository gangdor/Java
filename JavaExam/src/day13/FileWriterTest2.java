package day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer = null;
		String path = "C:/iotest";
		File isDir = new File(path); // 디렉토리 패스 설정
		if (!isDir.exists()) { // 디렉토리 존재하지 않는다면
			isDir.mkdirs(); // 디렉토리 생성해라
		}

		try {
			writer = new FileWriter("c:/iotest/output.txt", true); // 파일 생성
			char arr[] = { '객', '체', '지', '향', '언', '어', 'J', 'a', 'v', 'a' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write("\r\n"); // 개행문자 윈도우용
			writer.write(arr);
			writer.write("\r\n");
			writer.write("OCJP 시험 대비");
			writer.write("\r\n");
			System.out.println("파일에 출력완료!!");
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				if (writer != null)
					writer.close(); // 파일 사용한거 클로즈
			} catch (Exception e) {
				System.out.println("파일을 닫는동안 오류 발생!!");
			}
		}
	}
}
