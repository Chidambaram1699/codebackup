package dsa04.arrays;

import java.util.Arrays;

public class FlipImage {

	public static void main(String[] args) {
		int[][] arr={{1,1,0,0}
					,{1,0,0,1}
					,{0,1,1,1}
					,{1,0,1,0}};
		int[][] flipImage = flipImage(arr);
		for(int[] i:flipImage) {
			System.out.println(Arrays.toString(i));
		}
	}
	public static int[][] flipImage(int[][] arr){
		int[][] flip=new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			int[] rev=reverse(arr[i]);
			for(int j=0;j<rev.length;j++) {
				flip[i][j]=(rev[j]^1);
			}
		}
		return flip;
	}
	public static int[] reverse(int[] arr) {
		int start=0,end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;		
	}

}