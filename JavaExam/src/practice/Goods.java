package practice;

class Goods{
	String prodId;
	String prodName;
	int price;
	char asYn;
	
	public Goods(String prodId, String prodName, int price){
		this.prodId=prodId;
		this.prodName=prodName;
		this.price=price;
	}
	
	public Goods(String prodId, String prodName, int price, char asYn){
		this(prodId, prodName, price);
		this.asYn=asYn;
	}
	
	public String getGoodsInfo(){
		String s = "";
		s =(asYn=='N')?"불가":"가능";
		return "상품ID : " + prodId + ", 상품명 :" + prodName + ", 가격 : " + String.format("%,d원", price) + ", AS가능여부 :" + s;
	}
}