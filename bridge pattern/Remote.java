abstract class Remote {
    protected final Device device; 
    protected Remote(Device device) { this.device = device; }

    public void togglePower(boolean on) {
        if (on) device.powerOn();
        else device.powerOff();
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
        System.out.println(device.getName() + " volume: " + device.getVolume());
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
        System.out.println(device.getName() + " volume: " + device.getVolume());
    }

}