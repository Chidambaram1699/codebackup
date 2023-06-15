package dsa08.Strings;
public class LowerCase {
	public static void main(String[] args) {
		//System.out.println(('A'+0));
		System.out.println(lower("HELLO"));
	}
	public static StringBuilder lower(String s) {
		StringBuilder ans=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<91&&s.charAt(i)>64) {
				ans.append((char)(s.charAt(i)+32));
			}else {  
				ans.append(s.charAt(i));
			}
		}return ans;
	}
}
