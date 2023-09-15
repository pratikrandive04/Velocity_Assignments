package Assignment6;

import java.util.Scanner;

public class Question4 {
	
	int calculateFactorial(int a) {
		
		int factorial = 1;       //a=4
		
		for (int i = a; i >0; i--) {
			factorial = factorial*i;         //1*4=4      4*3=12      12*2=24     24*1=24     
		}
		
		return factorial;
	}
	
	public static void main(String[] args) {
		
		int b;
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter Your Number : ");
		
		b = s1.nextInt();
		
		Question4  q1 = new Question4();
		
		int result = q1.calculateFactorial(b);
		
		System.out.println("Factorial of "+b+" Is : "+result);
		
	}
}
