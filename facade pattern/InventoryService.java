class InventoryService {
    public boolean isInStock(String itemId) {
        System.out.println("Inventory: checking stock for " + itemId);
        return true; 
    }
    public void reserve(String itemId) {
        System.out.println("Inventory: reserved " + itemId);
    }
}