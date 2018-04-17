package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadWeb {

	public static void main(String[] args) {
		// 디렉토리 없으면 만들기 ㅇㅇ
		//FileWriter writer = null;
		String path = "c:/iotest/output"; //경로지정
		File isDir = new File(path); // path에 디렉토리 객체 생성자 호출 
		if (!isDir.exists()) { //해당경로에 없으면
			isDir.mkdirs(); //디렉토리 만들어라.
		}

		// 문자열 입력 받기
		System.out.println("URL 주소를 입력하세요."); 
		Scanner sc = new Scanner(System.in); //사용자로부터 입력받기
		String input = sc.nextLine(); //입력받기

		int index = input.indexOf("html"); // input에서 html 시작위치찾기 최초 0부터 시작
 		if (index > -1) { // if로 확장자 판별 // html일때, 서버에 요청하기
			String arr[] = input.split("/"); //입력받은 주소를 /로 구분하여 잘라
			String htmlName = arr[arr.length-1]; //맨마지막 블럭이 파일명일 것임
			//printWriter로 실제 파일 생성하기, 전달자로 전체 path+'/'+htmlName으로 저장경로 알려줌, UTF-8로 인코딩방법
			//FileWriter는 인코딩 지정하는 생성자가 없음, 한글깨짐
			try(PrintWriter writer = new PrintWriter(path+'/'+htmlName,"UTF-8");) {
				URL req = new URL(input); //URL req 객체 만듬, URL은 다 바이트기반임, 바이트를 담을 수 있는걸 만들어야겠음
				//바이트기반스트림 is, rep.openStream으로 URL과연결된 URLConnection의 InputStream을 얻는다. 서버에 요청함
				InputStream is = req.openStream();
				//바이트기반 스트림을 문자기반 스트림으로 연결시켜주는 isr, 연결하고자하는 is와 인코딩방식을 지정한다. 
				InputStreamReader isr = new InputStreamReader(is, "UTF-8");
				//문자기반으로 읽어들이는 br, 문자 기반이 된 isr를 읽어들이는 객체는 만든다.
				BufferedReader br = new BufferedReader(isr);
				while (true) {
					String data = br.readLine(); //줄단위로 데이터를 읽어들임, readLine은 다읽으면 null리턴
					if (data == null) //다읽으면 빠져나가고.
						break;
					writer.write(data+"\r\n"); //있으면 데이터를 Writer에 써라 즉 파일에 옮기라
				}
				System.out.println(htmlName + "가 성공적으로 생성되었소");
			} catch (MalformedURLException e) {
				System.out.println("URL문자열 오류 : " + e.getMessage());
			} catch (IOException e) {
				System.out.println("IO 오류  : " + e.getMessage());
			}

		}

		// html을 못찾았음, 이미지라는 소리ㅇㅇ
		else if (index == -1) {
			String arr[] = input.split("/"); //마찬가지로 /로 쪼갬
			String imageName = arr[arr.length-1]; //마지막 파일명 따내기
			
			try {//이미지는 바이트기반
				URL req = new URL(input); //URL 객체 만들기
				//바이트기반의 is, URL과 연결된 URLConnection의 InputStream을 얻는다.
				InputStream is = req.openStream();
				//바이트기반의 fos, 지정된 경로로 파일을 생성한다.
				FileOutputStream fos = new FileOutputStream(path+'/'+imageName);
				int input2 = 0;
				while (true) {
					input2 = is.read(); //데이터를 읽는다, 더이상 읽을 수 없으면 -1리턴
					if (input2 == -1) //다읽으면 빠져나온다.
						break;
					fos.write(input2); //실제 기록한다.
				}
				fos.close();
				System.out.println(imageName + "가 성공적으로 생성되었소");
			} catch (MalformedURLException e) {
				System.out.println("URL문자열 오류 : " + e.getMessage());
			} catch (IOException e) {
				System.out.println("IO 오류  : " + e.getMessage());
			}
		}
		
		sc.close();

	}
}
