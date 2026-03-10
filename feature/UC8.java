import java.util.HashMap;
import java.util.Map;
public class UC8 {

    private static final Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        renderBanner("OOPS");
    }

    // Initialize Map with character patterns
    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        patternMap.put('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        });

        patternMap.put('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        });
    }

    // Dedicated render function
    private static void renderBanner(String word) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}