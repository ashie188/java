public class DeleteColumnsSortedII {

    public static int minDeletionSize(String[] strs) {
        int n = strs.length;
        int wordlen = strs[0].length();
        String prev = "";
        String curr = "";
        int count = 0;

        boolean[] sorted = new boolean[n - 1];

        for (int i = 0; i < wordlen; i++) {

            boolean deleteColumn = false;

            for (int j = 1; j < n; j++) {
                if (sorted[j - 1]) continue;

                prev = strs[j - 1];
                curr = strs[j];

                if (prev.charAt(i) > curr.charAt(i)) {
                    count++;
                    deleteColumn = true;
                    break;
                }
            }

            if (deleteColumn) continue;

            for (int j = 1; j < n; j++) {
                if (!sorted[j - 1]) {
                    prev = strs[j - 1];
                    curr = strs[j];
                    if (prev.charAt(i) < curr.charAt(i)) {
                        sorted[j - 1] = true;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // Test case 1
        String[] strs1 = {"ca", "bb", "ac"};
        System.out.println("Input: [\"ca\",\"bb\",\"ac\"]");
        System.out.println("Output: " + minDeletionSize(strs1));
        System.out.println("Expected: 1");
        System.out.println();

        // Test case 2
        String[] strs2 = {"xc", "yb", "za"};
        System.out.println("Input: [\"xc\",\"yb\",\"za\"]");
        System.out.println("Output: " + minDeletionSize(strs2));
        System.out.println("Expected: 0");
        System.out.println();

        // Test case 3
        String[] strs3 = {"zyx", "wvu", "tsr"};
        System.out.println("Input: [\"zyx\",\"wvu\",\"tsr\"]");
        System.out.println("Output: " + minDeletionSize(strs3));
        System.out.println("Expected: 3");
    }
}
