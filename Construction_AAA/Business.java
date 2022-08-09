package builidng;

/**
 * Abdifatah Abdi
 * This class shows Business
 * 
 */

public class Business extends Building {
	
	/**
	 * 
	 * variables
	 */
	protected int numRentableUnits;
	
	
	/**
	 * 
	 * constructors 
	 */
	
	public Business () {
		super();
		this.numRentableUnits=0;
		
		
	}//end empty argument
	
	
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
            String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
        this.numRentableUnits = numRentableUnits;
		
	}//end preferred constructor
	
	
	/**
	 * setters and getters
	 *
	 */
		 public int getNumRentableUnits() {
		        return numRentableUnits;
		    }//end getNumRentableUnits

		    public void setNumRentableUnits(int numRentableUnits) {
		        this.numRentableUnits = numRentableUnits;
		    }//end setNumRentableUnits
		    
		    
		    /**
			 * 
			 * Returns the object in a String format
			 */
		    public String toString() {
		        return super.displayData() + "\nNumber of Rentable Units: " + numRentableUnits;
		    
		
	}//end toString / displayData
	
	
	

}//end class
