package day14;
import java.net.*;
import java.io.*;

public class URLTest1 {

	public static void main(String[] args) {
		try{
			//URL ��ü�� ���� ������ ����
			URL req = new URL("http://www.weather.go.kr/wid/queryDFSRSS.jsp?zone=1165060000");
			//URL�� ����Ʈ�� ����Ʈ��� ��Ʈ���� ����
			InputStream is = req.openStream();
			//����Ʈ�� ���ڷ� �ٲ��ְ�
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			//���ڽ�Ʈ���� ���۸����� �о��ְ�
			BufferedReader br = new BufferedReader(isr);
			while(true){
				String data = br.readLine();
				if(data==null) break;
				System.out.println(data);
			}
		}
		catch(MalformedURLException e){
			System.out.println("URL���ڿ� ���� : " + e.getMessage());
		}
		catch(IOException e){
			System.out.println("IO ����  : " + e.getMessage());
		}
	}

}
