package Assignment4;

import java.util.Scanner;

public class Question5 {
	
	public static void main(String[] args) {
		int a,b,c,d,e;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Five Subjects : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		int avarage = (a+b+c+d+e)/5;
		
		System.out.println("The Avarage Of The Number You Entered Is : "+avarage);
	}
}
