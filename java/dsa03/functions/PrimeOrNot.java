package dsa03.functions;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number ");
		int num=in.nextInt();
		System.out.println("The entered number is "+isPrime(num));
	}
	public static String isPrime(int num) {
		int c=2;
		if(num<=1) {return "not a prime";}
		while(c*c<=num) {
			if(num%c==0) {
				return "not a prime";
			}
			c++;
		}
		return "prime";
	}

}
