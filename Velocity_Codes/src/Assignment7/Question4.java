package Assignment7;

import java.util.Scanner;

class Reverse{
	
	public int getReverseNumber(int a) {
		
		int Number = a;   int reverse = 0;
		
		while (Number!=0) {
			int remainder = Number %10;
			reverse = reverse*10+remainder;
			Number = Number/10;
		}
		
		return reverse;
	}
}

public class Question4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Number : ");
		
		int a = sc.nextInt();
		
		
		Reverse r1 = new Reverse();
		
		int reverse=r1.getReverseNumber(a);
		
		System.out.println("Reverse Number Is : "+reverse);
	}

}
