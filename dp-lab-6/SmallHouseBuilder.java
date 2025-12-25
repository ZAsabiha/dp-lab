class SmallHouseBuilder implements HouseBuilder {
    private House house;
    
    public SmallHouseBuilder() {
        this.house = new House();
    }
    
    @Override
    public void buildFoundation() {
        house.setFoundation("Small concrete foundation (10x10 meters)");
        System.out.println("Building small house foundation...");
    }
    
    @Override
    public void buildWalls() {
        house.setWalls("Brick walls with standard insulation");
        System.out.println("Building small house walls...");
    }
    
    @Override
    public void buildRoof() {
        house.setRoof("Asphalt shingle roof");
        System.out.println("Building small house roof...");
    }
    
    @Override
    public void buildDoorsAndWindows() {
        house.setDoorsAndWindows("Standard wooden doors and single-pane windows");
        System.out.println("Installing doors and windows...");
    }
    
    @Override
    public void buildElectrical() {
        house.setElectrical("Basic electrical wiring (120V, 100A service)");
        System.out.println("Setting up electrical system...");
    }
    
    @Override
    public void buildInterior() {
        house.setInterior("Simple paint, laminate flooring, basic fixtures");
        System.out.println("Completing interior design...");
    }
    
    @Override
    public House getHouse() {
        return this.house;
    }
}