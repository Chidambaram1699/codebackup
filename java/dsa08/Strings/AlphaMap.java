package dsa08.Strings;

public class AlphaMap {

	public static void main(String[] args) {
		String in="3894113#2118#113#";
			System.out.println(map(in));
	}
	public static StringBuilder map(String in) {
		StringBuilder ans=new StringBuilder();
		int i=0;
		while(i<in.length()) {
			if((i<=in.length()-3)&&(in.charAt(i+2)=='#')) {
				int mp = Integer.parseInt(in.substring(i, i+2));
				ans.append((char)(mp+64));//96 for small letters
				i+=3;
			}else {
				int mp = Integer.parseInt(in.substring(i, i+1));
				ans.append((char)(mp+64));
				i++;
			}
			
		}
		return ans;
	}


}
