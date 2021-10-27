package ru.mirea.pr4;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Score score = new Score();
        Tableau frame = new Tableau(score);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
