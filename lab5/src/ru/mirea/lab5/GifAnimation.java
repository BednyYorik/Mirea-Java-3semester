package ru.mirea.lab5;

import javax.swing.*;

public class GifAnimation extends JFrame {

    private final JLabel img;
    private int imgNum = 0;
    private final ImageIcon[] pictures = new ImageIcon[5];

    private GifAnimation() {
        this.setSize(1024, 768);

        for (int i = 0; i < 5; i++) {
            pictures[i] = new ImageIcon(getClass().getResource((i + 1) + ".jpeg"), String.valueOf(SwingConstants.CENTER));
        }

        img = new JLabel(pictures[imgNum]);
        getContentPane().add(img);

        Timer timer = new Timer(2000, e -> showImages());
        timer.start();
    }

    private void showImages() {
        img.setIcon(pictures[imgNum]);
        if (imgNum == 4) imgNum = 0;
        else imgNum++;

    }

    public static void main(String[] args) {
        GifAnimation gif = new GifAnimation();
        gif.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gif.setVisible(true);
    }
}
