import java.util.ArrayList;
import java.util.Scanner;
public class TopCustomer {

	static int i = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean vari = false;
		

		ArrayList<String> customers = new ArrayList<String>();
		ArrayList<Double> price = new ArrayList<Double>();
		
		while(true) {
			
			System.out.println("Please enter spendings: ");
			double sales = input.nextDouble();
			
			if(sales == 0) {
				vari = true;
			}
			else {
				price.add(sales);
				System.out.println("Enter customer's name: ");
				String name = input.nextLine();
				customers.add(name);
				i++;
			}			
			
		}

		if (i>0) {
			
			TopCustomer cust = new TopCustomer();
			String customername = cust.nameOfBestCustomer(price, customers);
			System.out.println("The best customer is: " + 
			cust.nameOfBestCustomer(price, customers));
			

		}
	}

	public String nameOfBestCustomer(ArrayList<Double> price, ArrayList<String> customers) {
		
		double max = price.get(0);
		String top = " ";
		
		
		for (int i = 0; i< price.size(); i++);
		
		if (max <= price.get(i)) {
			
			top = customers.get(i);
		}
		
	}
	return cust;
}	
		