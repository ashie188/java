import java.util.*;

public class SurroundedRegions {

    static boolean edgetouching;

    public static void dfs(char[][] board, int i, int j, List<List<Integer>> list) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == 'X') {
            return;
        }

        if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1) {
            edgetouching = true;
        }

        board[i][j] = 'X';  // mark visited

        list.add(Arrays.asList(i, j));

        dfs(board, i - 1, j, list);
        dfs(board, i + 1, j, list);
        dfs(board, i, j - 1, list);
        dfs(board, i, j + 1, list);
    }

    public static void solve(char[][] board) {
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    edgetouching = false;
                    List<List<Integer>> list = new ArrayList<>();

                    dfs(board, i, j, list);

                    if (edgetouching) {
                        for (List<Integer> curr : list) {
                            board[curr.get(0)][curr.get(1)] = 'O';
                        }
                    }
                }
            }
        }
    }

    // Utility to print board
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = {
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'}
        };

        System.out.println("Before:");
        printBoard(board);

        solve(board);

        System.out.println("\nAfter:");
        printBoard(board);
    }
}
