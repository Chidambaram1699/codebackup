package dsa05.binarySearch;

public class GuessGame {

	public static void main(String[] args) {
		System.out.println(guess(20,3));
	}
	public static int guess(int n,int p) {
		int start=1,end=n,mid=0;
		while(start<end) {
			mid=(start+end)/2;
			if(mid==p) {
				return mid;
			}else if(mid>p) {
				end=mid-1;
			}else if(mid<p) {
				start=mid+1;
			}
		}
		return start;
	}

}
// guess>pick=-1
//guess<pick=1
//guess==pick=0