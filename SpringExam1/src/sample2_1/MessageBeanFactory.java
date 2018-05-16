package sample2_1;
public class MessageBeanFactory {
	public static MessageBean getBean(){
		MessageBean result;
		java.util.Random rand = new java.util.Random();
		if(rand.nextBoolean())
			result = new MessageBeanKr();
		else
			result = new MessageBeanEn();
		return result;
	}
}
