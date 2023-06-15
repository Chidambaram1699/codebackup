package dsa00.basiccodes;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
	}
	public static int[] bubbleSort(int[] arr) {
		int end=arr.length;
		boolean swapped=true;
		while(swapped) {	
			swapped=false;
			for(int j=1;j<end;j++) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
					swapped=true;
					if(!swapped) {break;}
				}

				System.out.println(Arrays.toString(arr));
			}end--;
		}
		return arr;
	}
	public static void swap(int[] arr ,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
