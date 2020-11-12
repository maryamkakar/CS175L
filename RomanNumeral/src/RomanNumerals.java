import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to convert: ");
		int number = input.nextInt();
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
				
		//print statement to input a valid number
		if (number > 3999) {
			System.out.println("Number not accepted, please choose a number under 3999");
		}
	
		//evaluating roman numerals as a string
		
		String i[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		
		String x[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		
		String c[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		
		String[] m = {"M", "MM", "MMM"};
		
		if (number >= 1000) {
			num1 = number/1000;
			if (num1 == 1) {
				System.out.print("M");
			}
			if (num1 == 2) {
				System.out.print("MM");
			}
			if (num1 == 3) {
				System.out.print("MMM");
			}
		}
		if (number >= 100) {
			num2 = number%1000/100;
			if (num2 == 1) {
				System.out.print("C");
			}
			if (num2 == 2) {
				System.out.print("CC");
			}
			if (num2 == 3) {
				System.out.print("CCC");
			}
			if (num2 == 4) {
				System.out.print("CD");
			}
			if (num2 == 5) {
				System.out.print("D");
			}
			if (num2 == 6) {
				System.out.print("DC");
			}
			if (num2 == 7) {
				System.out.print("DCC");
			}	
			if (num2 == 8) {
				System.out.print("DCCC");
			}	
			if (num2 == 9) {
				System.out.print("CM");
			}	
		}
		if (number >= 10) {
			num3 = number%100/10;
			if (num3 == 1) {
				System.out.print("X");
			}
			if (num3 == 2) {
				System.out.print("XX");
			}
			if (num3 == 3) {
				System.out.print("XXX");
			}
			if (num3 == 4) {
				System.out.print("XL");
			}
			if (num3 == 5) {
				System.out.print("L");
			}
			if (num3 == 6) {
				System.out.print("LX");
			}
			if (num3 == 7) {
				System.out.print("LXX");
			}
			if (num3 == 8) {
				System.out.print("LXXX");
			}
			if (num3 == 9) {
				System.out.print("XC");
			}
		}
		if (number >= 1) {
			num4 = number%10;
			if (num4 == 1) {
				System.out.print("I");
			}
			if (num4 == 2) {
				System.out.print("II");
			}
			if (num4 == 3) {
				System.out.print("III");
			}
			if (num4 == 4) {
				System.out.print("IV");
			}
			if (num4 == 5) {
				System.out.print("V");
			}
			if (num4 == 6) {
				System.out.print("VI");
			}
			if (num4 == 7) {
				System.out.print("VII");
			}
			if (num4 == 8) {
				System.out.print("VIII");
			}
			if (num4 == 9) {
				System.out.print("IX");
			}
			
			
		}
	}
}
				
		
	
		
	
	

