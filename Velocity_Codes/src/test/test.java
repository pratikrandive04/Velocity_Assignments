package test;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number : ");
		
		a = sc.nextInt();
		
		if (a%2 == 0) {
			System.out.println("The Number Entered Is Even");
		}
		else {
			System.out.println("The Number Entered Is Odd");
		}
	}
}
