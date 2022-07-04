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
        for (int x = 0; x < height; x++) {
            System.out.print("|");
            for (int y = 0; y < width; y++) {
                if (this.board[y][x] == 0) {
                    System.out.print(".");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("|");
        }
        System.out.println(" -----\n");
    }

    public void setAlive(int x, int y) {
        this.board[x][y] = 1;
    }

    public void setDead(int x, int y) {
        this.board[x][y] = 0;
    }

    public int countAlive(int x, int y) {
        int count = 0;

        count += this.board[x - 1][y - 1];
        count += this.board[x][y - 1];
        count += this.board[x + 1][y - 1];

        count += this.board[x - 1][y];
        count += this.board[x + 1][y];

        count += this.board[x - 1][y + 1];
        count += this.board[x][y + 1];
        count += this.board[x + 1][y + 1];

        return count;
    }

    public void step() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int alive = countAlive(x, y);
                if (this.board[x][y] == 1) {
                    if (alive < 2) {
                        setDead(x, y);
                    } else if (alive == 2 || alive == 3) {
                        setAlive(x, y);
                    } else if (alive > 3) {
                        setDead(x, y);
                    }
                } else {
                    if (alive == 3) {
                        setAlive(x, y);
                    }
                }
            }
        }
    }
}
