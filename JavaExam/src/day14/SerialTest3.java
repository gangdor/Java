package day14;
import day6.Student;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerialTest3 {

	public static void main(String[] args) throws Exception{
		//직렬화 : 객체를 저장함, 나중에 또 쓸라고ㅇㅇ
		FileOutputStream fos= new FileOutputStream("c:/iotest/test2.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(new Date());
		Thread.sleep(3000);
		oos.writeObject(new Date());
		Student st = new Student("duke",23,"Java프로그래밍");
		oos.writeObject(st); // 해당 클래스에 implements Serializable을 해야함
		oos.close();
		fos.close();
		System.out.println("직렬화 출력완료");
	}

}
