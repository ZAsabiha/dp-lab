class LuxuryHouseBuilder implements HouseBuilder {
    private House house;
    
    public LuxuryHouseBuilder() {
        this.house = new House();
    }
    
    @Override
    public void buildFoundation() {
        house.setFoundation("Reinforced concrete foundation with basement (25x25 meters)");
        System.out.println("Building luxury house foundation with basement...");
    }
    
    @Override
    public void buildWalls() {
        house.setWalls("Double-brick walls with premium insulation and soundproofing");
        System.out.println("Building luxury house walls...");
    }
    
    @Override
    public void buildRoof() {
        house.setRoof("Clay tile roof with solar panels");
        System.out.println("Building luxury house roof...");
    }
    
    @Override
    public void buildDoorsAndWindows() {
        house.setDoorsAndWindows("Mahogany doors and triple-pane energy-efficient windows");
        System.out.println("Installing premium doors and windows...");
    }
    
    @Override
    public void buildElectrical() {
        house.setElectrical("Smart home electrical system (240V, 400A service) with automation");
        System.out.println("Setting up advanced electrical system...");
    }
    
    @Override
    public void buildInterior() {
        house.setInterior("Marble flooring, designer paint, chandeliers, luxury fixtures");
        System.out.println("Completing luxury interior design...");
    }
    
    @Override
    public House getHouse() {
        return this.house;
    }
}