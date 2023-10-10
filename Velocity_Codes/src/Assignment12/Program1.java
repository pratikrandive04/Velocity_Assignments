package Assignment12;

import java.util.Scanner;

class Account{
	
	int accountNumber;
	String accountName;
	
	//getting input from user
	public void getAccountDetails() {
			
			System.out.println("Enter The Account Number >> ");
			Scanner sc = new Scanner(System.in);
			
			accountNumber = sc.nextInt();
			
			System.out.println("Enter Account Holder Name >> ");
			accountName = sc.next();
			
			getAccountInformation(accountNumber,accountName);
			
	}
	
	//printing the account details
	private void getAccountInformation(int accountNumber, String accountName) {
		
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account  Holder Name : "+accountName);
		
	}
	
}

class SavingAccount extends Account{
	
	String accountType = "Savings Account";
	long balance;
	
	// getting input from user
	public void getSavingsAccountDetails() {
		
		System.out.println("Total Balance is >> ");
		Scanner sc = new Scanner(System.in);
		
		balance = sc.nextInt();
		
		getSavingAccountInformation(balance);
		
	}
	
	// printing the saving account details
	private void getSavingAccountInformation(long balance) {
		System.out.println("Account Type : "+accountType);
		System.out.println("Balance Is : "+balance);
	}
	
}

public class Program1 {
	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();
		sa.getAccountDetails();
		sa.getSavingsAccountDetails();
		
	}
}
