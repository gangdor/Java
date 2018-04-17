package day14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest2 {

	public static void main(String[] args) {
		String imageName = "c:/iotest/duke.jpg";
		try {
			URL req = new URL(
					"http://fardamento.netshoes.net/BR/LNetshoes/production/20141031/BADGE/20141031BADGE0014096.jpg");
			InputStream is = req.openStream();
			FileOutputStream fos = new FileOutputStream(imageName);
			int input = 0;

			while (true) {
				input = is.read();
				if (input == -1)
					break;
				fos.write(input);
			}
			fos.close();
			System.out.println(imageName+"가 성공적으로 생성되었소");
		} catch (MalformedURLException e) {
			System.out.println("URL문자열 오류 : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO 오류  : " + e.getMessage());
		}
	}

}
