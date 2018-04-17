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
		s =(asYn=='N')?"�Ұ�":"����";
		return "��ǰID : " + prodId + ", ��ǰ�� :" + prodName + ", ���� : " + String.format("%,d��", price) + ", AS���ɿ��� :" + s;
	}
}