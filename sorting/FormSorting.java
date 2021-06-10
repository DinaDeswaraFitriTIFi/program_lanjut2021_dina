package com.dina.javalanjut.gui.sorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FormSorting {
    private JTextField InputField;
    private JButton DoButton;
    private JTable OutputTable;
    private JPanel MainPanel;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getMainPanel() {
        return MainPanel;

    }

    public FormSorting() {
        this.intitComponents();
        DoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) OutputTable.getModel();
                String input = InputField.getText();
                String[] tmp = input.split(",");
                String data = InputField.getText();
                int size = tmp.length;
                System.out.println(tmp.length);

                if (data.isEmpty()) {
                    JOptionPane.showMessageDialog(MainPanel,
                            "Inputkan Data Angka Terlebih Dahulu",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (!added) {
                    for (int i = 0; i < size; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int x = 0;
                for (int i : Sorting.getascending(input, size)) {
                    model.setValueAt(i, x, 0);
                    x++;
                }
                int y = 0;
                for (int i : Sorting.getascending(input, size)) {
                    model.setValueAt(i, y, 1);
                    y++;
                }

            }
        });

        private void initComponents();{
            Object[] tableColom = {
                    "ASCENDING",
                    "DESCENDING"
            };
            Object[][] initData = {

            };
            tableModel = new DefaultTableModel(initData, tableColom);
            //Set table model
            OutputTable.setModel(tableModel);
            //Menampilkan Sorting di setiap colom
            OutputTable.setAutoCreateRowSorter(true);
            //Enable single selection
            OutputTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }
    }
    }
