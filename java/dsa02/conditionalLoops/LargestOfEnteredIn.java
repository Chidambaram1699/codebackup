package dsa02.conditionalLoops;

import java.util.Scanner;

public class LargestOfEnteredIn {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num = 0,max=0;
		do {
		System.out.println("Enter a number : ");
		num=in.nextInt();
		if(num>max) {
			max=num;
		}
		
		}while(num!=0);
		System.out.println("The max of all is = "+max);

	}

}
