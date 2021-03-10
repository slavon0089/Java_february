package com.company.homeWork8;

import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
    int move = 0;
    private static final ImageIcon def = new ImageIcon("def.png");
    private static final ImageIcon o = new ImageIcon("o.png");
    private static final ImageIcon x = new ImageIcon("x.png");

    private final JButton[][] map;

    public GameWindow() throws HeadlessException {
        setSize(360, 360);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(3,3);
        JPanel panel = new JPanel(layout);
        map = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton();
                button.setIcon(def);
                button.addActionListener(a -> {
                    button.setIcon(x);
                    checkWin ();
                    movePc();
                    checkWinPC ();
                    move++;

                    if (move==5) {
                        showWinnerDialog("Ничья");
                        return;
                    }

                });
                panel.add(button);
                map[i][j] = button;
            }
        }
        add(panel);
        setResizable(false);
        setVisible(true);
    }


    private void checkWin (){

        for (int l = 0; l < 3; l++) {
            boolean horiz = true, vert = true, diag1 = true, diag2 = true;
            for (int k = 0; k < 3; k++) {
                horiz &= map[l][k].getIcon().equals(x);
                vert &= map[k][l].getIcon().equals(x);
                diag1 &= map[k][k].getIcon().equals(x);
                diag2 &= map[k][map.length-k-1].getIcon().equals(x);
            }
            if (horiz || vert|| diag1||diag2) {
                showWinnerDialog("Вы победили");
                return;
            }
        }
    }

    private void checkWinPC (){

        for (int l = 0; l < 3; l++) {
            boolean horiz = true, vert = true, diag1 = true, diag2 = true;
            for (int k = 0; k < 3; k++) {
                horiz &= map[l][k].getIcon().equals(o);
                vert &= map[k][l].getIcon().equals(o);
                diag1 &= map[k][k].getIcon().equals(o);
                diag2 &= map[k][map.length-k-1].getIcon().equals(o);
            }
            if (horiz || vert|| diag1||diag2) {
                showWinnerDialog("Вы проиграли ");
                return;
            }
        }
    }

    private void showWinnerDialog(String result) {
        new WinnerDialog(this, result);
    }

    private void movePc() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j].getIcon().equals(def)) {
                    map[i][j].setIcon(o);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}