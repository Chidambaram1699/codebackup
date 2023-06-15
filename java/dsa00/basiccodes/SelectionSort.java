package dsa00.basiccodes;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {5,3,-2,0,9,-9,4,2,6,1,7};
		System.out.println(Arrays.toString(selection(a1)));
	}
	static int[] selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int maxind=getMaxInd(arr,0,last);
			swap(arr,maxind,last);
		}
		return arr;
	}
	static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static int getMaxInd(int[] arr,int start,int end) {
		int max=start;
		for(int i=0;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}

	
}
