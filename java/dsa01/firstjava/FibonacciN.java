package dsa01.firstjava;

import java.util.Scanner;

public class FibonacciN {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number :");
		int num=input.nextInt();
		int a=0,b=1,c,n=0;
		while(n!=num) {
			System.out.print(b+" ");
			c=a+b;
			a=b;
			b=c;
			n++;
		}

	}

}
