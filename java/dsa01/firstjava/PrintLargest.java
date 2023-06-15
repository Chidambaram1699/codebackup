package dsa01.firstjava;

import java.util.Scanner;

public class PrintLargest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a=input.nextInt();
		int b=input.nextInt();
		if(a>b) {
			System.out.println("The largest number is "+a);
		}else if(b>a) {
			System.out.println("The largest number is "+b);
		}else if(a==b) {
			System.out.println("Both number are equal");
		}
	}

}
