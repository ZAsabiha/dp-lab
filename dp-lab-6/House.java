class House {
    private String foundation;
    private String walls;
    private String roof;
    private String doorsAndWindows;
    private String electrical;
    private String interior;
    
   
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }
    
    public void setWalls(String walls) {
        this.walls = walls;
    }
    
    public void setRoof(String roof) {
        this.roof = roof;
    }
    
    public void setDoorsAndWindows(String doorsAndWindows) {
        this.doorsAndWindows = doorsAndWindows;
    }
    
    public void setElectrical(String electrical) {
        this.electrical = electrical;
    }
    
    public void setInterior(String interior) {
        this.interior = interior;
    }
  
    public void showHouseDetails() {
        System.out.println("\n========== HOUSE DETAILS ==========");
        System.out.println("Foundation: " + foundation);
        System.out.println("Walls: " + walls);
        System.out.println("Roof: " + roof);
        System.out.println("Doors & Windows: " + doorsAndWindows);
        System.out.println("Electrical: " + electrical);
        System.out.println("Interior: " + interior);
        System.out.println("===================================\n");
    }
}