public import java.util.*;

public class MinDeletionSizeApp {

  public static int minDeletionSize(String[] strs) {
    if (strs.length == 1 || strs[0].length() == 0)
      return 0;

    ArrayList<Boolean> list = new ArrayList<>();

    for (int y = 0; y < strs[0].length(); y++) {
      list.add(true);
    }

    String curr = "";
    String prev = "";

    for (int i = 1; i < strs.length; i++) {
      prev = strs[i - 1];
      curr = strs[i];

      for (int j = 0; j < curr.length(); j++) {
        if (list.get(j)) {
          if (curr.charAt(j) < prev.charAt(j)) {
            list.set(j, false);
          }
        }
      }
    }

    int count = 0;
    for (int k = 0; k < strs[0].length(); k++) {
      if (!list.get(k)) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    // Example input
    String[] strs = {"cba", "daf", "ghi"};

    int result = minDeletionSize(strs);

    System.out.println("Minimum columns to delete: " + result);
  }
}
 {
  
}
