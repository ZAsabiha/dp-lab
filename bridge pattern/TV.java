class TV implements Device {
    private boolean on = false;
    private int volume = 10;

    public void powerOn() { on = true; System.out.println("TV: ON"); }
    public void powerOff() { on = false; System.out.println("TV: OFF"); }
    public void setVolume(int v) { volume = Math.max(0, Math.min(100, v)); }
    public int getVolume() { return volume; }
    public String getName() { return "TV"; }
}