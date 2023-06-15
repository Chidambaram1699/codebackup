package dsa08.Strings;

public class StringAlive {

	public static void main(String[] args) {
	String s="aeiouAEIOU";
	System.out.println(alive(s));
	}
	public static boolean alive(String a) {
		char[] sA = a.toCharArray();
		return count(sA,0,(sA.length/2)-1)==count(sA,(sA.length/2),sA.length-1);
	}
	public static int count(char[] a,int start,int end) {
		int count=0;
		for(int i=start;i<=end;i++) {
			switch(a[i]) {
			case 'a':case 'e':case 'i':case 'o':case 'u':
			case 'A':case 'E':case 'I':case 'O':case 'U':
				count++;
			}
		}
		return count;
	}

}
