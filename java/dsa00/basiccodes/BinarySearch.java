package dsa00.basiccodes;

public class BinarySearch {
	public static void main(String[] args) {
		int target=9;
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		System.out.println(binarySearch(target,arr));
	}
	public static int binarySearch(int target,int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}		
		return -1;
	}
}
