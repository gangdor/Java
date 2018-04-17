package day4;

public class ArrayTest4 {

	public static void main(String[] args) {
		int nums[] = { 10, 5, 7, 15, 12, 20, 14, 8, 25, 19 };
		System.out.println(nums[0]);
		System.out.println(nums[9]);
		System.out.println(nums[nums.length - 1]);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();

		for (int j = nums.length - 1; j >= 0; j--) {
			System.out.print(nums[j] + "\t");
		}
		System.out.println();

		for(int a=0; a<nums.length; a+=2){
			System.out.print(nums[a] + "\t");
		}
		System.out.println();
		
		int maxNum=nums[0];
		int minNum=nums[0];
		//nums에서 최고값을 추출하여 maxNum 저장
		for(int b=0; b<nums.length; b++){
			if(nums[b]>maxNum){
				maxNum=nums[b];
				
			}
			else if(nums[b]<minNum){
				minNum=nums[b];
			}
					
		}
		System.out.println("nums배열중 최고값은 : "+maxNum);
		
		System.out.println("nums배열중 최소값은 : "+minNum);
		
	}

}
