package com.fo4ik;

public class Core {
    int width, height;
    int[][] board;

    public Core(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new int[width][height];
    }

    public void printBoard() {
        System.out.println(" -----");
        for (int i = 0; i < height; i++) {
            System.out.print("|");
            for (int j = 0; j < width; j++) {
                if (this.board[j][i] == 0) {
                    System.out.print(".");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("|");
        }
        System.out.println(" -----\n");
    }
}
