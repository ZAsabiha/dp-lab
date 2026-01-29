class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) { super(device); }

    public void mute() {
        device.setVolume(0);
        System.out.println(device.getName() + " muted. volume: " + device.getVolume());
    }
}