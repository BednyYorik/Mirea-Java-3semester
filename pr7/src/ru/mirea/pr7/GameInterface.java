package ru.mirea.pr7;

import javax.swing.*;
import java.awt.*;

public class GameInterface extends JFrame {

    public GameInterface(){
        super("Игра");
        setSize(480, 140);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel firstStart = new JLabel(),
                secondStart = new JLabel(),
                curAdd = new JLabel("0");
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);

        JButton addFirst = new JButton("Первому!"),
                addSecond = new JButton("Второму!"),
                playButton = new JButton("Играть");
        panel.add(addFirst);
        panel.add(addSecond);

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Первый игрок:"));
        panel1.add(firstStart);

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Второй игрок:"));
        panel2.add(secondStart);

        JPanel panel3 = new JPanel();
        panel3.add( new JLabel("Добавить номер: "));
        panel3.add(curAdd);

        getContentPane().add(panel1, BorderLayout.NORTH);
        getContentPane().add(panel2, BorderLayout.SOUTH);
        getContentPane().add(panel3, BorderLayout.CENTER);
        getContentPane().add(panel, BorderLayout.EAST);
        getContentPane().add(playButton, BorderLayout.WEST);

        playButton.setEnabled(false);

        addFirst.addActionListener(e->{
            firstStart.setText(firstStart.getText()+curAdd.getText());
            curAdd.setText((new Integer(Integer.parseInt(curAdd.getText())+1)).toString());
            if(firstStart.getText().length() == 5) {
                addFirst.setEnabled(false);
                if(secondStart.getText().length() == 5){
                    playButton.setEnabled(true);
                }
            }
        });
        addSecond.addActionListener(e->{
            secondStart.setText(secondStart.getText()+curAdd.getText());
            curAdd.setText((new Integer(Integer.parseInt(curAdd.getText())+1)).toString());
            if(secondStart.getText().length() == 5) {
                addSecond.setEnabled(false);
                if(firstStart.getText().length() == 5){
                    playButton.setEnabled(true);
                }
            }
        });

        playButton.addActionListener(e->{
            JOptionPane.showMessageDialog(this, new Game(firstStart.getText(), secondStart.getText()).play());
            firstStart.setText("");
            secondStart.setText("");
            curAdd.setText("0");
            addFirst.setEnabled(true);
            addSecond.setEnabled(true);
            playButton.setEnabled(false);
        });

    }

    public static void main(String[] args) {
        new GameInterface().setVisible(true);
    }
}
