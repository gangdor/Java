package exercise;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arrays[]=new Student[3];
		//��ü���� �迭�� �־��ְ�
		arrays[0] =  new Student("ȫ�浿", 20, 171, 81, "201101", "����");
		arrays[1] =  new Student("��浿", 21, 183, 72, "201102", "����");
		arrays[2] =  new Student("�ڱ浿", 22, 175, 65, "201103", "�İ�");
		
		//ȣ��
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i].printInformation());
		}
	}
}

