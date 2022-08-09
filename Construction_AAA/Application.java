package builidng;

public class Application {
	
	public static void main(String[] args) {
        Building b1 = new Building("Gaines House", "123 Main Street | Louisiville, Kentucky, 401010", 2540, "Residential",
                "R1");
        Business bu1 = new Business("Gaines Business", "123 Main Street | Louisiville, Kentucky, 401010", 1890, "Business", "B1",
                12);
        Apartment A1 = new Apartment("Gaines House", "123 Main Street | Louisiville, Kentucky, 401010", 2540,
                "Apartments", "A1", 40, 80, true, 36, 680, true);
        SingleFamilyHome R1 = new SingleFamilyHome("Gaines House",
                "121 Main Street | Louisiville, Kentucky, 40201", 2540, "Residenttial", "R1", 4, 3, true, true);
        Mall M1 = new Mall ("Gaines House", "123 Main Street | Louisiville, Kentucky, 401010", 2540, "Residential",
                "M1", 9, 4, 10); 
        Residential R2 = new Residential ("Gaines House",
                "121 Main Street | Louisiville, Kentucky, 40201", 2450, "Residenttial", "R2", 4, 3, true);

        
        // These will print the objects
        System.out.println("____________Building Details___________\n" + b1.displayData()+"\n");

        System.out.println("____________Business Details___________\n" + bu1.toString()+"\n");

        System.out.println("____________Apartment Details___________\n" + A1.displayData()+"\n");

        System.out.println("____________singleFamilyHome Details___________\n" + R1.displayData()+"\n");
        System.out.println("____________Residential Details___________\n" + R1.displayData()+"\n");
        System.out.println("____________Mall Details___________\n" + M1.displayData()+"\n");
    }
	

}
