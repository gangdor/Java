package work;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane ap = new Airplane("L747", 1000);
		Plane cp = new Cargoplane("C40", 1000);
		
		printTitle();
		printInfo(ap);
		printInfo(cp);
		
		System.out.println();
		System.out.println("[100 운항]");
		printTitle();
		cp.flight(100);
		ap.flight(100);
		printInfo(ap);
		printInfo(cp);
		
		System.out.println();
		System.out.println("[200 주유]");
		printTitle();
		cp.refuel(200);
		ap.refuel(200);
		printInfo(ap);
		printInfo(cp);
	}
	
	public static void printInfo(Plane list){
		System.out.println(list.getPlaneName()+"\t"+"\t"+list.getFuelSize());
	}
	public static void printTitle(){
		System.out.println("Plane"+"\t"+"\t"+"fuleSize");
		System.out.println("------------------------------");
	}

}
