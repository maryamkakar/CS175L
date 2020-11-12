import java.text.ParseException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AgeCalculation {
	
	public static void main(String[] args) {
	}
	private static void calculateAge() {
		
		int years = 0;
		int months = 0;
		int days = 0;
		Scanner input = new Scanner(System.in);

		
	   String birthDate = JOptionPane.showInputDialog("Please enter date of birth (MM/DD/YYYY: ");
	   int birthYear = 2000;
	   int birthMonth = 03;
	   int birthDay = 26;
	   String birthdate = "March 26, 2000";
	   birthdate = birthdate.substring(0);
	   long dateOfBirth = Long.parseLong(birthDate);
	   
	   String currentDate = JOptionPane.showInputDialog("Please enter the current date (MM/DD/YYYY): ");
	   int currentYear = 2020;
	   int currentMonth = 10;
	   int currentDay = 29;
	   String currentdate = "October 29, 2020";
	   currentdate = currentdate.substring(0);
	   long today = Long.parseLong(currentDate);
	 
	 //calculates the difference in years
	 years = (currentYear - birthYear);
	 
	 //calculates difference in months 
	 months = (currentMonth - birthMonth);
	 
	 //if the difference in months is negative then subtract one from years
	 if (months < 0) {
		 years--;
		 months = 12 - birthMonth + currentMonth;	 
		 }
	 //calculate the difference in days
	 if (currentDay > birthDay) {
		 days = currentDay - birthDay;
	 }else
		days = birthDay - currentDay;
		 
		System.out.println("You are " + years + " years, " + months +" months, and " + days +" days old");

	}
	
	

	}



		 

	
