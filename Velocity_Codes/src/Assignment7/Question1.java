package Assignment7;

import java.util.Scanner;

class CheckSymbol{
	
	public void checkSymbol (int a) {
		
		 if (64<a&&a<91 ) {
			System.out.println("This Is A Capital Letter");
		}
		 else if (96<a&&a<123) {
			System.out.println("This Is A Small Letter");
		}
		 else if (47<a && a<58) {
			System.out.println("This Is An Number");
		}
		 else if (32<a&&a<48 || 57<a&&a<65 || 90<a&&a<97 ||122<a&&127<a) {
			System.out.println("It Is An Special Character");
		}
	}
}

public class Question1 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Your Character : ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.next().charAt(0);   //1    1234
		
		CheckSymbol s1 = new CheckSymbol();
		
		s1.checkSymbol(a);
		
	}

}
