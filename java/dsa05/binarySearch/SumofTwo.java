package dsa05.binarySearch;

import java.util.Arrays;

public class SumofTwo{
	
	public static void main(String[] args) {
		int[] arr= {2,11,15,7};
		System.out.println(Arrays.toString(twoSum(arr,9)));
	
	}
	 public static int[] twoSum(int[] nums, int target) {
	        int[] ind;
	        for(int i=0;i<nums.length-1;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]+nums[j]==target){
	                    return new int[]{i,j};
	                }
	            }
	        }
			return new int[] {-1,-1};
	    }
	

}