package dsa08.Strings;

import java.util.Arrays;

public class SortingSentence {

	public static void main(String[] args) {
		String s="is2 This1 sentence4 a3";
		System.out.println(sort(s));
	}
	public static String sort(String in) {
		String[] CA=in.split(" ");
		String[] ans=new String[CA.length];
		for(int i=0;i<CA.length;i++) {
			int seq=Integer.parseInt(CA[i].substring(CA[i].length()-1));
			ans[seq-1]=CA[i];
		}
		String finl = Arrays.toString(ans);
		return finl.replaceAll("[^a-zA-Z ]", "");
	}
}