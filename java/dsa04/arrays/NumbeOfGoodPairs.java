package dsa04.arrays;

public class NumbeOfGoodPairs {
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,1,3};
		System.out.println(goodPair(arr));
	}
public static int goodPair(int[] arr) {
	int n=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if((arr[i]==arr[j])&&(i<j)) {
				n++;
			}
		}
	}
	return n;
}
}
