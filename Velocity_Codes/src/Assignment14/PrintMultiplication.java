package Assignment14;

public class PrintMultiplication {
	public static void main(String[] args) {
		
		for (int i = 2; i <=20; i++) {
			System.out.println("Table For "+i);
			for(int j = 1; j<=10;j++) {
					System.out.println(i+" X "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
	}
}
