package Assignment5;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number : ");
		
		a = sc.nextInt();
		
		int square = a*a;
		
		System.out.println("Square Of "+a+" Is : "+square);
	}
}
