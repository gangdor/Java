package collection;



public class Product implements Comparable <Product>{
	private String productID;
	private String productName;
	private int productPrice;
	
	public Product(String productID, String productName, int productPrice){
		this.productID=productID;
		this.productName=productName;
		this.productPrice=productPrice;
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
	public String toString(){
		return productID +"\t\t"+ productName +"\t"+ productPrice;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Product){
			Product temp = (Product)obj;
			return productID.equals(temp.productID); 
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return productID.hashCode();
	}
	
	public int compareTo(Product p){
		int result=0; //값이 같으면 중복처리시킴
		if(productPrice>p.productPrice)
			result = 1; //음양값에 한해 움직임. 의미없음
		else if(productPrice==p.productPrice)
			result =0;
		else if(productPrice<p.productPrice)
			result = -1;
		return result;
	}
	
	

	
}
