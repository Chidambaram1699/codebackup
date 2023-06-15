package dsa02.conditionalLoops;

import java.util.Scanner;

public class SubProSum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=in.nextInt();
		int a=num,b,pro=1,sum=0,sub=0;
		while(a!=0) {
			b=a%10;
			a/=10;
			pro*=b;
			sum+=b;
		}sub=pro-sum;
		System.out.println(sub);
	}

}
