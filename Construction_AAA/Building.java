package builidng;
/**
 * Abdifatah Abdi
 * This class shows Building 
 * 
 */
public class Building {
	
	/**
	 * 
	 * variables
	 */
	    protected String projectName;
	    protected String completeAddress;
	    protected double totalSquareFeet;
	    protected String occupancyGroup;
	    protected String subgroup;

	    
	    public Building() {
	        projectName = "";
	        completeAddress = "";
	        totalSquareFeet = 0.0;
	        occupancyGroup = "";
	        subgroup = "";
	    }//End default constructor 

	    
	    public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	            String subgroup) {
	        this.projectName = projectName;
	        this.completeAddress = completeAddress;
	        this.totalSquareFeet = totalSquareFeet;
	        this.occupancyGroup = occupancyGroup;
	        this.subgroup = subgroup;
	    }//end preferred constructor

	    
	    /**
		 * 
		 * The method below will print what's drawn 
		 */
	    public void draw() {
	        System.out.println("Drawing code for " + this.getClass().getSimpleName());
	    }//end draw method 

	    /**
		 * 
		 * Returns the object in a String format
		 */
	    public String displayData() {
	        String str = "";
	        str += "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet
	                + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup;
	        return str;
	    }//end Display method

	    
	    /**
		 * setters and getters
		 *
		 */
	    public String getProjectName() {
	        return projectName;
	    }//end getProjectName

	    public void setProjectName(String projectName) {
	        this.projectName = projectName;
	    }//end setProjectName


	    public String getCompleteAddress() {
	    		return completeAddress;
	    }//end getCompleteAddress

	    public void setCompleteAddress(String completeAddress) {
	    		this.completeAddress = completeAddress;
	    }//end setCompleteAddress

	    public double getTotalSquareFeet() {
	    		return totalSquareFeet;
	    }//end getTotalSquareFeet

	    public void setTotalSquareFeet(double totalSquareFeet) {
	    		this.totalSquareFeet = totalSquareFeet;
	    }//end setTotalSquareFeet

	    public String getOccupancyGroup() {
	    		return occupancyGroup;
	    }//end getOccupancyGroup

	    public void setOccupancyGroup(String occupancyGroup) {
	    		this.occupancyGroup = occupancyGroup;
	    }//end setOccupancyGroup

	    public String getSubgroup() {
	    		return subgroup;
	    }//end getSubGroup

	    public void setSubgroup(String subgroup) {
	    		this.subgroup = subgroup;
	    }//end setSubGroup
	    
}//end class
