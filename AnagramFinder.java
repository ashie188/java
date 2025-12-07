import java.util.*;

public class AnagramFinder {
    public boolean check(HashMap<Character,Integer> mymap, String str){
        HashMap<Character,Integer> map = new HashMap<>(mymap);
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                if (map.get(str.charAt(i)) == 0) {
                    return false;
                }
                map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");

        if (s.length() < p.length()) return new ArrayList<>();

        for (int i = 0; i < p.length(); i++) {
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
            sb.append(s.charAt(i));
        }

        if (check(map, sb.toString())) {
            list.add(0);
        }
        int k = p.length();
        for (int j = k; j < s.length(); j++) {
            sb.deleteCharAt(0);
            sb.append(s.charAt(j));
            if (check(map, sb.toString())) {
                list.add((j - k) + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input format:
        // First line: s (the text)
        // Second line: p (the pattern)
        //
        // Example:
        // abcabc
        // abc
        //
        // Press Enter after typing each line.
        String s = "";
        String p = "";
        if (sc.hasNextLine()) s = sc.nextLine();
        if (sc.hasNextLine()) p = sc.nextLine();
        sc.close();

        AnagramFinder af = new AnagramFinder();
        List<Integer> result = af.findAnagrams(s, p);

        System.out.println(result);
    }
}
