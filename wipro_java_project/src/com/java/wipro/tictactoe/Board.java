package com.java.wipro.tictactoe;


public class Board {
    private char[] board;

    public Board() {
        board = new char[9];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = '-'; // Empty cell
        }
    }

    public char[] getBoard() {
        return board;
    }

    public void setCell(int position, char symbol) {
        board[position] = symbol;
    }

    public char getCell(int position) {
        return board[position];
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 9; i++) {
            System.out.print("| " + board[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println("|");
                System.out.println("-------------");
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] == '-') {
                return false; // Found an empty cell
            }
        }
        return true;
    }
}

