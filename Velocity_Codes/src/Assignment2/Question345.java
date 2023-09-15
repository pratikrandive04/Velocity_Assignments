package Assignment2;

public class Question345 {
	
	 int y = 25;
	
	 public static void main(String[] args) {
		
		 int x = 50;
		 
		 System.out.println("This Is Local Variable X : "+x);
		 
		 Question345 q1 = new Question345();                                // creating the object for accessing the global variable 
		 
		 System.out.println("This Is Global Variable Y : "+q1.y);
	}
}
