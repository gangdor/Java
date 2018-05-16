package anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//setter, toString()추가

//이것이 애너테이션임, @Component만 오면 해당 클래스를 default로 선정함
@Component("myFood")  //default : myFoodMgr로 설정됨
public class MyFoodMgr{
	@Autowired //멤버변수의 값을 알아서 넣어주세요.
	@Qualifier(value="unFavoriteFood")
	private Food favoriteFood;     // setter 생략가능, 알아서 setter메서드를 넣어준다.
	@Autowired
	private Food unFavoriteFood;
	@Override
	public String toString() {
		return "[좋아하는 음식=" + favoriteFood + ", 싫어하는음식=" + unFavoriteFood + "]";
	}
}
