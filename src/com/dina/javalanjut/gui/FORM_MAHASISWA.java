package com.dina.javalanjut.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FORM_MAHASISWA {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;
    private JLabel hasil2;
    private JLabel hasil3;
    private JLabel hasil4;
    private JLabel hasil5;
    private JLabel hasil6;
    private JLabel hasil7;

    public FORM_MAHASISWA() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //Mengambil data dari textNama
             String nama = textNama.getText();
             //Mengambil data dari textNim
             String nim = textNim.getText();
             //Diproses
             Mahasiswa mhs = new Mahasiswa();
             mhs.setNama(nama);
             mhs.setNim(nim);
             
             // tampilkan output ke form
             labelHasil.setText("\n Nama \t\t: " + mhs.getNama());
               hasil2.setText("\nJenjang Pendidikan\t\t: " + mhs.jenjangPendidikan());
                hasil3.setText("Angkatan\t\t\t\t: " + mhs.tahunmasuk());
                hasil4.setText("Fakultas\t\t\t\t: " + mhs.fakultas());
                hasil5.setText("Jurusan\t\t\t\t\t: " + mhs.jurusan());
                hasil6.setText("Jenis Kelamin\t\t\t: " + mhs.jenisKelamin());
                hasil7.setText("Nomor Urut Mahasiswa\t: " + mhs.urutan());


            }
        });

    }

    public JPanel getRootPanel() { return rootPanel;
    }
}
