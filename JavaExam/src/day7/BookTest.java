package day7;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		title = "�ڹ��� ����";
		author = "���ü�";
		price = 30000;
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo(){
		return title + " " + author + " " + price;
	}
}


public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("����� ��ƾ��ϴ� ����","�� ����", 15000);
		Book b3 = new Book("���� �� �� ���� �ϴ°�","���̸� ���̳�", 18000);
		Book b4 = new Book("�����̾߱�","�����콺", 25000);
		Book b5 = new Book("���Ƕ� �����ΰ�","����Ŭ����", 9000);
		
		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());
		System.out.println(b4.getBookInfo());
		System.out.println(b5.getBookInfo());
	}

}
