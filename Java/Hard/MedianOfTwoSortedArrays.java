import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public double medianOfTwoSortedArrays(int []nums1,int nums2[]){

        if(nums1.length>nums2.length) {
        	int[]temp = nums1;
        	nums1=nums2;
        	nums2=temp;
        }
        
        int m = nums1.length;
		int n =nums2.length;
		int minIndex =0,maxIndex=m;
		int median = (m+n+1)/2;
		
		while(minIndex<=maxIndex) {
			int i = (minIndex+maxIndex)/2;
			int j = median-i;
			
			if(i<m && nums2[j-1]>nums1[i]) {
				minIndex = i+1;
			}
			else if(i>0 && nums1[i-1]>nums2[j]) {
				maxIndex = i-1;
			} else {
				int nums1Left = (i==0)?Integer.MIN_VALUE:nums1[i-1];
				int nums1Right = (i==m)?Integer.MAX_VALUE:nums1[i];
				int nums2Left = (j==0)?Integer.MIN_VALUE:nums2[j-1];
				int nums2Right = (j==n)?Integer.MAX_VALUE:nums2[j];
				
				if((m+n)%2==1) {
					return Math.max(nums1Left, nums2Left);
				} else {
					return (Math.max(nums1Left, nums2Left)+ Math.min(nums1Right, nums2Right))/2.0;
				}
			}
		}
		
		return 0.0;       
    }
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int nums1[] = {1,2};
        int nums2[] = {3,4};
		MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
		double result = medianOfTwoSortedArrays.medianOfTwoSortedArrays(nums1,nums2);
		
		System.out.print(result);
		
    }
    
}