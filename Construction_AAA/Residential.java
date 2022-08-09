package builidng;

/**
 * Abdifatah Abdi
 * This class shows Residential
 * 
 */

public class Residential extends Building  {
	/**
	 * 
	 * variables
	 */
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	/**
	 * 
	 * constructors 
	 */
	
	public Residential () {
		super();
		this.numBathrooms=0;
		this.numBathrooms=0;
		this.laundryRoom=false;
		
		
		
	}//end empty argument constructor
	
	public Residential (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
            String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		
		/*
		String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
	        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	        
	        
	        this.numBedrooms = numBedrooms;
	        this.numBathrooms = numBathrooms;
	        this.laundryRoom = laundryRoom;
		*/
		
	}//end preferred constructor 
	
	/**
	 * 
	 * The method below will print what's drawn 
	 */
	
	public void draw() {
        System.out.println("Drawing code for " + this.getClass().getSimpleName());
    }
	
	/**
	 * setters and getters
	 *
	 */
	
		public void setNumBedrooms(int numBedrooms) {
	        this.numBedrooms = numBedrooms;
	    }//end setNumBedrooms

	    public int getNumBathrooms() {
	        return numBathrooms;
	    }//end getNumBathrooms

	    public void setNumBathrooms(int numBathrooms) {
	        this.numBathrooms = numBathrooms;
	    }//end setNumBathrooms

	    public boolean isLaundryRoom() {
	        return laundryRoom;
	    }//end boolean isLaundryRoom

	    public void setLaundryRoom(boolean laundryRoom) {
	        this.laundryRoom = laundryRoom;
	    }//end setLaundryRoom
	    
	    
	    /**
		 * 
		 * Returns the object in a String format
		 */

	    public String toString() {
	        return super.displayData() + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms
	                + "\nLaundry Room: " + ((laundryRoom == true) ? "Y" : "N");
	    
		
	}//end toString/displayData method
	
	
	

}//end class
