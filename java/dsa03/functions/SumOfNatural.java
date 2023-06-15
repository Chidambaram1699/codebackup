package dsa03.functions;

import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a numbers  : ");
		int num=in.nextInt();
		System.out.println("The sum of n natural numbers "+sumOfNatural(num));
	}
	public static int sumOfNatural(int num) {
		int sum=0;
		while(num!=0) {
			sum+=num;
			num--;
		}
		return sum;	
	}
	

}
