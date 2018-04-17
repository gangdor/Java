package day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("c:/iotest/output.txt");
				BufferedReader br = new BufferedReader(reader)){//���྿ �о��
			String data;
			while(true){
				data= br.readLine(); //Return���� String ����
				if(data==null) break;
				System.out.print(data);
				System.out.println();
			}
		}
		catch(FileNotFoundException fnfe){
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch(IOException ioe){
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}
}
