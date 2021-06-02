package com.dina.javalanjut.gui;

import javax.swing.*;

public class RunFormMahasiswa {
    public static void main(String[] args) {
        JFrame JFrame = new JFrame("Form Mahasiswa");
        JFrame.setContentPane(new FORM_MAHASISWA().getRootPanel());
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setLocationRelativeTo(null);
        JFrame.setSize(500,400);
        JFrame.setVisible(true);
    }

}
