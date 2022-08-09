package builidng;

/**
 * Abdifatah Abdi
 * This class shows Mall
 * 
 */

public class Mall extends Business {
	
	/**
	 * 
	 * variables
	 */
	protected int numRentedUnits;
	protected double medianUnitSize;
	protected int numParkingSpaces;
	
	/**
	 * 
	 * constructors 
	 */
	public Mall() {
		this.numRentableUnits=0;
		this.medianUnitSize=0;
		this.numParkingSpaces=0;
	}//end empty argument constructor 
	
	public Mall (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
            String subgroup, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentedUnits);
        this.medianUnitSize = medianUnitSize;
        this.numParkingSpaces = numParkingSpaces;
		
		
	}//end preferred constructor 
	
	/**
	 * 
	 * The method below will print what's drawn 
	 */
	
	public void draw() {
        System.out.println("Drawing code for " + this.getClass().getSimpleName());
    }
	
	
	
	/**
	 * 
	 * Returns the object in a String format
	 */
	
	public String displayData() {
        String str = "";
        str += super.toString() + "\nNumber of Rented Units: " + numRentedUnits + "\nMedian Unit Size: "
                + medianUnitSize + "\nNumber of Parking Spaces: " + numParkingSpaces;
        return str;
    }//end displayData
	
	
	
	/**
	 * setters and getters
	 *
	 */
	
	public int getNumRentedUnits() {
        return numRentedUnits;
    }//end getNumRentalUnits

    public void setNumRentedUnits(int numRentedUnits) {
        this.numRentedUnits = numRentedUnits;
    }//end setNumRentedUnits

    public double getMedianUnitSize() {
        return medianUnitSize;
    }//end getMedianUnitSize

    public void setMedianUnitSize(double medianUnitSize) {
        this.medianUnitSize = medianUnitSize;
    }//end setMedianUnitSize

    public int getNumParkingSpaces() {
        return numParkingSpaces;
    }//end getnumParkingSpace

    public void setNumParkingSpaces(int numParkingSpaces) {
        this.numParkingSpaces = numParkingSpaces;
    }//end setNumParkingSpace

}//end class
