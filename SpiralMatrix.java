import java.util.*;

public class SpiralMatrix {

    static ArrayList<Integer> list = new ArrayList<>();
    static int dir = 0;

    public static void recurse(int[][] matrix, boolean[][] visited, int i, int j) {

        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || visited[i][j]) {
            return;
        }

        visited[i][j] = true;
        list.add(matrix[i][j]);

        int ni = i, nj = j;

        if (dir == 0) nj++;        // right
        else if (dir == 1) ni++;   // down
        else if (dir == 2) nj--;   // left
        else ni--;                 // up

        // if next move is invalid, turn right
        if (ni < 0 || nj < 0 || ni >= matrix.length || nj >= matrix[0].length || visited[ni][nj]) {
            dir = (dir + 1) % 4;
        }

        if (dir == 0) recurse(matrix, visited, i, j + 1);
        else if (dir == 1) recurse(matrix, visited, i + 1, j);
        else if (dir == 2) recurse(matrix, visited, i, j - 1);
        else recurse(matrix, visited, i - 1, j);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        recurse(matrix, visited, 0, 0);
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }
}
