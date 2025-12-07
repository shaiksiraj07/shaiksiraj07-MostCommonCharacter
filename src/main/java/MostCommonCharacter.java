import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException("String cannot be null or empty");

        Map<Character, Integer> freq = new HashMap<>();
        char maxChar = str.charAt(0);
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            if (freq.get(c) > maxCount) {
                maxCount = freq.get(c);
                maxChar = c;
            }
        }
        return maxChar;
    }
}
