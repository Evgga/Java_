/**Отвалидировать доску судоку
        /Требования
        Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
        1. Каждая строка должна содержать цифру 1-9 без повторения
        2. Каждая колонка должна содержать цифру 1-9 без повторения
        3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
        Ограничения
        • board.length == 9
        • board[i].length == 9
        • board[i][j] значение число или '.'*/

package org.example.JavaHomeWork;

public class Test_4_sem2 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("Validate:" + isValidSudoku(board));
    }
    private static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') continue;
                if (valid(board, i, j) == false) return false;
            }
        }
        return true;
    }
    private static boolean valid(char[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if (i == row) continue;
            if (board[i][col] == board[row][col]) return false;
        }
        // проверка столбца
        for (int j = 0; j < board[0].length; j++) {
            if (j == col) continue;
            if (board[row][j] == board[row][col]) return false;
        }
        for (int i = (row / 3) * 3; i < (row / 3 + 1) * 3; i++) {
            for (int j = (col / 3) * 3; j < (col / 3 + 1) * 3; j++) {
                if (i == row && j == col) continue;
                if (board[i][j] == board[row][col]) return false;
            }
        }
        return true;
    }
}
