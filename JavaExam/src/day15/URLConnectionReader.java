package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	public static void main(String[] args) {
		try{
			//URL 객체 생성시, 내가 받은 URL문자열이 정상이냐? 서버요청 안함
			URL u = new URL("http://unico2013.dothome.co.kr");
			//URL을 URLConnection화 시킴
			URLConnection uc = u.openConnection();
			//내용 추출, content 객체 반환
			InputStream is = (InputStream)uc.getContent();
			//문자기반의 스트림으로 전환, 데이터를 행단위로 읽을 객체 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String inputLine;
			//읽고 출력
			while((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			//헤더 정보 추출
			System.out.println("Content-type: "+uc.getContentType());
			System.out.println("Date: " +new java.util.Date(uc.getDate()));
			System.out.println("Content-length: " + uc.getContentLength());
		}
		catch(MalformedURLException e){
			System.err.println("URL is not a URL I understand");
		}
		catch(IOException e){
			System.err.println(e);
		}
		
	}

}
