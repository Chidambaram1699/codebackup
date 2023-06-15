package dsa08.Strings;
public class ExlNamToNum {

	public static void main(String[] args) {
		String s="ZZZZ";
		System.out.println(colNo(s)+" "+s);
	}
	public static int colNo(String s) {
		String uC = s.toUpperCase();
		int num=0;
		for(int i=uC.length()-1, j=0;i>=0;i--,j++) {
			num+=pValue(j,uC.charAt(i));}
		return num;
	}
	public static int pValue(int pl,char C) {
		return (C-'A'+1)*((int)Math.pow(26, pl));
	}
}
