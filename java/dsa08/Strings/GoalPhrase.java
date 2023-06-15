package dsa08.Strings;

public class GoalPhrase {

	public static void main(String[] args) {
		String s="G()(al)";
		System.out.println(goal(s));
	}
	public static StringBuilder goal(String s) {
		StringBuilder ans=new StringBuilder();
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i)=='G') {
				ans.append("G");
				i++;
			}else if(s.charAt(i)=='(') {
				if(s.charAt(i+1)==')') {
					ans.append("o");
					i+=2;
				}else if(s.substring(i,i+4).equals("(al)")) {
					ans.append("al");
					i+=4;
				}
			}
		}
		return ans;
	}

}
