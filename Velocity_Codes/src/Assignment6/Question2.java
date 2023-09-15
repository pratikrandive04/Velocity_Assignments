package Assignment6;

import java.util.Scanner;

public class Question2 {
	
	void doMultiplication(int a) {
		for (int i = 1; i <=10; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
	public static void main(String[] args) {
		
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Number : ");
		
		b = sc.nextInt();
		
		Question2 q1 = new Question2();
		
		q1.doMultiplication(b);
		
	}
}
