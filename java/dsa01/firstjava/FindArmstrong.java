package dsa01.firstjava;

import java.util.Scanner;

public class FindArmstrong {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=input.nextInt();
		int power =(int) Math.log10(num)+1;//shortcut to find number of digits
		int a=num,b,c,d = 0;
		while(a!=0) {
			b=a/10;
			c=a%10;
			d+=(Math.pow(c,power));
			a=b;
		}
		if(num==d) {
			System.out.println(num+" is a armstrong number");
		}else {System.out.println("It is not a armstrong number");}
	}

}
 