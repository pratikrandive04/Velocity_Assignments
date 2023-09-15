package Assignment5;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number : ");
		
		a = sc.nextInt();
		
		if (a%2==0) {
			System.out.println("Number You Entered Is Even Number");
		}
		else {
			System.out.println("Number You Entered Is Odd Number");
		}
	}
}
