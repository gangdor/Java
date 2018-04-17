package day6;

public class MethodLab6 {

	public static void main(String[] args) {
		char[]a1 = {'A','B','C'};
		char[]a2 = {'a','b','c','D','E','F'};
		char[]a3 = {'z','S','Z','S'};
		System.out.printf("[출력 결과]%n-------------%n");
		printChar_before(a1);
		convertChar(a1);
		printChar_after(a1);
		
		printChar_before(a2);
		convertChar(a2);
		printChar_after(a2);
		
		printChar_before(a3);
		convertChar(a3);
		printChar_after(a3);
	}
	
	public static void convertChar(char[] ch){
		for(int i=0; i<ch.length; i++){
			if('A'<= ch[i] && ch[i]<='Z')
				ch[i]+=(char)(32);
			else if('a'<= ch[i] && ch[i]<='z')
				ch[i]+=(char)(-32);
		}
	}
	
	//convertChar 수행 전 출력
	public static void printChar_before(char[] ch){
		System.out.print("호출전 : ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	//convertChar 수행 후 출력
	public static void printChar_after(char[] ch){
		System.out.print("호출후 : ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("-------------");
		
	}

}
