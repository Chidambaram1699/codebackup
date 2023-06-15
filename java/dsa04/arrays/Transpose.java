package dsa04.arrays;

import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {
		int[][] arr={{1,2,3}
					,{4,5,6}
					,{7,8,9}};
		int[][] tran = trans(arr);
		for(int[] i :tran) {
			System.out.println(Arrays.toString(i));
		}
		
	}
	public static int[][] trans(int[][] arr){
		int n=arr.length,m=arr[0].length;
		int[][] ans = null;
		ans=new int[m][n];
		for(int row=0;row<n;row++) {
			for(int col=0;col<arr[row].length;col++) {
				ans[col][row]=arr[row][col];
				}
		}
		return ans;
	}

}
