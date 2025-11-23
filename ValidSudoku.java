import java.util.*;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char ch = board[i][j];

                if (ch == '.') continue;

                int d = ch - '1'; 
                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i][d] || cols[j][d] || boxes[boxIndex][d]) {
                    return false;
                }

                rows[i][d] = true;
                cols[j][d] = true;
                boxes[boxIndex][d] = true;
            }
        }
        return true;
    }

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

        boolean result = isValidSudoku(board);

        System.out.println("Is Sudoku valid? → " + result);
    }
}
