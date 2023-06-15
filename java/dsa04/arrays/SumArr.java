package dsa04.arrays;

import java.util.Arrays;

public class SumArr {

	public static void main(String[] args) {
		int[] arr= {8,7,6,5,4,3,2,1};
		int k=78;
		System.out.println(Arrays.toString(sumArr(arr,k)));
	}
	public static int[] sumArr(int[] arr,int k) {
		int num=0;
		for(int i:arr) {
			num=num*10+i;
		}num+=k;
		int[] ans=new int[(int)(Math.log10(num)+1)];
		for(int j=ans.length-1;j>=0;j--) {
			ans[j]=num%10;
			num/=10;
			
		}
		return ans;
	}

}
