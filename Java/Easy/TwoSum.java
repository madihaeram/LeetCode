import java.util.Scanner;

public class TwoSum {
	public int[] twoSum(int []nums,int target){
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(target == nums[i]+nums[j]) {
					return new int[] {i,j};
				}
			}
			
		}
		return new int[0];
        
    }
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int nums[] = {2,7,11,15};
        int target = 9;
		TwoSum TwoSum = new TwoSum();
		int result[] = TwoSum.twoSum(nums,target);
		for(int i:result) {
		System.out.print(i+" ");
		}
    }

}