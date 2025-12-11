public class Main {
    public static void main(String[] args) {

        AuxDevice mp3 = new MP3Player();
        AuxDevice cd = new CDPlayer();
      

        BluetoothAudio mp3Adapter = new AuxToBluetoothAdapter(mp3);
        BluetoothAudio cdAdapter = new AuxToBluetoothAdapter(cd);
        

        BluetoothSpeaker speaker = new BluetoothSpeaker(mp3Adapter);
        speaker.playMusic();

       

        speaker = new BluetoothSpeaker(cdAdapter);
        speaker.playMusic();

        

        
    }
}
