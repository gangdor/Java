package anno04;

//������, ����3���޴� ������, setter, toString()
public class Emp {
	private String name;
	private int age;
	private double score;
	
	public Emp() {
		super();
	}
	public Emp(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return name+"�� "+age+"�� �̰� �Ի�������"+ score+"�� �Դϴ�";
	}
}









