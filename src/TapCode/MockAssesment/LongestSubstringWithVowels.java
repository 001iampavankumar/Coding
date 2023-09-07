package TapCode.MockAssesment;
public class LongestSubstringWithVowels {
    public static String longestSubstringWithVowels(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String longestSubstring = "";
        int currentStart = 0;
        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (isVowel(c)) {
                vowelCount++;
                if (vowelCount > 2) {
                    if (i - currentStart + 1 > longestSubstring.length()) {
                        longestSubstring = input.substring(currentStart, i + 1);
                    }
                }
            } else {
                vowelCount = 0;
                currentStart = i + 1;
            }
        }

        return longestSubstring;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String inputString = "aardvarkioueevowelsbanana";
        String longestVowelSubstring = longestSubstringWithVowels(inputString);
        System.out.println("Longest substring with more than two vowels: " + longestVowelSubstring);
    }
}
