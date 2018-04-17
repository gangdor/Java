package day13;
import java.util.HashSet;
import java.util.Iterator;

class Product{
	private String productID;
	private String productName;
	private int productPrice;
	
	public Product(String productID, String productName, int productPrice){
		setProductID(productID);
		setProductName(productName);
		setProductPrice(productPrice);
	}
	
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return productID+"\t\t"+productName+"\t\t"+productPrice;
	}
	@Override
	public int hashCode() {
		//return productID.hashCode();
		return productPrice;
		
	}
	@Override
	//ID가 겹치는지 확인, 겹치면 true
	public boolean equals(Object obj) {
		if(obj instanceof Product){
			Product temp = (Product)obj;
			return productID.equals(temp.productID) || productPrice==temp.productPrice;
		}
		else
			return false;
	}
}

public class JustforTest {

	public static void main(String[] args) {
		//HashSet이라는 자료구조 저장 생성, Product 타입 받을거임
		HashSet<Product> set = new HashSet<Product>();
		//p배열에 각각 객체 넣어줌
		Product p[] = new Product[5];
		p[0]=new Product("p100", "TV   ", 20000);
		p[1]=new Product("p200", "COM  ", 10000);
		p[2]=new Product("p100", "MP3  ", 700);
		p[3]=new Product("p300", "Audio", 10000);
		p[4]=new Product("p300", "A    ", 10000);
		
		//add하면 HashSet은 equals & hashCode 자동 호출함, add는 포함하지 않으면 true리턴함
		
		for (int i = 0; i < p.length; i++) {
			if(set.add(p[i]))
				System.out.println("성공");
			else
				System.out.println("실패");
		}
		
		
		//Product용 반복자 불러서 출력
		Iterator<Product> it = set.iterator();
		while(it.hasNext()){
			//toString 자동 호출
			System.out.println(it.next());
		}
		
	}

}
