
public class BankAccountTester {

	public static void main(String[] args) {
		
		BankAccount myBankAccount = new BankAccount(1000);//invoked BankAccount code lines 12-15
		
		myBankAccount.withdraw(500);//runs BankAccount code lines 31-34
		
		myBankAccount.deposit(1500);//runs BankAccount code lines 21-24
			
		System.out.println(myBankAccount.getBalance());//runs BankAccount code lines 39-42
				
		
	}

}
