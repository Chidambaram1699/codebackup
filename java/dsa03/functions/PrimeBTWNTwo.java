package dsa03.functions;

import java.util.Scanner;

public class PrimeBTWNTwo {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter two number (range) : ");
	int start=in.nextInt(),end=in.nextInt();
	for(int i=start;i<end;i++) {
		if(isPrime(i)) {
			System.out.print(i+" ");
		}
	}
	}public static boolean isPrime(int num) {
		int c=2;
		if(num<=1) {return false;}
		while(c*c<=num) {
			if(num%c==0) {
				return false;
			}
			c++;
		}
		return c*c>num;
	}

}
