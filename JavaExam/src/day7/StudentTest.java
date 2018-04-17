package day7;

class Student {
	String name;
	int age;
	String project;
	Student(){
		System.out.println("Student 클래스 객체 생성!!!");
	}
	Student(String name, int age, String project){
		this.name = name;
		this.age =age;
		this.project =project;
	}
	Student(String project){
		/*this.name="또치";
		this.age=50;
		this.project =project;*/
		this("또치",50, project);
		
	}
	void study() {
		System.out.println(name + "가 " + project + "를 학습합니다.");
	}

	void studentInfo() {
		System.out.println(name + " : " + age);
	}
}

public class StudentTest {

	public static void main(String[] args) throws Exception{
		System.out.println("main() 메서드 수행시작");
		//Thread.sleep(3000); // 3초 수행 지연
		System.out.println("Student 클래스의 객체 생성-1");
		Student st1;
		st1 = new Student();
		st1.name = "Duke";
		st1.age = 22;
		st1.project = "Java";
		st1.studentInfo();
		st1.study();
		System.out.println("Student 클래스의 객체 생성-2");
		//Thread.sleep(3000);
		Student st2;
		st2 = new Student("둘리",22,"국어");
		
		st2.studentInfo();
		st2.study();
		
		System.out.println(st1);
		System.out.println(st2);
		st2=st1; //둘리 객체는 garbage candidate
		System.out.println(st1);
		System.out.println(st2);
		st2.studentInfo();
		st2.study();
		System.out.println("main() 메서드 수행종료");
	}

}
