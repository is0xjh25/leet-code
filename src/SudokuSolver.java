/*
37.Sudoku Solver
Write a program to solve a Sudoku puzzle by filling the empty cells.
A sudoku solution must satisfy all of the following rules:
    Each of the digits 1-9 must occur exactly once in each row.
    Each of the digits 1-9 must occur exactly once in each column.
    Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

Yun-Chi Hsiao
Jul.26th.2021
 */

public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        solve(board, 0);
    }

    private boolean solve(char[][] board, int cellNo) {

        // cellNo can be from 0 to 80. If it is 81 we found our solution
        if (cellNo == 81)
            return true;

        int x = cellNo / 9;
        int y = cellNo % 9;

        // Cell is not empty
        if (board[x][y] != '.')
            return solve(board, cellNo + 1);

        for (char i = '1'; i <= '9'; ++i) {
            if (isValid(board, x, y, i)) {
                board[x][y] = i;
                if (solve(board, cellNo + 1))
                    return true;
                else
                    board[x][y] = '.';
            }
        }

        return false;

    }

    private boolean isValid(char[][] board, int x, int y, char c) {
        for(int i = 0; i < 9; ++i) {
            if (board[x][i] != '.' && board[x][i] == c) return false;
            if (board[i][y] != '.' && board[i][y] == c) return false;
            int xs = 3 * (x / 3) + i / 3;
            int ys = 3 * (y / 3) + i % 3;
            if (board[xs][ys] != '.' && board[xs][ys] == c) return false;
        }
        return true;
    }
}
