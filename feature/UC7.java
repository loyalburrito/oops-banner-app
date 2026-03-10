public class UC7 {

    static class CharacterPatternMap {
        char c;
        String[] p;

        CharacterPatternMap(char c, String[] p) {
            this.c = c;
            this.p = p;
        }

        char getC() {
            return c;
        }

        String[] getP() {
            return p;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] m = new CharacterPatternMap[4];

        m[0] = new CharacterPatternMap('O', new String[]{
            "  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "
        });
        m[1] = new CharacterPatternMap('P', new String[]{
            " **** ", " * * ", " * * ", " **** ", " * ", " * ", " * "
        });
        m[2] = new CharacterPatternMap('S', new String[]{
            "  **** ", " * ", " * ", "  *** ", "      *", "      *", " **** "
        });
        m[3] = new CharacterPatternMap(' ', new String[]{
            "       ", "       ", "       ", "       ", "       ", "       ", "       "
        });

        return m;
    }

    public static String[] getCharacterPattern(char c, CharacterPatternMap[] m) {
        for (CharacterPatternMap x : m) {
            if (x.getC() == c) {
                return x.getP();
            }
        }
        return getCharacterPattern(' ', m);
    }

    public static void printMessage(String s, CharacterPatternMap[] m) {
        for (int i = 0; i < 7; i++) {
            StringBuilder b = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                b.append(getCharacterPattern(s.charAt(j), m)[i]).append("  ");
            }
            System.out.println(b.toString());
        }
    }

    public static void main(String[] a) {
        CharacterPatternMap[] m = createCharacterPatternMaps();
        printMessage("OOPS", m);
    }
}