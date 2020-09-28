import java.util.Scanner;
public class mailMerge {
	
	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		
		String text1 = "Dear <first> <last>";
		String text2 = "Please confirm that your address is <house> <street>";
		String text3 = "Your answer is <yorn>";
		
		// Accept Data
		System.out.println("Enter <first>");
		String firstName = abc.next(); 	
		
		System.out.println("Enter <last>");
		String lastName = abc.next();
		
		System.out.println("Enter <house>");
		String house = abc.next();
		
		System.out.println("Enter <street>");
		String street = abc.next();
		
		System.out.println("Enter <yorn>");
		String answer = abc.next();
		abc.close();		
		 
		// Replace Data
		System.out.println(text1.replace("<first> <last>", firstName + lastName));
		System.out.println(text2.replace("<house> <street>", house +  street ));
		System.out.println(text3.replace("<yorn>", answer));
		
	}

}
