package dsa03.functions;

import java.util.Scanner;

public class VoteEligible {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your age ");
		int a=in.nextInt();
		System.out.println("You are "+checkEligible(a)+" to vote");
	}
	public static String checkEligible(int num) {
		if(num>=18) {return "eligible";}
		return "not eligible";
	}

}
