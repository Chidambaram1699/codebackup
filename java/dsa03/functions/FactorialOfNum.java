package dsa03.functions;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number  : ");
		System.out.println(factorial(in.nextInt()));
	}
	public static int factorial(int num) {
		int fact=1;
		if(num==0||num==1) {return 1;
		}else {
			while(num!=1) {
				fact*=num;
				num--;
			}
		}
		return fact;
	}

}
