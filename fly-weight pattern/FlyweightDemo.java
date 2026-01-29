public class FlyweightDemo {
    public static void main(String[] args) {
        GlyphFactory factory = new GlyphFactory();

        String text = "HELLO HELLO";
        int x = 0;

        for (char c : text.toCharArray()) {
            CharacterGlyph glyph = factory.getGlyph(c, "Arial"); 
            glyph.draw(x, 0, 12, "Black");                     
            x += 10;
        }

        System.out.println("Unique glyph objects cached: " + factory.cachedCount());
    }
}
