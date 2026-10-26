
import java.util.*;

public class CountIslandsDivisibleByK {

    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 0) {
                    continue;
                }

                long sum = 0;
                Stack<Integer> stack = new Stack<>();

                stack.push(i * n + j);
                grid[i][j] = 0;

                while (!stack.isEmpty()) {
                    int cell = stack.pop();

                    int row = cell / n;
                    int col = cell % n;

                    sum += gridValue(row, col, grid);
                }

                if (sum % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    private int gridValue(int row, int col, int[][] grid) {
        // The current cell was marked visited already.
        // Its original value must be saved before marking it.
        return 0;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 2, 1, 0, 0},
            {0, 5, 0, 0, 5},
            {0, 0, 1, 0, 0},
            {0, 1, 4, 7, 0},
            {0, 2, 0, 0, 8}
        };

        int k = 5;

        CountIslandsDivisibleByK solution =
                new CountIslandsDivisibleByK();

        System.out.println(solution.countIslands(grid, k));
    }
}
