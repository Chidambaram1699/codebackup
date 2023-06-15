package dsa01.firstjava;

import java.util.Scanner;

public class SimCalculator {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Operate 2 numbers :");
	int a = input.nextInt();
	String opr=input.next();
	int b=input.nextInt();
	if(opr.equals("+")) {System.out.println("Sum of input ="+(a+b));}
	else if(opr.equals("-")) {System.out.println("Sub of input ="+(a-b));}
	else if(opr.equals("*")) {System.out.println("Multiply  of input ="+(a*b));}
	else if(opr.equals("/")) {System.out.println("Division of input ="+(a/b));}
	else if(opr.equals("%")) {System.out.println("Modulus of input ="+(a%b));}

	}

}
