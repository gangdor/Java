package day5;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		char[][]ch = {	
				{'B','C','A', 'A'},
				{'C','C','B', 'B'},
				{'D','A','A', 'D'},
		} ;
		
		int[]count=new int[4];
		
		//����Ƚ��count
		int a,b,c,d;
		a=0;
		b=0;
		c=0;
		d=0;
		
		//��ü Ž�� �� �����ľ�
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				if(ch[i][j]=='A') a++;
				else if(ch[i][j]=='B') b++;
				else if(ch[i][j]=='C') c++;
				else d++;
			}
		}
		//������
			switch(1){
			case 0: count[0] = a;
			case 1: count[1] = b;
			case 2: count[2] = c;
			case 3: count[3] = d;
			}
		//}
			//�̰Źݺ������� ���ϳ�
			System.out.printf((char)65 + "�� %d�� �Դϴ�.", a);
			System.out.println();
			System.out.printf((char)66 + "�� %d�� �Դϴ�.", b);
			System.out.println();
			System.out.printf((char)67 + "�� %d�� �Դϴ�.", c);
			System.out.println();
			System.out.printf((char)68 + "�� %d�� �Դϴ�.", d);
			
		
	}

}
