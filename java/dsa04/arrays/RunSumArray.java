package dsa04.arrays;

import java.util.Arrays;

public class RunSumArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(runSum(arr)));
	}
	public static int[] runSum(int[] arr) {
		int[] ans=new int[arr.length];
		ans[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			ans[i]=ans[i-1]+arr[i];
		}
		return ans;
	}
}
