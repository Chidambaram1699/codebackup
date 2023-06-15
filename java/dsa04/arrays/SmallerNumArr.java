package dsa04.arrays;

import java.util.Arrays;

public class SmallerNumArr {

	public static void main(String[] args) {
		int[] arr= {8,1,2,2,3};
		System.out.println(Arrays.toString(smallerArr(arr)));
	}
	public static int[] smallerArr(int[] arr) {
		int[] ans=new int[arr.length];
		int count;
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=0;j<arr.length;j++) {
				if((arr[i]>arr[j])&&(i!=j)) {
					count++;
				}
			}ans[i]=count;
		}
		return ans;
	}

}
