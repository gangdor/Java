package day4;

public class TwoArrayTest2 {

	public static void main(String[] args) {
		int nums[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// 2�� 3���� ����غ���.
		System.out.print(nums[1][2]);
		System.out.println();
		System.out.println();
		// 4���� ����غ���.
		for (int i = 0; i < nums[3].length; i++)
			System.out.print(nums[3][i] + "\t");
		// 3���� ����غ���.
		System.out.println();
		for (int j = 0; j < nums.length; j++)
			System.out.print(nums[j][2] + "\t");
		
		System.out.println();
		System.out.println();
		
		
		
		// ��� ��� ��� ���� ��� (������� ����ó��)
		for(int i=0; i<nums.length; i++){
			for(int j=0; j<nums[i].length; j++){
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<nums.length; i++){
			for(int j=0; j<nums[i].length; j++){
				//���� �밢���� �ش�Ǵ� �� ���    (0,0) (1,1) (2,2) (3,3) 
				if(i==j)
					System.out.print(nums[i][j]+ "\t");
				else
					continue;
			}
			
		}
		System.out.println();
		
		for(int i=0; i<nums.length; i++){
			for(int j=0; j<nums[i].length; j++){
				//������ �밢���� �ش�Ǵ� �� ���    (0,3) (1,2) (2,1) (3,0)
				//��Ģ : i��j�� ���� n*n ������� -1
				if((i+j)==nums.length-1)
					System.out.print(nums[i][j]+ "\t");
				else
					continue;
			}
		}
	}

}
