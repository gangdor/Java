package anno02;

//setter, toString()�߰�
public class MyFoodMgr{
	private Food favoriteFood;
	private Food unFavoriteFood;
	                 
	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	public void setUnfavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
	}
	@Override
	public String toString() {
		return "[�����ϴ� ����=" + favoriteFood + ", �Ⱦ��ϴ�����=" + unFavoriteFood + "]";
	}
}
