package dsa03.functions;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your mark for 100 : ");
		grade(in.nextInt());
	}
	public static void grade(int mark) {
		if((mark<=100) && (91<=mark)) {
			System.out.println("The grade is AA");
		}else if((mark<=90) && (81<=mark)) {
			System.out.println("The grade is AB");
		}else if((mark<=80) && (71<=mark)) {
			System.out.println("The grade is BB");
		}else if((mark<=70) && (61<=mark)) {
			System.out.println("The grade is BC");
		}else if((mark<=60) && (51<=mark)) {
			System.out.println("The grade is CC");
		}else if((mark<=50) && (41<=mark)) {
			System.out.println("The grade is CD");
		}else if(mark<=40) {
			System.out.println("The grade is fail");
		}
		}
	}


