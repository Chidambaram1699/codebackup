package dsa08.Strings;

public class RoboOrigin {

	public static void main(String[] args) {
		System.out.println(org("udrl"));
	}
	public static boolean org(String in) {
		int ver=0,hor=0;
		String c=in.toLowerCase();
		int i=0;
		while(i<c.length()) {
			char s=c.charAt(i);
			switch(s) {
			case 'u':ver++;break;
			case 'd':ver--;break;
			case 'r':hor++;break;
			case 'l':hor--;break;
			}
			i++;
		}
		return (hor==0)&&(ver==0);
	}

}
