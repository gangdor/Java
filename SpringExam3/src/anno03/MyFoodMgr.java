package anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//setter, toString()�߰�

//�̰��� �ֳ����̼���, @Component�� ���� �ش� Ŭ������ default�� ������
@Component("myFood")  //default : myFoodMgr�� ������
public class MyFoodMgr{
	@Autowired //��������� ���� �˾Ƽ� �־��ּ���.
	@Qualifier(value="unFavoriteFood")
	private Food favoriteFood;     // setter ��������, �˾Ƽ� setter�޼��带 �־��ش�.
	@Autowired
	private Food unFavoriteFood;
	@Override
	public String toString() {
		return "[�����ϴ� ����=" + favoriteFood + ", �Ⱦ��ϴ�����=" + unFavoriteFood + "]";
	}
}
