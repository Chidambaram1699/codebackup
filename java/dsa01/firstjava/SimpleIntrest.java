package dsa01.firstjava;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Principle 'P' :");
	int P=input.nextInt();
	System.out.println("Enter the Time 'T' :");
	int T=input.nextInt();
	System.out.println("Enter the Rate of intrest 'R' :");
	int R=input.nextInt();
	int SI=(P*T*R)/100;
	System.out.println("The simple intrest is ="+SI);
	}

}
