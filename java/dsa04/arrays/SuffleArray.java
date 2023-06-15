package dsa04.arrays;

import java.util.Arrays;

public class SuffleArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,3,2,1};
		System.out.println(Arrays.toString(suffArr(arr)));
	}
	public static int[] suffArr(int[] arr) {
		int n=arr.length/2;
		int[] ans=new int[arr.length];
		for(int i=0;i<n;i++) {
			ans[2*i]=arr[i];
			ans[2*i+1]=arr[i+n];			
		}
		return ans;
	}

}
