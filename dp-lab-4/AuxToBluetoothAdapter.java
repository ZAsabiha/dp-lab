public class AuxToBluetoothAdapter implements BluetoothAudio {

    private AuxDevice device;

    public AuxToBluetoothAdapter(AuxDevice device) {
        this.device = device;
    }

    @Override
    public void receiveBluetoothAudio() {
        System.out.println("Adapter: Converting AUX audio to Bluetooth signal...");
        device.outputAuxAudio();
    }
}
