package day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer = null;
		String path = "C:/iotest";
		File isDir = new File(path); // ���丮 �н� ����
		if (!isDir.exists()) { // ���丮 �������� �ʴ´ٸ�
			isDir.mkdirs(); // ���丮 �����ض�
		}

		try {
			writer = new FileWriter("c:/iotest/output.txt", true); // ���� ����
			char arr[] = { '��', 'ü', '��', '��', '��', '��', 'J', 'a', 'v', 'a' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write("\r\n"); // ���๮�� �������
			writer.write(arr);
			writer.write("\r\n");
			writer.write("OCJP ���� ���");
			writer.write("\r\n");
			System.out.println("���Ͽ� ��¿Ϸ�!!");
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		} finally {
			try {
				if (writer != null)
					writer.close(); // ���� ����Ѱ� Ŭ����
			} catch (Exception e) {
				System.out.println("������ �ݴµ��� ���� �߻�!!");
			}
		}
	}
}
