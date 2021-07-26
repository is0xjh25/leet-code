/*
36.Valid Sudoku
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Yun-Chi Hsiao
Jul.26th.2021
*/

import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i <board.length; i++){
            for(int j = 0 ; j < board[0].length; j++){
                if(board[i][j] != '.' && !isValid(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int row, int col){
        char c = board[row][col];
        for(int i = 0; i < 9; i++) {
            if(i != row && board[i][col] == c) {
                return false;
            }//check row
            if(col != i && board[row][i] == c) {
                return false;
            } //check column
            int r = 3 * (row / 3) + i / 3;
            int co = 3 * (col / 3) + i % 3;
            if((r != row) && board[r][co] == c) {
                return false;
            }//check 3*3 block
        }
        return true;
    }
}
