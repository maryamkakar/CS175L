import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount to start your account: ");
		double newAmt = input.nextDouble();
		
		System.out.println("Enter Percentage of Interest: ");
		double interest = input.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(newAmt, interest);
		
		System.out.println("Enter Deposit Amount: ");
		double Deposit = input.nextDouble();
		myBankAccount.deposit(Deposit);
		
		System.out.println("Enter Withdraw Amount: ");
		double Withdraw = input.nextDouble();
		myBankAccount.withdraw(Withdraw);
		
		myBankAccount.calcInterest();
		
		System.out.println("Your Bank Account Balance is: " +myBankAccount.getBalance());
		
		
		
			}
}
		
		
		
		

