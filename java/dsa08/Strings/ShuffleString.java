package dsa08.Strings;

public class ShuffleString {

	public static void main(String[] args) {
		String s="mhbacadrmia";
		int[] ind= {5,1,6,4,0,7,3,8,10,2,9};
		System.out.println(suffStr(s,ind));
	}
	//c h i d a m b a r a m
	//0 1 2 3 4 5 6 7 8 9 10
	public static StringBuilder suffStr(String s,int[] ind) {
		StringBuilder ans=new StringBuilder();
		int i=0;
		while(ans.length()!=s.length()) {
			ans.append(s.charAt(pos(ind,i)));
			i++;
		}
		
		return ans;
	}
	public static int pos(int[] arr,int cyc) {
		int pos=-1;
		for(int i=0;i<arr.length;i++) {
			if (cyc==arr[i]) {
				return i;
			}
		}
		return pos;
	}

}
