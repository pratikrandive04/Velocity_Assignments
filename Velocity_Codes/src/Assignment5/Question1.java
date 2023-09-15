package Assignment5;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number To Check : ");
		
		a = sc.nextInt();
		
		//logic for negative number
		if (a<0) {
			System.out.println("The Number "+a+" Is A Negative Number");
		}
		
		//logic for zero
		else if (a==0) {
			System.out.println("The Number "+a+" Is A Nor Negative Nor Positive Number");
		}
		
		//condition for positive number
		else {
			System.out.println("The Number "+a+" Is A Positive Number");
		}
	}
}
