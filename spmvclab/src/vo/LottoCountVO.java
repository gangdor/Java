package vo;
public class LottoCountVO {
	private int count=0;	
	public LottoCountVO() {
		System.out.println("객체 생성");
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count += count;
	}
}
