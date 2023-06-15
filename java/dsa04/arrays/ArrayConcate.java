package dsa04.arrays;

import java.util.Arrays;

public class ArrayConcate {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(Arrays.toString(concat(arr)));
	}
	public static int[] concat(int[] arr) {
		int n=arr.length;
		int[] ans=new int[n*2];
		for(int i=0;i<n;i++) {
			ans[i]=arr[i];
			ans[i+n]=arr[i];
		}
		return ans;
	}

}
