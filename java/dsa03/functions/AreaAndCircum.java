package dsa03.functions;

import java.util.Scanner;

public class AreaAndCircum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter radius of the circle  ");
		int radius=in.nextInt();
		System.out.println("The area of the circle is "+area(radius));
		System.out.println("The circumference of a circle is "+circumference(radius));
	}

	public static float circumference(int radius) {
		return (float)(2*22*radius/7);
	}

	private static float area(int radius) {
		return (float)(22*radius*radius/7);
	}

}
