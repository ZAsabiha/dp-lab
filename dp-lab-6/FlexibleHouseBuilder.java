class FlexibleHouseBuilder implements HouseBuilder {
    private House house;
    private String foundationType;
    private String wallType;
    private String roofType;
    private String doorWindowType;
    private String electricalType;
    private String interiorType;
    
     public FlexibleHouseBuilder(String foundation, 
                                String walls, 
                                String roof,
                                String doorsWindows, 
                                String electrical, 
                                String interior) {
     
        this.house = new House();
        
      
        this.foundationType = foundation;
        this.wallType = walls;
        this.roofType = roof;
        this.doorWindowType = doorsWindows;
        this.electricalType = electrical;
        this.interiorType = interior;
        
        System.out.println("✓ FlexibleHouseBuilder configured with custom specifications");
    }
    
    
    @Override
    public void buildFoundation() {
        house.setFoundation(this.foundationType);
        System.out.println("Building foundation: " + this.foundationType);
    }
    
    
    @Override
    public void buildWalls() {
        house.setWalls(this.wallType);
        System.out.println("Building walls: " + this.wallType);
    }
    
 
    @Override
    public void buildRoof() {
        house.setRoof(this.roofType);
        System.out.println("Building roof: " + this.roofType);
    }
    

    @Override
    public void buildDoorsAndWindows() {
        house.setDoorsAndWindows(this.doorWindowType);
        System.out.println("Installing doors & windows: " + this.doorWindowType);
    }
    

    @Override
    public void buildElectrical() {
        house.setElectrical(this.electricalType);
        System.out.println("Setting up electrical: " + this.electricalType);
    }
    

    @Override
    public void buildInterior() {
        house.setInterior(this.interiorType);
        System.out.println("Completing interior: " + this.interiorType);
    }
    
 
    @Override
    public House getHouse() {
        return this.house;
    }
}