package day13;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import day8.KoreanDay;


public class FileWriterLab {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(1990, 7-1, 11); //월정보는 -1해야함.
		int myday=cal.get(Calendar.DAY_OF_WEEK);
		String myDAYOFWEEK = " ";
		switch(myday){
		case 1: myDAYOFWEEK = "일요일"; break;
		case 2: myDAYOFWEEK = "월요일"; break;
		case 3: myDAYOFWEEK = "화요일"; break;
		case 4: myDAYOFWEEK = "수요일"; break;
		case 5: myDAYOFWEEK = "목요일"; break;
		case 6: myDAYOFWEEK = "금요일"; break;
		case 7: myDAYOFWEEK = "토요일"; break;
		
		}
		try(FileWriter writer = new FileWriter("c:/iotest/lab_0109.txt");){
			writer.write("오늘은 ");
			writer.write(KoreanDay.day);
			writer.write("입니다.");
			writer.write("\r\n");
			writer.write("김경민은 ");
			writer.write(myDAYOFWEEK); //
			writer.write("에 태어났습니다.");
			writer.write("\r\n");
			
			System.out.println("파일에 출력완료!!");

		}
		catch(IOException ioe){
			System.out.println("파일로 출력할 수 없습니다.");
		}
		
	}

}
