package Assignment5;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Numbers : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Before Swaping Number Are : A = "+a+" B = "+b);
		
		int x = a;
		a = b;
		b = x;
		
		System.out.println("After Swaping Number Are : A = "+a+" B = "+b);
	}
}
