package Assignment5;

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter Three Numbers : ");
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a>b) {
			if (a>c) {
				System.out.println("Maximum Number Is : "+a);
			}
			else {
				System.out.println("Maximum Number Is : "+c);
			}
		}
		
		if (b>a) {
			if (b>c) {
				System.out.println("Maximum Number Is : "+b);
			}
			else {
				System.out.println("Maximum Number Is : "+c);
			}
		}
	}
}
