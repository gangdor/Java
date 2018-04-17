package work;

public class SaleTV extends TV{
	private int price;
	
	public SaleTV(){}
	public SaleTV(int price, String model, int size, int channel){
		super(model, size, channel);
		setPrice(price);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void play(){
		System.out.println("판매 TV 채널 " +getChannel() +"번의 프로를 플레이 합니다.");
	}
	
	public void sale(){
		System.out.printf("%s 모델의 상품을 판매합니다. %,d원을 지불해주세요.", getModel(), getPrice());
		System.out.println();
	}
	
	public String toString(){//object클래스에 있는거 오버라이딩
		return String.format("판매상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(), getPrice(), getSize());
	}
	
	
}
