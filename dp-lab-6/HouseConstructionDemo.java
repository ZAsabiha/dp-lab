public class HouseConstructionDemo {
    public static void main(String[] args) {
    
        ConstructionEngineer engineer = new ConstructionEngineer();
        
      
        System.out.println("HOUSE CONSTRUCTION SYSTEM");
        System.out.println("Using Builder Design Pattern");
      
        
     
        System.out.println("\n[CLIENT REQUEST: Build a Small House]");
        HouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        engineer.setHouseBuilder(smallHouseBuilder);
        House smallHouse = engineer.constructHouse();
        smallHouse.showHouseDetails();
        
       
        System.out.println("\n[CLIENT REQUEST: Build a Luxury Villa]");
        HouseBuilder luxuryHouseBuilder = new LuxuryHouseBuilder();
        engineer.setHouseBuilder(luxuryHouseBuilder);
        House luxuryHouse = engineer.constructHouse();
        luxuryHouse.showHouseDetails();
        
 
        System.out.println("\n[CLIENT REQUEST: Build an Eco-Friendly Home]");
        HouseBuilder ecoHouseBuilder = new EcoFriendlyHouseBuilder();
        engineer.setHouseBuilder(ecoHouseBuilder);
        House ecoHouse = engineer.constructHouse();
        ecoHouse.showHouseDetails();
        
    
        System.out.println("\n[CLIENT REQUEST: Build only basic structure]");
        HouseBuilder partialBuilder = new SmallHouseBuilder();
        engineer.setHouseBuilder(partialBuilder);
        House partialHouse = engineer.constructBasicStructure();
        partialHouse.showHouseDetails();
    }
}