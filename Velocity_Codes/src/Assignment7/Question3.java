package Assignment7;

import java.util.Scanner;

class Calculation1{
	
	public void findFactors(int a) {
		
		System.out.println("Factors Of "+a+" Are :");
		
		for(int i = 1;i<=a;i++) {
			if (a%i==0) {
				System.out.println(i);
			}
		}

	}
}

public class Question3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number : ");
		
		int a = sc.nextInt();
		
		Calculation1 c2 = new Calculation1();
		
		c2.findFactors(a);
		
	}

}
