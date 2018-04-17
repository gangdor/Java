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
		// ���丮 ������ ����� ����
		//FileWriter writer = null;
		String path = "c:/iotest/output"; //�������
		File isDir = new File(path); // path�� ���丮 ��ü ������ ȣ�� 
		if (!isDir.exists()) { //�ش��ο� ������
			isDir.mkdirs(); //���丮 ������.
		}

		// ���ڿ� �Է� �ޱ�
		System.out.println("URL �ּҸ� �Է��ϼ���."); 
		Scanner sc = new Scanner(System.in); //����ڷκ��� �Է¹ޱ�
		String input = sc.nextLine(); //�Է¹ޱ�

		int index = input.indexOf("html"); // input���� html ������ġã�� ���� 0���� ����
 		if (index > -1) { // if�� Ȯ���� �Ǻ� // html�϶�, ������ ��û�ϱ�
			String arr[] = input.split("/"); //�Է¹��� �ּҸ� /�� �����Ͽ� �߶�
			String htmlName = arr[arr.length-1]; //�Ǹ����� ���� ���ϸ��� ����
			//printWriter�� ���� ���� �����ϱ�, �����ڷ� ��ü path+'/'+htmlName���� ������ �˷���, UTF-8�� ���ڵ����
			//FileWriter�� ���ڵ� �����ϴ� �����ڰ� ����, �ѱ۱���
			try(PrintWriter writer = new PrintWriter(path+'/'+htmlName,"UTF-8");) {
				URL req = new URL(input); //URL req ��ü ����, URL�� �� ����Ʈ�����, ����Ʈ�� ���� �� �ִ°� �����߰���
				//����Ʈ��ݽ�Ʈ�� is, rep.openStream���� URL������� URLConnection�� InputStream�� ��´�. ������ ��û��
				InputStream is = req.openStream();
				//����Ʈ��� ��Ʈ���� ���ڱ�� ��Ʈ������ ��������ִ� isr, �����ϰ����ϴ� is�� ���ڵ������ �����Ѵ�. 
				InputStreamReader isr = new InputStreamReader(is, "UTF-8");
				//���ڱ������ �о���̴� br, ���� ����� �� isr�� �о���̴� ��ü�� �����.
				BufferedReader br = new BufferedReader(isr);
				while (true) {
					String data = br.readLine(); //�ٴ����� �����͸� �о����, readLine�� �������� null����
					if (data == null) //�������� ����������.
						break;
					writer.write(data+"\r\n"); //������ �����͸� Writer�� ��� �� ���Ͽ� �ű��
				}
				System.out.println(htmlName + "�� ���������� �����Ǿ���");
			} catch (MalformedURLException e) {
				System.out.println("URL���ڿ� ���� : " + e.getMessage());
			} catch (IOException e) {
				System.out.println("IO ����  : " + e.getMessage());
			}

		}

		// html�� ��ã����, �̹������ �Ҹ�����
		else if (index == -1) {
			String arr[] = input.split("/"); //���������� /�� �ɰ�
			String imageName = arr[arr.length-1]; //������ ���ϸ� ������
			
			try {//�̹����� ����Ʈ���
				URL req = new URL(input); //URL ��ü �����
				//����Ʈ����� is, URL�� ����� URLConnection�� InputStream�� ��´�.
				InputStream is = req.openStream();
				//����Ʈ����� fos, ������ ��η� ������ �����Ѵ�.
				FileOutputStream fos = new FileOutputStream(path+'/'+imageName);
				int input2 = 0;
				while (true) {
					input2 = is.read(); //�����͸� �д´�, ���̻� ���� �� ������ -1����
					if (input2 == -1) //�������� �������´�.
						break;
					fos.write(input2); //���� ����Ѵ�.
				}
				fos.close();
				System.out.println(imageName + "�� ���������� �����Ǿ���");
			} catch (MalformedURLException e) {
				System.out.println("URL���ڿ� ���� : " + e.getMessage());
			} catch (IOException e) {
				System.out.println("IO ����  : " + e.getMessage());
			}
		}
		
		sc.close();

	}
}
