package day13;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import day8.KoreanDay;


public class FileWriterLab {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(1990, 7-1, 11); //�������� -1�ؾ���.
		int myday=cal.get(Calendar.DAY_OF_WEEK);
		String myDAYOFWEEK = " ";
		switch(myday){
		case 1: myDAYOFWEEK = "�Ͽ���"; break;
		case 2: myDAYOFWEEK = "������"; break;
		case 3: myDAYOFWEEK = "ȭ����"; break;
		case 4: myDAYOFWEEK = "������"; break;
		case 5: myDAYOFWEEK = "�����"; break;
		case 6: myDAYOFWEEK = "�ݿ���"; break;
		case 7: myDAYOFWEEK = "�����"; break;
		
		}
		try(FileWriter writer = new FileWriter("c:/iotest/lab_0109.txt");){
			writer.write("������ ");
			writer.write(KoreanDay.day);
			writer.write("�Դϴ�.");
			writer.write("\r\n");
			writer.write("������ ");
			writer.write(myDAYOFWEEK); //
			writer.write("�� �¾���ϴ�.");
			writer.write("\r\n");
			
			System.out.println("���Ͽ� ��¿Ϸ�!!");

		}
		catch(IOException ioe){
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
		
	}

}
