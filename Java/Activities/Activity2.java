package activities;

public class Activity2 {
	
	public static void main(String[] args) {
		
		Activity2 act2 = new Activity2();
	
	
	int[] nums = {1,4,6,7,7,-13};
	
	int searchNum = 7;
	int fixedsum = 30;
	
		System.out.println("result:" + act2.result(nums,searchNum,fixedsum)); 
}
	public boolean result(int[] nums,int searchNum, int fixdedSum) {
		int tempsum = 0;
		
		for(int number : nums) {
			if(number == searchNum) {
				tempsum += searchNum;
			}
			//check if tempSum is greateer than fixedSum
			if(tempsum > fixdedSum) {
				break;
			}
		}
		return fixdedSum ==tempsum;

}
	
}
