package dsa04.arrays;

import java.util.Arrays;

public class TarArr {

	public static void main(String[] args) {
		int[] arr1= {0,1,2,3,4};
		int[] ind= {0,1,2,2,1};
		System.out.println(Arrays.toString(tarArr(arr1,ind)));

	}
	public static int[] tarArr(int[] orgArr,int[] indArr) {
		int n=orgArr.length;
		int[] ans=new int[n];
		for(int i=0;i<n;i++) {
			if(ans[indArr[i]]!=0) {
				for(int j=ans.length-2;j>=indArr[i];j--) {
					ans[j+1]=ans[j];
				}
			}
			ans[indArr[i]]=orgArr[i];
		}
		return ans;
	}

}