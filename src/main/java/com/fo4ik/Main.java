package com.fo4ik;

public class Main {
    public static void main(String[] args) {
        Core core = new Core(8, 5);

        core.setAlive(2, 2);
        core.setAlive(3, 2);
        core.setAlive(4, 2);


        core.printBoard();

        System.out.println(core.countAlive(3, 2));
    }
}
