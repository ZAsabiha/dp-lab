class CharacterGlyph { 
    private final char symbol;       
    private final String fontFamily;  

    public CharacterGlyph(char symbol, String fontFamily) {
        this.symbol = symbol;
        this.fontFamily = fontFamily;
    }

   
    public void draw(int x, int y, int size, String color) {
        System.out.printf("Draw '%c' font=%s at (%d,%d), size=%d, color=%s%n",
                symbol, fontFamily, x, y, size, color);
    }
}