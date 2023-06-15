package dsa01.firstjava;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string :");
		String IName=input.nextLine();
		String orgStr=IName.toLowerCase();
		String revStr="";
		for(int i=orgStr.length()-1;i>=0;i--) {
			revStr+=orgStr.charAt(i);
		}
		if(orgStr.equals(revStr)) {
			System.out.println(orgStr+" is a palindrome");
;		}else {System.out.println(orgStr+" is not a paindrome");}

	}

}
