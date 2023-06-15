package dsa04.arrays;

import java.util.Arrays;

public class GreatestCandie {

	public static void main(String[] args) {
		int[] arr= {12,1,12};
		System.out.println(Arrays.toString(exCandy(arr,1)));

	}
	public static boolean[] exCandy(int[] arr,int ext) {
		boolean[] ans=new boolean[arr.length];
		boolean bool=true;;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if((arr[i]+ext)>=arr[j]) {bool=true;
				}else{bool=false;break;}
			}ans[i]=bool;
		}
		return ans;
	}

}
