class VendingMachine {
    private State noCoinState;
    private State coinInsertedState;
    private State outOfStockState;

    private State currentState;
    private int itemCount;

    public VendingMachine(int itemCount) {
        this.itemCount = itemCount;

        noCoinState = new NoCoinState(this);
        coinInsertedState = new CoinInsertedState(this);
        outOfStockState = new OutOfStockState(this);

        currentState = (itemCount > 0) ? noCoinState : outOfStockState;
    }

    public void setState(State state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectItem() {
        currentState.selectItem();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public int getItemCount() {
        return itemCount;
    }

    public void decreaseItem() {
        itemCount--;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getCoinInsertedState() {
        return coinInsertedState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }
}
