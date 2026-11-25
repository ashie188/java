
import java.util.*;

public class FrequencySort {

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) ->
            map.get(b) - map.get(a)
        );

        for (char ch : map.keySet()) {
            pq.offer(ch);
        }

        StringBuilder result = new StringBuilder();

        while (!pq.isEmpty()) {
            char ch = pq.poll();

            for (int i = 0; i < map.get(ch); i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "tree";

        System.out.println("Sorted String: " + frequencySort(s));
    }
}
