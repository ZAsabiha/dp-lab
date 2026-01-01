class CoinInsertedState implements State {
    private VendingMachine machine;

    public CoinInsertedState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    public void selectItem() {
        System.out.println("Item selected.");
    }

    public void dispenseItem() {
        if (machine.getItemCount() > 0) {
            System.out.println("Dispensing item...");
            machine.decreaseItem();

            if (machine.getItemCount() == 0) {
                machine.setState(machine.getOutOfStockState());
            } else {
                machine.setState(machine.getNoCoinState());
            }
        }
    }
}
