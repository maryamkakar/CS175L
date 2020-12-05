import java.util.Scanner;
public class CardNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the credit card number you would like to verify or -99 to end: ");
		Scanner input = new Scanner(System.in);

		while (input.hasNextLine()) {
			String creditCardNumber = input.nextLine();
			
			if (creditCardNumber.equals("-99")) {
				System.out.println("goodbye");
				break;
			}
			
		int i = 0;
		while (i < creditCardNumber.length()) {
			char character = creditCardNumber.charAt(i);
			if (character == ' ' || character == '-') {
				
				String before = creditCardNumber.substring(0, i);
				String after = creditCardNumber.substring(i +1);
				creditCardNumber = before + after;
			}
			else {
				i++;
			}
		}
		System.out.println(creditCardNumber);
		System.out.println("Enter the credit card number you would like to verify or -99 to end: ");
		}
	}
}
