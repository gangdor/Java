package day14;
import java.net.*;
import java.io.*;

public class URLTest1 {

	public static void main(String[] args) {
		try{
			//URL 객체를 통해 웹서버 접속
			URL req = new URL("http://www.weather.go.kr/wid/queryDFSRSS.jsp?zone=1165060000");
			//URL은 바이트라 바이트기반 스트림을 열고
			InputStream is = req.openStream();
			//바이트를 문자로 바꿔주고
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			//문자스트림을 버퍼리더로 읽어주고
			BufferedReader br = new BufferedReader(isr);
			while(true){
				String data = br.readLine();
				if(data==null) break;
				System.out.println(data);
			}
		}
		catch(MalformedURLException e){
			System.out.println("URL문자열 오류 : " + e.getMessage());
		}
		catch(IOException e){
			System.out.println("IO 오류  : " + e.getMessage());
		}
	}

}
