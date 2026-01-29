import java.util.*;

class GlyphFactory {
    private final Map<String, CharacterGlyph> cache = new HashMap<>();

    public CharacterGlyph getGlyph(char c, String fontFamily) {
        String key = c + "|" + fontFamily;


        if (!cache.containsKey(key)) {
            CharacterGlyph glyph = new CharacterGlyph(c, fontFamily);
            cache.put(key, glyph);
        }

        return cache.get(key);
    }

    public int cachedCount() {
        return cache.size();
    }
}
