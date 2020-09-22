import java.util.Scanner;
public class Housepainting {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		
		//Accept building width
		System.out.println("Enter Width");
		int houseWidth = abc.nextInt();
		
		//Accept building height
		System.out.println("Enter Length");
		int houseLength = abc.nextInt();
		
		System.out.println("Enter Height");
		int houseHeight = abc.nextInt();
		
		System.out.println("Enter #Windows");
		int numberWindows = abc.nextInt();
		
		System.out.println("Enter Length of Window");
		int lengthWindow = abc.nextInt();
		
		System.out.println("Enter Width of Window");
		int widthWindow = abc.nextInt();
		
		System.out.println("Enter #Doors");
		int numberDoors = abc.nextInt();
		
		System.out.println("Enter Length of Doors");
		int lengthDoors = abc.nextInt();
		
		System.out.println("Enter Width of Doors");
		int widthDoors = abc.nextInt();
		
		System.out.println("Enter Cost To Paint");
		int CostToPaint = abc.nextInt();
		abc.close();
		
		// Compute 
		int sqft = ((houseWidth*houseLength)*2);
		System.out.println("The square footage of the normal side is "+sqft);
		
		int SqFt = (int) ((houseLength*houseWidth + .5*(houseLength*(houseHeight-houseWidth)))*2);
		System.out.println("The square footage of the peak side is "+SqFt);
		
		int Sqft = (int) (((houseLength*houseWidth)*2) + ((houseLength*houseWidth + .5*(houseLength*(houseHeight-houseWidth)))*2) - ((lengthWindow*widthWindow)*numberWindows) - ((lengthDoors*widthDoors)*numberDoors));
		System.out.println("The square footage to paint is "+Sqft);
		
		int SQFT = (int) (((houseLength*houseWidth)*2) + ((houseLength*houseWidth + .5*(houseLength*(houseHeight-houseWidth)))*2) - ((lengthWindow*widthWindow)*numberWindows) - ((lengthDoors*widthDoors)*numberDoors)) * CostToPaint;

		System.out.println("The Cost to paint the house is "+SQFT);
	}
	
}
