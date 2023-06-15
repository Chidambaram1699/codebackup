package dsa03.functions;

import java.util.Scanner;

public class SumofTwo {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Enter 1st number  ");
	int num1=in.nextInt();
	System.out.print("Enter 2st number  ");
	int num2=in.nextInt();
	System.out.println("The sum is "+sum(num1,num2));
	System.out.println("The product is "+product(num1,num2));
	}
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	public static int product(int num1,int num2) {
		return num1*num2;
	}

}
