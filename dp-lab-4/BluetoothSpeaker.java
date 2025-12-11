public class BluetoothSpeaker {
    private BluetoothAudio audioInput;

    public BluetoothSpeaker(BluetoothAudio audioInput) {
        this.audioInput = audioInput;
    }

    public void playMusic() {
        System.out.println("Bluetooth Speaker: Ready to receive audio...");
        audioInput.receiveBluetoothAudio();
        System.out.println("Bluetooth Speaker: Playing music wirelessly!");
    }
}
