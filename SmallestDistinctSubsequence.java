import java.util.*;

public class SmallestDistinctSubsequence {

    public static String smallestSubsequence(String s) {
        int[] lastOccurrence = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        boolean[] present = new boolean[26];
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (present[current - 'a']) {
                continue;
            }

            while (!stack.isEmpty()
                    && stack.peekLast() > current
                    && lastOccurrence[stack.peekLast() - 'a'] > i) {

                present[stack.pollLast() - 'a'] = false;
            }

            stack.offerLast(current);
            present[current - 'a'] = true;
        }

        StringBuilder answer = new StringBuilder();

        while (!stack.isEmpty()) {
            answer.append(stack.pollFirst());
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String s1 = "bcabc";
        String s2 = "cbacdcbc";

        System.out.println(smallestSubsequence(s1)); // abc
        System.out.println(smallestSubsequence(s2)); // acdb
    }
}