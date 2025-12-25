class EcoFriendlyHouseBuilder implements HouseBuilder {
    private House house;
    
    public EcoFriendlyHouseBuilder() {
        this.house = new House();
    }
    
    @Override
    public void buildFoundation() {
        house.setFoundation("Eco-friendly foundation with recycled materials (15x15 meters)");
        System.out.println("Building eco-friendly foundation...");
    }
    
    @Override
    public void buildWalls() {
        house.setWalls("Sustainable bamboo and recycled brick walls with natural insulation");
        System.out.println("Building eco-friendly walls...");
    }
    
    @Override
    public void buildRoof() {
        house.setRoof("Green roof with vegetation and rainwater collection");
        System.out.println("Building eco-friendly roof...");
    }
    
    @Override
    public void buildDoorsAndWindows() {
        house.setDoorsAndWindows("Recycled wood doors and energy-efficient double-pane windows");
        System.out.println("Installing eco-friendly doors and windows...");
    }
    
    @Override
    public void buildElectrical() {
        house.setElectrical("Solar-powered electrical system with battery storage");
        System.out.println("Setting up renewable energy system...");
    }
    
    @Override
    public void buildInterior() {
        house.setInterior("Natural materials, eco-friendly paint, bamboo flooring");
        System.out.println("Completing sustainable interior design...");
    }
    
    @Override
    public House getHouse() {
        return this.house;
    }
}