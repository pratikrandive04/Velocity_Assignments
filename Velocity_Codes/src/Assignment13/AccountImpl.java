package Assignment13;

import java.util.Scanner;

interface Account {
	
	public void getSavingAccount();

	public void getUserDetails(String name, float balance);
	
}
		
public class AccountImpl implements Account {

	@Override
	public void getSavingAccount() {
		String name; // for storing user name
		float balance;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name Of Account Holder >> ");
		name = sc.next();
		
		System.out.println("Enter Balance Of The Account Holder >> ");
		balance = sc.nextFloat();
		
		getUserDetails(name, balance);
	}

	@Override
	public void getUserDetails(String name, float balance) {
		
		System.out.println("Account User Name is >> "+name);
		System.out.println("Account Balance is >> "+balance);
		
	}
	
	public static void main(String[] args) {
		
		AccountImpl ai = new AccountImpl();
		
		ai.getSavingAccount();
		
	}
			
}
