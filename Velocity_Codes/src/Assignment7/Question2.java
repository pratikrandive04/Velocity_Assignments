package Assignment7;

import java.util.Scanner;

class Calculation{
	public int getNumberCube(int a) {
		return a*a*a;
	}
}

public class Question2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number : ");
		
		int a = sc.nextInt();
		
		Calculation c1 = new Calculation();
		
		int cube = c1.getNumberCube(a);
		
		System.out.println("Cube Of The Number "+a+" Is : "+cube);
		
	}
}
