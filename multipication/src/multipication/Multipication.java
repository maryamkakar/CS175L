package multipication;

public class Multipication {
	
	public static void main(String[] args) {
		
		for (int rows = 1; rows <= 10; rows++) {
			
			for (int columns = 1; columns <= 10; columns++) {
				
				int total = rows * columns;
				
				if (10 > total)
					System.out.print("  " + total + " ");
				
				else if (100 > total)
					System.out.print(" " + total + " ");
				
				else 
					System.out.println(total + " ");
			}
			System.out.println("");
		}
	}
}
