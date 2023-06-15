package dsa04.arrays;

public class RichestCustomer {

	public static void main(String[] args) {
		int[][] arr= {{2,8,7},{7,1,3},{1,9,5}};
		System.out.println(richestCustomer(arr));

	}
	public static int richestCustomer(int[][] arr) {
		int maxSum=0;
		for(int row=0;row<arr.length;row++) {
			int sum=0;
			for(int col=0;col<arr[row].length;col++) {
				sum+=arr[row][col];
			}if(maxSum<sum) {
				maxSum=sum;
			}
		}
		return maxSum;
	}

}
