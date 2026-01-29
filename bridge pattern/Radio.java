class Radio implements Device {
    private boolean on = false;
    private int volume = 5;

    public void powerOn() { on = true; System.out.println("Radio: ON"); }
    public void powerOff() { on = false; System.out.println("Radio: OFF"); }
    public void setVolume(int v) { volume = Math.max(0, Math.min(30, v)); }
    public int getVolume() { return volume; }
    public String getName() { return "Radio"; }
}