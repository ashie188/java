
public class UniquePathGrid {

    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        // Initially, every cell is an obstacle.
        char[][] cells = new char[m][n];

        for (int i = 0; i < m; i++) {
            java.util.Arrays.fill(cells[i], '#');
        }

        // Create the path along the first row.
        for (int j = 0; j < n; j++) {
            cells[0][j] = '.';
        }

        // Continue down the last column.
        for (int i = 1; i < m; i++) {
            cells[i][n - 1] = '.';
        }

        for (int i = 0; i < m; i++) {
            grid[i] = new String(cells[i]);
        }

        return grid;
    }

    public static void main(String[] args) {
        UniquePathGrid solution = new UniquePathGrid();

        String[] result = solution.createGrid(3, 3);

        for (String row : result) {
            System.out.println(row);
        }
    }
}
