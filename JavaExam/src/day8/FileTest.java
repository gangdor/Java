package day8;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	public static void main(String[] args) {
		//�����Ϸ��� ���ϸ��̳� ���丮���� ǥ���Է�(Ű����)�� �޾� ó���ϵ��� �ҽ� ����
		//C:/gangdor/workspace/JavaExam/src/day7/Card.java
		Scanner scan = new Scanner(System.in);
		System.out.print("���丮 ��� �Է� : ");
		String file = scan.nextLine();
		
		File f = new File(file);

		if (f.exists()) { // exists : f�� �����ϴ°� ���ϴ°�, boolean����
			if (f.isDirectory()) { //isDirectory : ���丮�� �ƴϳ�
				System.out.println("���丮�Դϴ�.");
			} else {
				System.out.println(f.length() + "����Ʈ�� �����Դϴ�."); 
				// length : ������ ��������
			}
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		scan.close();
		System.out.println("���α׷� ����");
	}
}
