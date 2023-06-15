package dsa03.functions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number ");
		int a=in.nextInt();
		System.out.println(a+ " is a "+checkodd(a)+" number");
	}
	public static String checkodd(int num) {
		if(num%2==0) {return "even";}
		return "odd";
	}

}
