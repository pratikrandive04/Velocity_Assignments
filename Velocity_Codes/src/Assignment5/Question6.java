package Assignment5;

import java.util.Scanner;

public class Question6 {
	
	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number : ");
		
		a = sc.nextInt();
		
		if (a>100) {
			System.out.println("Number You Entered Is Greater Than 100");
		}
		else {
			System.out.println("Number You Entered Is Not Greater Than 100");
		}
	}
}
