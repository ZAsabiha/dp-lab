class ConstructionEngineer {
    private HouseBuilder houseBuilder;
    
    public void setHouseBuilder(HouseBuilder builder) {
        this.houseBuilder = builder;
    }
    
    public House constructHouse() {
        System.out.println("\n*** Construction Engineer starting the building process ***\n");
        houseBuilder.buildFoundation();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildDoorsAndWindows();
        houseBuilder.buildElectrical();
        houseBuilder.buildInterior();
        System.out.println("\n*** House construction completed! ***");
        return houseBuilder.getHouse();
    }
    
  
    public House constructBasicStructure() {
        System.out.println("\n*** Building basic structure only ***\n");
        houseBuilder.buildFoundation();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        return houseBuilder.getHouse();
    }
}
