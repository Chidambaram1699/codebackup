package dsa08.Strings;

public class RevereseEachWord {

	public static void main(String[] args) {
		System.out.println(rev("Let's make education simple"));
	}
	public static StringBuilder rev(String s) {
		StringBuilder ans=new StringBuilder();
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				ans.append(arr[i].charAt(j));
			}ans.append(" ");
		}
		return ans;
	}

}
