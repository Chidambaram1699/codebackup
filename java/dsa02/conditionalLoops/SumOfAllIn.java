package dsa02.conditionalLoops;

import java.util.Scanner;

public class SumOfAllIn {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num = 0,sum=0;
		do {
		System.out.println("Enter a number : ");
		num=in.nextInt();
		sum+=num;
		System.out.println("Cum sum = "+sum);
		}while(num!=0);

	}

}
