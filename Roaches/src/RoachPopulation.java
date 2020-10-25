
public class RoachPopulation {

	private double numberOfRoaches;
	
	/**
	 * Takes in the size of initial population
	 */
	public RoachPopulation(int size) {
		numberOfRoaches = size;
	}
	/**
	 * Helps calculate how fast the roaches breed
	 */
	public void breed() {
		
		numberOfRoaches = numberOfRoaches * 2;
	}
	/**
	 * Helps calculate the reduction of the population
	 */
	public void spray(double percent) {
		
		double percentage = numberOfRoaches * percent;
		numberOfRoaches = numberOfRoaches - percentage;
		
		
	}
	/**
	 * Gets the current population of the roaches
	 */
	public double getRoaches() {
		return numberOfRoaches;
	}
	
}
