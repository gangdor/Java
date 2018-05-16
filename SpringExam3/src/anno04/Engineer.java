package anno04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//기본생성자, setter, toString()
@Component //생략되면 engineer로 생성된다.
public class Engineer {
//	@Autowired
//	@Qualifier("emp2") //단독으로는 나올 수가 없다. Autowired의 sub기능이다.
	//이름으로 찾아서 없으면 -> type으로 찾는다.
	@Resource(name="emp1") //이름으로 찾아서 없으면 -> type으로 찾는다. emp1이라는 객체를 찾아줘, Java애노테이션임, 잘 안쓴다.
	private Emp emp;
	private String dept;
	public Engineer() {
		super();
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return emp.toString()+"\n"+ dept +"에 근무 합니다";
	}
}







