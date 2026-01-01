class NoCoinState implements State {
    private VendingMachine machine;

    public NoCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertCoin() {
        System.out.println("Coin inserted.");
        machine.setState(machine.getCoinInsertedState());
    }

    public void selectItem() {
        System.out.println("Insert coin first.");
    }

    public void dispenseItem() {
        System.out.println("No coin inserted.");
    }
}
