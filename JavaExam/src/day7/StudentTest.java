package day7;

class Student {
	String name;
	int age;
	String project;
	Student(){
		System.out.println("Student Ŭ���� ��ü ����!!!");
	}
	Student(String name, int age, String project){
		this.name = name;
		this.age =age;
		this.project =project;
	}
	Student(String project){
		/*this.name="��ġ";
		this.age=50;
		this.project =project;*/
		this("��ġ",50, project);
		
	}
	void study() {
		System.out.println(name + "�� " + project + "�� �н��մϴ�.");
	}

	void studentInfo() {
		System.out.println(name + " : " + age);
	}
}

public class StudentTest {

	public static void main(String[] args) throws Exception{
		System.out.println("main() �޼��� �������");
		//Thread.sleep(3000); // 3�� ���� ����
		System.out.println("Student Ŭ������ ��ü ����-1");
		Student st1;
		st1 = new Student();
		st1.name = "Duke";
		st1.age = 22;
		st1.project = "Java";
		st1.studentInfo();
		st1.study();
		System.out.println("Student Ŭ������ ��ü ����-2");
		//Thread.sleep(3000);
		Student st2;
		st2 = new Student("�Ѹ�",22,"����");
		
		st2.studentInfo();
		st2.study();
		
		System.out.println(st1);
		System.out.println(st2);
		st2=st1; //�Ѹ� ��ü�� garbage candidate
		System.out.println(st1);
		System.out.println(st2);
		st2.studentInfo();
		st2.study();
		System.out.println("main() �޼��� ��������");
	}

}
