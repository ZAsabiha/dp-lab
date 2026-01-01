class OutOfStockState implements State {
    private VendingMachine machine;

    public OutOfStockState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertCoin() {
        System.out.println("Machine is out of stock.");
    }

    public void selectItem() {
        System.out.println("No items available.");
    }

    public void dispenseItem() {
        System.out.println("Cannot dispense.");
    }
}
