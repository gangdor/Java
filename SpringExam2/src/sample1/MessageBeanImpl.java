package sample1;

public class MessageBeanImpl implements MessageBean{
	private String fruit;
	private int cost;
	
	public MessageBeanImpl() {
		super();
		System.out.println("MessageBeanImpl �⺻������ ȣ��");
	}

	public MessageBeanImpl(String fruit) {
		super();
		this.fruit = fruit;
		System.out.println(fruit + " MessageBeanImpl������ ȣ��");
	}

	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("setCost()ȣ��");
	}

	@Override
	public void sayHello() {      // XML�� ���� ����
		System.out.println(fruit + "   " + cost);
	}

	@Override                     
	public void sayHello(String a, int b) {   //�޼��带 �̿��� ����
		System.out.println(a + "   " + b);
	}
}






