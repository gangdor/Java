package day14;
import day6.Student;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerialTest3 {

	public static void main(String[] args) throws Exception{
		//����ȭ : ��ü�� ������, ���߿� �� �������
		FileOutputStream fos= new FileOutputStream("c:/iotest/test2.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(new Date());
		Thread.sleep(3000);
		oos.writeObject(new Date());
		Student st = new Student("duke",23,"Java���α׷���");
		oos.writeObject(st); // �ش� Ŭ������ implements Serializable�� �ؾ���
		oos.close();
		fos.close();
		System.out.println("����ȭ ��¿Ϸ�");
	}

}
