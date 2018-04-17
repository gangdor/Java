package mobile;

//추상클래스 최고조상
abstract class Mobile{
	//멤버변수
	private String mobileName;
	private int batterySize;
	private String osType;
	
	//생성자
	public Mobile(){
		
	}
	
	public Mobile(String mobileName, int batterySize, String osType){
		setMobileName(mobileName);
		setBatterySize(batterySize);
		setOsType(osType);
	}
	//getter, setter
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	//추상메서드
	abstract void operate(int time);
	abstract void charge(int time);
	
} 

class Ltab extends Mobile{
	Ltab(){}
	Ltab(String mobileName, int batterySize, String osType){
		super(mobileName, batterySize, osType);
	}
	
	public void operate(int time){
		super.setBatterySize(getBatterySize()-time*10);
	}
	public void charge(int time){
		super.setBatterySize(getBatterySize()+time*10);
	}
}

class Otab extends Mobile{
	Otab(){}
	Otab(String mobileName, int batterySize, String osType){
		super(mobileName, batterySize, osType);
	}
	
	public void operate(int time){
		super.setBatterySize(getBatterySize()-time*12);
	}
	public void charge(int time){
		super.setBatterySize(getBatterySize()+time*8);
	}
}




public class MobileTest {

	public static void main(String[] args) {
		
		//다형성 개념
		Mobile mobile[] = new Mobile[2];
		mobile[0] = new Ltab("Ltab",500,"ABC-01");
		mobile[1] = new Otab("Otab",1000,"XYZ-20");
		printTitle();
		printMobile(mobile);
		
		System.out.println("[ 10분 충전 ]");
		printTitle();
		mobile[0].charge(10);
		mobile[1].charge(10);
		printMobile(mobile);
		
		System.out.println("[ 5분 사용 ]");
		printTitle();
		mobile[0].operate(5);
		mobile[1].operate(5);
		printMobile(mobile);
		
	}
	public static void printMobile(Mobile[] mobile){

		for (int i = 0; i < mobile.length; i++) {
			System.out.println(mobile[i].getMobileName() +"\t"+ mobile[i].getBatterySize() +"\t"+"\t"+ mobile[i].getOsType());
		}
		System.out.println();
	}
	public static void printTitle(){
		System.out.println("Mobile" +"\t"+ "Battery"+"\t"+"\t"+"OS");
		System.out.println("------------------------------------------");
	}
	
}



