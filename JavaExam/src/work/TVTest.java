package work;

public class TVTest {

	public static void main(String[] args) {
		TV stv = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rtv = new RentalTV(100000, "RENTALTV-10", 42, 1);
		
		//sTV 채널 두개 올림
		stv.channelUp();
		stv.channelUp();
		
		//rTV 채널 세개 내림
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
		
		
		/*String str1 = "안녕";
		String str2 = "2018";
		String str3 = String.format("%s%s",str1,str2);
		System.out.println(str3);*/
	}
	
	static void printAllTV(TV tv){
		System.out.println(tv.toString()); //실행하면 TV클래스에 있는 toString이 아니고 SaleTV, RentalTV에 있는 toString이 호출됌 
		if(tv instanceof SaleTV){
			((SaleTV)tv).play(); //play메서드가 TV클래스에 없기때문에 tv변수로는 강제형변환없이 play메서드에 접근할 수 없다.
			((SaleTV)tv).sale();
		}
		else
			((RentalTV)tv).play();
			
	}
	
	static void printRentalTV(Rentable tv){
		((RentalTV)tv).rent();
	}

}
