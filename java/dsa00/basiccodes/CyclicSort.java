package dsa00.basiccodes;

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10,1,3,5,7,9};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int corr=arr[i]-1;
			if(arr[i]!=arr[corr]) {
				swap(arr,i,corr);
			}else {i++;}
		}
	}
	static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
