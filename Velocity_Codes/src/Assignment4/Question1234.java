package Assignment4;

import java.util.Scanner;

public class Question1234 {
	
	int addition(int a,int b) {
		
		int sum = a+b;
		
		return sum;
	}
	
	int substraction(int a,int b) {
		
		int result = a-b;
		
		return result;
	}
	
	int multiplication(int a,int b) {
		
		int result = a*b;
		
		return result;
	}
	
	int division(int a,int b) {
		
		int result = a/b;
		
		return result;
	}
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Your Numbers For All Results :");
			
			int p = sc.nextInt();
			
			int q = sc.nextInt();
			
			Question1234 q1 = new Question1234();
			
			int addition_result = q1.addition(p, q);
			int substraction_result = q1.substraction(p, q);
			int multiplication_result = q1.multiplication(p, q);
			int division_result = q1.division(p, q);
			
			
			System.out.println("The Addition Of "+p+" And "+q+" Is : "+ addition_result);
			System.out.println("The Substraction Of "+p+" And "+q+" Is : "+ substraction_result);
			System.out.println("The Multiplication Of "+p+" And "+q+" Is : "+ multiplication_result);
			System.out.println("The Division Of "+p+" And "+q+" Is : "+ division_result);
			
		}
}
