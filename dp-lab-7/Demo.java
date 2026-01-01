public class Demo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(1);

        machine.insertCoin();
        machine.selectItem();
        machine.dispenseItem();

        machine.insertCoin(); 
    }
}
