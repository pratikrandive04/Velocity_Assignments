package Assignment8;

class Employee{
	String fristName;
	String lastName;
	String city;
	int mobileNumber;
	String country;
}

class EmployeeInformation extends Employee{
	
	public void getUserInput(String fname, String lname,String City,int phone,String Country) {
		fristName = fname;
		lastName = lname;
		city = City;
		mobileNumber = phone;
		country = Country;
	}
	
	public void getEmployeeInformation() {
		System.out.println("First Name : "+fristName);
		System.out.println("Last Name : "+lastName);
		System.out.println("City : "+city);
		System.out.println("Mobile Number : "+mobileNumber);
		System.out.println("Country : "+country);
	}
}

public class Question1234 {
	public static void main(String[] args) {
		
		EmployeeInformation e1 = new EmployeeInformation();
		
		e1.getUserInput("Pratik", "Randive", "Baramati", 1458236149, "India");
		
		e1.getEmployeeInformation();
		
		System.out.println();
		
		EmployeeInformation e2 = new EmployeeInformation();
		
		e2.getUserInput("Sunil", "Jadhav", "Baramati", 1458236149, "India");
		
		e2.getEmployeeInformation();
		
	}
}
