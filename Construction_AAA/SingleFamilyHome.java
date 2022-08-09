package builidng;


/**
 * Abdifatah Abdi
 * This class is apartments
 * 
 */
public class SingleFamilyHome extends Residential{
	/**
	 * 
	 * variables
	 */
	private boolean garage;
	
	/**
	 * 
	 * constructors 
	 */
	public SingleFamilyHome () {
		super ();
		this.garage =false;
		
		
		
	}//end empty argument constructor
	
	
	public SingleFamilyHome (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
            String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
                laundryRoom);
        this.garage = garage;
		
		
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
        str += super.toString() + "\nGarage Available: " + ((garage == true) ? "Y" : "N");
        return str;
    }

    /**
   	 * setters and getters
   	 *
   	 */
    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }
	
	

}//end class
