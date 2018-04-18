package vo;

public class CountVO {
	private int countNum;
	public int getCountNum() {
		return countNum;
	}
	public void setCountNum(int countNum) {
		this.countNum += countNum;
	}
	public CountVO(){
		System.out.println("CountVO °´Ã¼ »ý¼º!!");
	}
}
