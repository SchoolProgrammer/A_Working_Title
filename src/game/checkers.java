/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author cross.william
 */
public class checkers {
    
    public static void main (String args []) {
        char[][] board;
        board = new char[8][8];
        
        for(int row = 0; row < 8;  row++) {
            for(int column = 0; column < 8;  column++) {
                if (row%2 != column%2) {
                    board[row][column] = '-';
                } else {
                    board[row][column] = '.';
                }
            }
        }
        for(int row = 0; row < 8;  row++) {
            for(int column = 0; column < 8;  column++) {
                if (row < 3 && board[row][column] == ('-')) {
                    board[row][column] = 'O';
                } else if (row > 4 && board[row][column] == ('-')){
                    board[row][column] = 'X';
                }
            }
        }
        printBoard(board);
        
        
    }
    
    public static void printBoard(char[][] board) {
        for(int row = 0; row < 8;  row++) {
            for(int column = 0; column < 8;  column++) {
                if (column < 0) {
                    System.out.println(board[row][column]);
                } else {
                    System.out.print(board[row][column]);
                }
            
            }
        }
    }
    
}
