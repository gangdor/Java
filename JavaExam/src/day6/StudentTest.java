package day6;

public class StudentTest {

	public static void main(String[] args) throws Exception{
		System.out.println("main() 메서드 수행시작");
		Thread.sleep(3000); // 3초 수행 지연
		System.out.println("Student 클래스의 객체 생성-1");
		Student st1;
		st1 = new Student();
		st1.name = "Duke";
		st1.age = 22;
		st1.project = "Java";
		st1.studentInfo();
		//st1.study();
		System.out.println("Student 클래스의 객체 생성-2");
		Thread.sleep(3000);
		Student st2;
		st2 = new Student();
		st2.name = "Dully";
		st2.age = 35;
		st2.project = "국어";
		st2.studentInfo();
		//st2.study();
		
		System.out.println(st1);
		System.out.println(st2);
		st2=st1; //둘리 객체는 garbage candidate
		System.out.println(st1);
		System.out.println(st2);
		st2.studentInfo();
		//st2.study();
		System.out.println("main() 메서드 수행종료");
	}

}
