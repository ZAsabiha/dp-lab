public class BridgeDemo {
    public static void main(String[] args) {
        Device tv = new TV();
        Remote tvRemote = new AdvancedRemote(tv);

        tvRemote.togglePower(true);
        tvRemote.volumeUp();
        ((AdvancedRemote) tvRemote).mute();

        Device radio = new Radio();
        Remote radioRemote = new AdvancedRemote(radio);

        radioRemote.togglePower(true);
        radioRemote.volumeUp();
        radioRemote.volumeUp();


        
    }
}