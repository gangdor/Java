package day11;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("�������");
		try{
			int num1 = Integer.parseInt(args[0]); // ���ڷ� �ٲپ� �ִ� ��.
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("���� ��� :" + result);
		}
		
		catch(ArithmeticException e){
			System.out.println("�� ��° ���ڴ� 0�� �� �����");
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println(e.toString());
			e.printStackTrace();
			return;
		}
		catch(NumberFormatException e){			
			System.out.println("���ڸ� �Է��ϼ���");
			e.printStackTrace();
		}
		
		catch(Exception e){
			System.out.println("�ΰ��� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���");
		}/*catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�ΰ��� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���");
		}*/
		
		finally{
			System.out.println("�� ���� �ݵ�� �����մϴٿ�...");
		}
		System.out.println("��������");
	}
}
