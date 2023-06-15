package dsa01.firstjava;

import java.util.Scanner;

public class RupeeToUSD {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.print("Enter currency in rupee :");
		 float INR=input.nextFloat();
		 float USD =INR/82.747f;
		 System.out.println("The currency in dollar = "+USD);

	}
//82.747
	//0.0121
}
