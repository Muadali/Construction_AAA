package builidng;

public class Building {
	
		protected String projectName;
		protected String completeAddress;
		protected double totalSqaureFeet;
		protected String occupancyGroup;
		protected String subgroup;
		
		
		
		public Building () {
			
			this.projectName="";
			this.completeAddress="";
			this.totalSqaureFeet=0;
			this.occupancyGroup="";
			this.subgroup="";
			
			
		}//end empty-argument
		
		public Building(String projectName, String completeAddress, String occupancyGroup, String subgroup,
				String totalSquareFeet) {
			
			this.projectName="Gaines House";
			this.completeAddress="123 Main Street, Louisville, Kentucky 40201";
			this.totalSqaureFeet= 2450;
			this.occupancyGroup="Business, Educational, Factory/Industrial, High Hazard, Institutional,"
					+ " Mercantile, Residential,Storage, Utility/Miscellaneous";
			this.subgroup="Groups A-1, A-2, A-3, A-4, & A-5, Group B, Group E, Groups F-1 & F-2, "
					+ "Groups H-1, H-2, H-3, H-4, & H-5, Groups I-1, I-2, I-3, & I-4, Group M, Groups R-1, R-2, R-3, & R-4"
					+ "Groups S-1 & S-2, Group U ";
			
			
		}//end preferred constructor 
		
		public void draw() {
			
		}//end void draw
		
		
		public String displayData() {
			String building = "";
			building += "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSqaureFeet
			+ "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup;
			return building;
			
		}
		
		

	}//end class


