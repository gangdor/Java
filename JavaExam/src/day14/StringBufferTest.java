package day14;

public class StringBufferTest {

	public static void main(String[] args) {		
		StringBuffer buffer = new StringBuffer("");
		String str = "�ڹ����α׷���";
     	buffer.append(str);

        System.out.printf("%s\n", buffer);
        buffer.reverse();
        System.out.printf("%s\n", buffer.reverse());
        System.out.printf("���� : %d\n", buffer.length());    
        
        
        
	}
}






