package practice;

public class exercise4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println('0'+1);
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		//0 ascii�� 48 9�� 57
		for (int i = 0; i < value.length(); i++) {
			if((value.charAt(i))>=48 && (value.charAt(i))<=57){
				System.out.println(value.charAt(i));
				isNumber= true;
			}
			else{
				System.out.println(value.charAt(i)+"�����");
				isNumber=false;
				break;
			}
		}
		
		if(isNumber) System.out.println("�����Դϴ�.");
		else System.out.println("���ڰ� �ƴմ�.");
				
	}

}
