package day3;

public class WhileLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		char sth = 'A';
		boolean flag = true;
		while (flag) {
			int num = (int) (Math.random() * 31);
					switch (num) {
					case 0:
						flag = false;
						break;
					case 1:
						sth = 'A';
						break;
					case 2:
						sth = 'B';
						break;
					case 3:
						sth = 'C';
						break;
					case 4:
						sth = 'D';
						break;
					case 5:
						sth = 'E';
						break;
					case 6:
						sth = 'F';
						break;
					case 7:
						sth = 'G';
						break;
					case 8:
						sth = 'H';
						break;
					case 9:
						sth = 'I';
						break;
					case 10:
						sth = 'J';
						break;
					case 11:
						sth = 'K';
						break;
					case 12:
						sth = 'L';
						break;
					case 13:
						sth = 'M';
						break;
					case 14:
						sth = 'N';
						break;
					case 15:
						sth = 'O';
						break;
					case 16:
						sth = 'P';
						break;
					case 17:
						sth = 'Q';
						break;
					case 18:
						sth = 'R';
						break;
					case 19:
						sth = 'S';
						break;
					case 20:
						sth = 'T';
						break;
					case 21:
						sth = 'U';
						break;
					case 22:
						sth = 'V';
						break;
					case 23:
						sth = 'W';
						break;
					case 24:
						sth = 'X';
						break;
					case 25:
						sth = 'Y';
						break;
					case 26:
						sth = 'Z';
						break;
					case 27:
					case 28:
					case 29:
					case 30:
						flag = false;
						break;
		
					}
			
			if(0<num && num<27){
			System.out.println(sth + "(" + num + ")");
			count++;
			}
			else
				break;
		}
		System.out.println("수행횟수는 " + count + "번입니다.");
	}

}
