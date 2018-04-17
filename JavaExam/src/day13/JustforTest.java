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
	//ID�� ��ġ���� Ȯ��, ��ġ�� true
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
		//HashSet�̶�� �ڷᱸ�� ���� ����, Product Ÿ�� ��������
		HashSet<Product> set = new HashSet<Product>();
		//p�迭�� ���� ��ü �־���
		Product p[] = new Product[5];
		p[0]=new Product("p100", "TV   ", 20000);
		p[1]=new Product("p200", "COM  ", 10000);
		p[2]=new Product("p100", "MP3  ", 700);
		p[3]=new Product("p300", "Audio", 10000);
		p[4]=new Product("p300", "A    ", 10000);
		
		//add�ϸ� HashSet�� equals & hashCode �ڵ� ȣ����, add�� �������� ������ true������
		
		for (int i = 0; i < p.length; i++) {
			if(set.add(p[i]))
				System.out.println("����");
			else
				System.out.println("����");
		}
		
		
		//Product�� �ݺ��� �ҷ��� ���
		Iterator<Product> it = set.iterator();
		while(it.hasNext()){
			//toString �ڵ� ȣ��
			System.out.println(it.next());
		}
		
	}

}
