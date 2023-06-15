package dsa03.functions;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter three numbers : ");
		int num1=in.nextInt(),num2=in.nextInt(),num3=in.nextInt();
		System.out.println("max = "+max(num1,num2,num3));
		System.out.println("min = "+min(num1,num2,num3));
	}
	public static int min(int num1, int num2, int num3) {
		int min;
		if(num1>num2) {
			min=num2;
		}else {min=num1;}
		if(min>num3) {return num3;}
		return min;
	}
	public static int max(int num1, int num2, int num3) {
		int max;
		if(num1>num2) {
			max=num1;
		}else {max=num2;}
		if(max<num3) {return num3;}
		return max;

	}

}
