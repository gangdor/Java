package work;

public class TVTest {

	public static void main(String[] args) {
		TV stv = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rtv = new RentalTV(100000, "RENTALTV-10", 42, 1);
		
		//sTV ä�� �ΰ� �ø�
		stv.channelUp();
		stv.channelUp();
		
		//rTV ä�� ���� ����
		//System.out.println(rtv.getChannel());
		rtv.channelDown(); //1 => 10
		//System.out.println(rtv.getChannel());
		rtv.channelDown();//
		//System.out.println(rtv.getChannel());
		rtv.channelDown();
		//System.out.println(rtv.getChannel());
		
		printAllTV(stv);
		printAllTV(rtv);
		printRentalTV(rtv);
		
		
		/*String str1 = "�ȳ�";
		String str2 = "2018";
		String str3 = String.format("%s%s",str1,str2);
		System.out.println(str3);*/
	}
	
	static void printAllTV(TV tv){
		System.out.println(tv.toString()); //�����ϸ� TVŬ������ �ִ� toString�� �ƴϰ� SaleTV, RentalTV�� �ִ� toString�� ȣ��� 
		if(tv instanceof SaleTV){
			((SaleTV)tv).play(); //play�޼��尡 TVŬ������ ���⶧���� tv�����δ� ��������ȯ���� play�޼��忡 ������ �� ����.
			((SaleTV)tv).sale();
		}
		else
			((RentalTV)tv).play();
			
	}
	
	static void printRentalTV(Rentable tv){
		((RentalTV)tv).rent();
	}

}
