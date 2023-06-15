package dsa02.conditionalLoops;

import java.util.Scanner;

public class Area {
	static Scanner in;
	public static void main(String[] args) {
		areaOfRectangle();
	}
	public static void areaOfCircle() {
		in =new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		float radius=in.nextFloat();
		float area=(22/7)*radius*radius;
		System.out.println("The area of the circle is "+area);
	}
	public static void areaOfTriangle() {
		in =new Scanner(System.in);
		System.out.println("Enter base of the triangle :");
		int base=in.nextInt();
		System.out.println("Enter height of the triangle :");
		int height=in.nextInt();
		float area=(float) (base*height*0.5);
		System.out.println("The area of the triangle is : "+area);
	}
	public static void areaOfRectangle() {
		in =new Scanner(System.in);
		System.out.println("Enter length of the rectangle :");
		int length=in.nextInt();
		System.out.println("Enter breath of the rectangle :");
		int breath=in.nextInt();
		int area=length * breath;
		System.out.println("The area of the rectangle is : "+area);
	}
	
	


}
