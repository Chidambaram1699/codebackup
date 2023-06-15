package dsa05.binarySearch;
import java.util.Arrays;
public class TarSumIndex {
	public static void main(String[] args) {
		int[] arr= {-1,0};
		System.out.println(Arrays.toString(indArr(arr,-1)));
	}
	public static int[] indArr(int[] arr,int num) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==num) {
					return new int[] {i+1,j+1};
				}
			}
		}
		return new int[] {-1,-1};
	} 
}
