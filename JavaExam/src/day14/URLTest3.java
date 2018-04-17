package day14;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

public class URLTest3 {

	public static void main(String[] args) {
		String imageName = "c:/iotest/duke.jpg";
		try {
			//URL�� �ް� ����
			URL req = new URL(
					"http://fardamento.netshoes.net/BR/LNetshoes/production/20141031/BADGE/20141031BADGE0014096.jpg");
			//URL�� ����Ʈ ��Ʈ������ ��ȯ���ְ�
			InputStream is = req.openStream();
			FileOutputStream fos = new FileOutputStream(imageName);
			//int input = 0;
			/*while (true) {
				input = is.read();
				if (input == -1)
					break;
				fos.write(input);
			}*/
			BufferedImage bi = ImageIO.read(is);
			for(int y=0; y<bi.getHeight(); y++){
				for (int x = 0; x < bi.getWidth(); x++) {
					Color colour = new Color(bi.getRGB(x, y));
					int Y = (int)(0.299*colour.getRed() +
							0.587*colour.getGreen() + 
							0.114*colour.getBlue());
					bi.setRGB(x, y, new Color(Y,Y,Y).getRGB());
				}
			}
			ImageIO.write(bi, "JPG", fos);
			fos.close();
			System.out.println(imageName+"�� ���������� �����Ǿ���");
		} catch (MalformedURLException e) {
			System.out.println("URL���ڿ� ���� : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO ����  : " + e.getMessage());
		}
	}

}
