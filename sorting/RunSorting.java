package com.dina.javalanjut.gui.sorting;

import javax.swing.*;

public class RunSorting {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }

        JFrame jFrame = new JFrame( "Sorting Number");
        jFrame.setContentPane(new FormSorting().getMainPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}


