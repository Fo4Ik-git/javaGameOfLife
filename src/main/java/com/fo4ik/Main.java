package com.fo4ik;

public class Main {
    public static void main(String[] args) {
        int width = 5;
        int height = 5;
        int[][] board = new int[width][height];
        Core core = new Core(width, height);
        core.printBoard();
    }
}
