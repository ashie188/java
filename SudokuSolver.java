import java.util.*;

public class SudokuSolver {

    public static void main(String[] args) {

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Before Solving:\n");
        printBoard(board);

        solveSudoku(board);

        System.out.println("\nAfter Solving:\n");
        printBoard(board);
    }

    // ===== LeetCode Logic Starts =====

    public static void solveSudoku(char[][] board) {
        solve(board);
    }

    private static boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    for (char num = '1'; num <= '9'; num++) {

                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                            if (solve(board))
                                return true;

                            board[row][col] = '.';   // backtrack
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char num) {

        for (int i = 0; i < 9; i++) {

            // row check
            if (board[row][i] == num) return false;

            // column check
            if (board[i][col] == num) return false;

            // 3x3 box check
            int r = 3 * (row / 3) + i / 3;
            int c = 3 * (col / 3) + i % 3;

            if (board[r][c] == num) return false;
        }

        return true;
    }

    // ===== Utility to Print Board =====

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
