package day6;

public class MethodLab4 {

	public static void main(String[] args) {
		int array_1[] = {10,20,30};
		int array_2[] = {100,500,300,200,400};
		int array_3[] = {1,10,3,4,5,8,7,6,9,2};
		
		int max_1 = maxNumArray(array_1);
		int max_2 = maxNumArray(array_2);
		int max_3 = maxNumArray(array_3);
		
		System.out.printf("가장 큰 값은 %d입니다.%n", max_1);
		System.out.printf("가장 큰 값은 %d입니다.%n", max_2);
		System.out.printf("가장 큰 값은 %d입니다.%n", max_3);
	}
	
	public static int maxNumArray(int nums[]){
		int maxResult=nums[0];
		for (int i = 0; i < nums.length; i++) {
				if(maxResult<nums[i])
					maxResult=nums[i];
			}
		return maxResult;
	}

}
