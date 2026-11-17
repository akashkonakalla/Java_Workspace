package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[][] board = new char[3][3];

		// Initialize board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}

		char player = 'X';
		int moves = 0;

		while (moves < 9) {

			// Display board
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(board[i][j] + " | ");
				}
				System.out.println();
				System.out.println("---------");
			}

			System.out.println("Player " + player + " enter row and column (1-3):");

			int row = sc.nextInt() - 1;
			int col = sc.nextInt() - 1;

			if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
				System.out.println("Invalid move! Try again.");
				continue;
			}

			board[row][col] = player;
			moves++;

			// Check winner
			boolean win = false;

			for (int i = 0; i < 3; i++) {
				if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
					win = true;

				if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
					win = true;
			}

			if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
				win = true;

			if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
				win = true;

			if (win) {
				System.out.println("Player " + player + " wins!");
				break;
			}

			player = (player == 'X') ? 'O' : 'X';
		}

		if (moves == 9) {
			System.out.println("Game Draw!");
		}

		sc.close();
	}
}
