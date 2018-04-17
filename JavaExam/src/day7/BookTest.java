package day7;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		title = "자바의 정석";
		author = "남궁성";
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
		Book b2 = new Book("제대로 살아야하는 이유","멕 제이", 15000);
		Book b3 = new Book("나는 왜 이 일을 하는가","사이먼 사이넥", 18000);
		Book b4 = new Book("변신이야기","오비디우스", 25000);
		Book b5 = new Book("정의란 무엇인가","마이클샌델", 9000);
		
		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());
		System.out.println(b4.getBookInfo());
		System.out.println(b5.getBookInfo());
	}

}
