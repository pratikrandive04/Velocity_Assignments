package Assignment5;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Year : ");
		
		a = sc.nextInt();
		
		if (a%4==0 ) {
			System.out.println("The Year "+a+" Is An Leap Year");
	    	}
		else if (a%100 ==0) {
				System.out.println("The Year "+a+" Is An Leap Year");
			}
		else if (a%400 ==0) {
					System.out.println("The Year "+a+" Is An Leap Year");
			}
		else {
			System.out.println("The Year "+a+" Is An Non Leap Year");
		   }
	}
}
