package dsa04.arrays;

public class HighestAltitude {

	public static void main(String[] args) {
		int[] arr= {-4,-3,-2,-1,4,3,2};
		System.out.println(highAlti(arr));
	}
	public static int highAlti(int[] gain) {
		int high=0;
		int tempAl=0;
		for(int i=0;i<gain.length;i++) {
			tempAl+=gain[i];
			if(high<tempAl) {
				high=tempAl;
			}
		}
		return high;
	}

}
