package dsa03.functions;

public class Palindrome {

	public static void main(String[] args) {
		int in=123321;
		System.out.println("The given number is "+isPalindrome(in));
	}
	public static String isPalindrome(int num) {
		int a=num,b,c=0;
		while(a!=0) {
			b=a%10;
			a/=10;
			c=c*10+b;			
		}if(c==num) {return "a palindrome";}
		return "not a palindrome";
	}

}
