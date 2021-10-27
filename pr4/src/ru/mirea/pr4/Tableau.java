package ru.mirea.pr4;

import javax.swing.*;
import java.awt.*;

public class Tableau extends JFrame {


    JButton Milan = new JButton("AC Milan");
    JButton Madrid = new JButton("Real Madrid");
    JLabel Result = new JLabel("Result: 0 X 0");
    JLabel Last = new JLabel("Last Scorer: N/A");
    Label Winner = new Label("Winner: DRAW");

    Tableau(Score score) {

        super("MILAN VS MADRID");

        JPanel[] pnl = new JPanel[9];
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        Milan.addActionListener(e -> {
            score.inc_milan();
            Result.setText(score.get_score());
            Last.setText(score.get_last());
            Winner.setText(score.get_winer());

        });
        Madrid.addActionListener(e -> {
            score.inc_madrid();
            Result.setText(score.get_score());
            Last.setText(score.get_last());
            Winner.setText(score.get_winer());
        });

        setSize(500, 200);
        pnl[0].add(Milan);
        pnl[2].add(Madrid);
        pnl[1].add(Result);
        pnl[4].add(Last);
        pnl[7].add(Winner);
        setVisible(true);

    }


}