import java.util.Scanner;
public class BankThreshold {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter amount to start your account: ");
			double newAmt = input.nextDouble();
			
			System.out.println("Enter Percentage of Interest: ");
			double interest = input.nextDouble();
			
			BankAccount myBankAccount = new BankAccount(newAmt, interest);
			
			System.out.println("Enter a threshold: ");
			while (input.hasNextDouble())
			{int months = 0;
				double numb = input.nextDouble();
				//System.out.println(numb);
				while (myBankAccount.getBalance() < numb)
				{myBankAccount.calcInterest();
					months++;
				}
				System.out.println("It will take " +months +" months to reach this threshold");
				
				System.out.println("Enter another threshold: ");
			} 
			
			
			
			System.out.println("Your Bank Account Balance is: " +myBankAccount.getBalance());
			
			
			
				}


	}

			
			
			
			



