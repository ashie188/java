public class LongestRepeatingCharacter {

    public static int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            count[ch - 'A']++;

            maxFrequency = Math.max(maxFrequency, count[ch - 'A']);

            while ((right - left + 1) - maxFrequency > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        String s1 = "ABAB";
        int k1 = 2;

        String s2 = "AABABBA";
        int k2 = 1;

        System.out.println(characterReplacement(s1, k1)); // 4
        System.out.println(characterReplacement(s2, k2)); // 4
    }
}