package day8;

public class BlockTest {

	static {
		System.out.println("static �� ����");
	}
		{
			System.out.println("instance �� ����");
		}
		
	public BlockTest(){
		//System.out.println("�����ڼ���");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt2 = new BlockTest();
		
		
	}
}