package day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("c:/iotest/output.txt");
				BufferedReader br = new BufferedReader(reader)){//한행씩 읽어옴
			String data;
			while(true){
				data= br.readLine(); //Return값이 String 형임
				if(data==null) break;
				System.out.print(data);
				System.out.println();
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
