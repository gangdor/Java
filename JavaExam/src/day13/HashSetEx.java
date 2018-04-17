package day13;

import java.util.*;

class Person implements Comparable <Person>{
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}

	//중복일떄 참
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person tmp = (Person) obj;
			return (age == tmp.age);
			//return (age == tmp.age);
			
		}
		return false;
	}

	//중복일떄 참
	public int hashCode() { // 객체의 참조값을 숫자로 표현한 것이 hashCode
		//return name.hashCode();
		return age;
	}
	
	public int compareTo(Person p){
		int result = 0;
		if(name.charAt(0)==p.name.charAt(0))
			result =0;
		else if(name.charAt(0)>p.name.charAt(0))
			result =-1;
		else
			result =1;
		return result;
		
	}
}

public class HashSetEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("Adan", 1));
		System.out.println(set.add(new Person("Adan", 1)));
		set.add(new Person("Bravo", 2));
		set.add(new Person("Chile", 2));
		set.add(new Person("David", 4));
		set.add(new Person("Eva", 5));
		System.out.println(set);
		
		Object ary[] = set.toArray();
		/*for(Object b : ary)
			System.out.println(b);*/
		
		Arrays.sort(ary);
		for(Object d : ary)
			System.out.println(d);
		
		/*int ary1[] = {10,2,7,15,9,20,3};
		Arrays.sort(ary1); //오름차순 정렬
		for(int d : ary1)
			System.out.println(d);*/
		/*Person p1 = new Person("듀크",22);
		Person p2 = new Person("듀크",22);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(new java.util.Date()));
		Person p3 = new Person("턱시", 30);
		System.out.println(p3.hashCode());
		System.out.println(p1.equals(p3)); // 참조값이 같아야 같은객체로 인식하는 Object.equals
		*/
		
	}
}
