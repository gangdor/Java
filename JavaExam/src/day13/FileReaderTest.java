package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("c:/iotest/output.txt");){
			int data;
			while(true){
				data= reader.read(); //한문자씩 읽음, 더이상 읽을 수 없을때 -1을 리턴함
				if(data==-1) break;
				System.out.print((char)data);
			}
		}
		catch(FileNotFoundException fnfe){
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException ioe){
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}
