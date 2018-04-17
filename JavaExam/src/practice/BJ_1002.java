package practice;

import java.util.ArrayList;
import java.util.Scanner;

class Turret{
	int x1, y1, r1, x2, y2, r2;
	Turret(int x1, int y1, int r1, int x2, int y2, int r2){
		this.x1 = x1;
		this.y1 = y1;
		this.r1 = r1;
		this.x2 = x2;
		this.y2 = y2;
		this.r2 = r2;
	}
}

class Spot1{
	int n1,m1;
	public Spot1(int n1, int m1){
		this.n1=n1;
		this.m1=m1;
	}
	public String toString(){
		return "("+n1+", "+m1+")";
	}

}

class Spot2{
	int n2,m2;
	public Spot2(int n2, int m2){
		this.n2=n2;
		this.m2=m2;
	}
	public String toString(){
		return "("+n2+", "+m2+")";
	}
}

public class BJ_1002 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Test ��  : ");
		int t = scan.nextInt();
		int x1, y1,r1, x2, y2, r2;
		
		Turret turret[] = new Turret[t];
		for (int i = 0; i < t; i++) {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			r1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			r2 = scan.nextInt();
			turret[i] = new Turret(x1,y1,r1,x2,y2,r2);
		}
		
		//System.out.println(turret[1].);
		//n,m ���ϱ�
		ArrayList<Spot1> arraylist1 = new ArrayList<Spot1>();
		ArrayList<Spot2> arraylist2 = new ArrayList<Spot2>();
		
		
			
		for (int z = 0; z < t; z++) {
			arraylist1=Cal_Spot1(turret[z]); //n1���ϰ�
			arraylist2=Cal_Spot2(turret[z]); //n1���ϰ�
			int count=0; //�������̽� �˻� ������ ++

			for (int i = 0; i < arraylist1.size(); i++) {
				for (int j = 0; j < arraylist2.size(); j++) {
					if(arraylist1.get(i).n1==arraylist2.get(j).n2 && arraylist1.get(i).m1==arraylist2.get(j).m2){
						//System.out.println("������ �ִ�. �ö󰩴ϴٿ�");
						count++;
					}
				}
			}
	
			if(count>2){
				count=-1;
				System.out.println(count);
			}
			else{
				System.out.println(count);
			}
			
			
			
		}
		
		
		/*for (int i = 0; i < arraylist1.size(); i++) {
			System.out.print(arraylist1.get(i).toString());
			
		}
		System.out.println();
		for (int i = 0; i < arraylist2.size(); i++) {
			System.out.print(arraylist2.get(i).toString());
			
		}*/
		
		//n1,m1 ���ǿ� ���� ������ �����ҵ�??
		
		
		
		
	}
	
	
	public static ArrayList<Spot1> Cal_Spot1(Turret turret){
		int r_n1=0, r_m1=0;
		ArrayList<Spot1> arr_spot1 = new ArrayList<Spot1>();
		
		for (int n1 = -10000; n1 <=10000 ; n1++) {
			for (int m1 = -10000; m1 <= 10000; m1++) {
				if(turret.r1*turret.r1 == (turret.x1*turret.x1)-(2*turret.x1*n1)+(n1*n1)  +  (turret.y1*turret.y1)-(2*turret.y1*m1)+(m1*m1)){
					r_n1=n1;
					r_m1=m1;
					arr_spot1.add(new Spot1(r_n1, r_m1));
				}
			}
		}
		return arr_spot1;

	} 
	
	public static ArrayList<Spot2> Cal_Spot2(Turret turret){
		int r_n2=0, r_m2=0;
		ArrayList<Spot2> arr_spot2 = new ArrayList<Spot2>();
		
		for (int n1 = -10000; n1 <10000 ; n1++) {
			for (int m1 = -10000; m1 < 10000; m1++) {
				if(turret.r2*turret.r2 == (turret.x2*turret.x2)-(2*turret.x2*n1)+(n1*n1)  +  (turret.y2*turret.y2)-(2*turret.y2*m1)+(m1*m1)){
					r_n2=n1;
					r_m2=m1;
					arr_spot2.add(new Spot2(r_n2, r_m2));
				}
			}
		}
		return arr_spot2;

	} 
	
	//N1���̽��� �־��� ����� n1,m1���� ã�� N2���̽��� �־��� n1,m1�� ã�� �̰͵��� ���� ���ؼ� ������ ���� ����
}
