package day8;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("�����Ϸ��� ���ϸ��� ���α׷� �ƱԸ�Ʈ�� �����ϼ���.");
			return; // ���α׷� ����
		}
		File f = new File(args[0]);
		if (f.exists()) { // exists : f�� �����ϴ°� ���ϴ°�, boolean����
			if (f.isDirectory()) { // isDirectory : ���丮�� �ƴϳ�
				System.out.println("���丮�Դϴ�.");
			} else {
				System.out.println(f.length() + "����Ʈ�� �����Դϴ�.");
				// length : ������ ��������
			}
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		System.out.println("���α׷� ����");
	}
}
