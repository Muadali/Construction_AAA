package builidng;

/**
 * Abdifatah Abdi
 * This class is apartments
 * 
 */

public class Apartment extends Residential {
	
	
	/**
	 * 
	 * variables
	 */
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	/**
	 * 
	 * constructors 
	 */
	
	public Apartment () {
		this.numRentableUnits=0;
		this.avgUnitSize=0;
		this.parkingAvailable=false;
		
		
		
	}//end empty argument constructor
	
	public Apartment (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
            String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits,
            double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
                laundryRoom);
        this.numRentableUnits = numRentableUnits;
        this.avgUnitSize = avgUnitSize;
        this.parkingAvailable = parkingAvailable;
		
		
		
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
        str += super.toString() + "\nNumber of Rentable Units: " + numRentableUnits + "\nAverage Unit Size: "
                + avgUnitSize + "\nParking Available: " + ((parkingAvailable == true) ? "Y" : "N");
        return str;
    }

    
    
    /**
	 * setters and getters
	 *
	 */
    public int getNumRentableUnits() {
        return numRentableUnits;
    }

    public void setNumRentableUnits(int numRentableUnits) {
        this.numRentableUnits = numRentableUnits;
    }

    public double getAvgUnitSize() {
        return avgUnitSize;
    }
    
    public void setAvgUnitSize(double avgUnitSize) {
        this.avgUnitSize = avgUnitSize;
    }

    public boolean isParkingAvailable() {
        return parkingAvailable;
    }

    public void setParkingAvailable(boolean parkingAvailable) {
        this.parkingAvailable = parkingAvailable;
    }
	
	
	

}
