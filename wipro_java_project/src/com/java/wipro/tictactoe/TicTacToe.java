package com.java.wipro.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Scanner scanner = new Scanner(System.in);

    public TicTacToe(String player1Name, char player1Symbol, String player2Name, char player2Symbol) {
        board = new Board();
        player1 = new Player(player1Name, player1Symbol);
        player2 = new Player(player2Name, player2Symbol);
        currentPlayer = player1; // Start with player1
    }

    public void startGame() {
        System.out.println("Welcome to Tic-Tac-Toe!");
        board.printBoard();

        while (true) {
            System.out.println(currentPlayer.getName() + "'s turn. Enter a position (1-9):");
            int position = scanner.nextInt() - 1; // Adjust to 0-8

            if (position >= 0 && position < 9 && board.getCell(position) == '-') {
                board.setCell(position, currentPlayer.getSymbol());
                board.printBoard();

                if (checkWin()) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                }

                if (board.isFull()) {
                    System.out.println("It's a draw!");
                    break;
                }

                switchPlayer();

            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1; // Switch players
    }

    private boolean checkWin() {
        char[] b = board.getBoard(); // Get the current state of the board

        // Check rows, columns, and diagonals for a win condition
        return checkLine(b, 0, 1, 2) || checkLine(b, 3, 4, 5) || checkLine(b, 6, 7, 8) ||
               checkLine(b, 0, 3, 6) || checkLine(b, 1, 4, 7) || checkLine(b, 2, 5, 8) ||
               checkLine(b, 0, 4, 8) || checkLine(b, 2, 4, 6);
    }

    private boolean checkLine(char[] b, int a, int bIndex, int c) { // Renamed variable to avoid confusion
        return (b[a] != '-' && b[a] == b[bIndex] && b[a] == b[c]);
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe("Player 1", 'X', "Player 2", 'O');
        game.startGame();
    }
}
