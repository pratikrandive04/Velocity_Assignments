package Assignment3;

public class Question1 {
	
	String getStudentName(String name) {
		return name;
	}
	
	public static void main(String[] args) {
		
		Question1 q1 = new Question1();
		
		String return_name = q1.getStudentName("Pratik");
		
		System.out.println(return_name);
		
	}
}
