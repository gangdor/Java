package anno06;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
@Autowired : ������ ����, ���� ������� ������ name���� ã�� ������ type���� ã�´�.
                     ��ü�� �̸� �����Ϸ��� @Qualifier �ֳ����̼��� �߰��� ����Ѵ�.
@Resource : �ڹ�����, ���� ������� ������ name���� ã�� ������ type���� ã�´�.
                     ��ü�� �̸� �����Ϸ��� name �Ӽ��� �����Ѵ�.
*/

@Component("mySchool")
public class School {
	@Autowired
	public Student person;
	
	@Resource(name="grade")
	public int grade;
	
	public School() {
		super();
	}
	public School(Student person) {
		super();
		this.person = person;
	}
	@Override
	public String toString() {
		return "ABC����б� [�л�����=" + person.toString() + "�г�=" + grade + "]";
	}
}




