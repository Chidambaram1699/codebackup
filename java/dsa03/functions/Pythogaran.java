package dsa03.functions;

import java.util.Scanner;

public class Pythogaran {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter three  numbers  : ");
		int num1=in.nextInt(),num2=in.nextInt(),num3=in.nextInt();
		if(pythogaran(num1,num2,num3)) {
			System.out.println("Its is a pythogaran triplet");
		}else {System.out.println("It is not a pythogaran triplet");}
	}
	public static boolean pythogaran(int num1,int num2,int num3) {
		num1*=num1;num2*=num2;num3*=num3;
		if((num1==num2+num3)||(num2==num1+num3)||(num3==num1+num2)) {
			return true;
		}
		return false;
	}

}
