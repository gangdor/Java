package practice;

public class exercise4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println('0'+1);
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		//0 ascii는 48 9는 57
		for (int i = 0; i < value.length(); i++) {
			if((value.charAt(i))>=48 && (value.charAt(i))<=57){
				System.out.println(value.charAt(i));
				isNumber= true;
			}
			else{
				System.out.println(value.charAt(i)+"노숫자");
				isNumber=false;
				break;
			}
		}
		
		if(isNumber) System.out.println("숫자입니다.");
		else System.out.println("숫자가 아닙늬.");
				
	}

}
