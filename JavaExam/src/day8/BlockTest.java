package day8;

public class BlockTest {

	static {
		System.out.println("static 블럭 수행");
	}
		{
			System.out.println("instance 블럭 수행");
		}
		
	public BlockTest(){
		//System.out.println("생성자수행");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt2 = new BlockTest();
		
		
	}
}