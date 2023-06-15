package dsa08.Strings;

import java.util.Arrays;

public class EquivalentString {

	public static void main(String[] args) {
	String[] a= {"acb","c"},b= {"ac","bc"};
	System.out.println(equi(a,b));
	}
	public static boolean equi(String[] a,String[] b) {
		return convert(a).equals(convert(b));
	}
	public static String convert(String[] a) {
		return (Arrays.toString(a)).replaceAll("[^0-9a-zA-Z]", "");
	}

}
