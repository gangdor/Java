package day13;
import java.net.*;
import java.io.*;

public class URLTest1 {

	public static void main(String[] args) {
		try{
			URL req = new URL("http://www.weather.go.kr/wid/queryDFSRSS.jsp?zone=1165060000");
			InputStream is = req.openStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
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
