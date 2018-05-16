package anno04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//�⺻������, setter, toString()
@Component //�����Ǹ� engineer�� �����ȴ�.
public class Engineer {
//	@Autowired
//	@Qualifier("emp2") //�ܵ����δ� ���� ���� ����. Autowired�� sub����̴�.
	//�̸����� ã�Ƽ� ������ -> type���� ã�´�.
	@Resource(name="emp1") //�̸����� ã�Ƽ� ������ -> type���� ã�´�. emp1�̶�� ��ü�� ã����, Java�ֳ����̼���, �� �Ⱦ���.
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
		return emp.toString()+"\n"+ dept +"�� �ٹ� �մϴ�";
	}
}







