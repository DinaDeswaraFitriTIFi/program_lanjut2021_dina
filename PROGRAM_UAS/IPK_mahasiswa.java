/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ipk.semester.mahasiswa;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
/**
 *
 * @author Dina-DF
 */
public class IPK_mahasiswa extends javax.swing.JFrame {
    DefaultTableModel model;

    /**
     * Creates new form IPK_mahasiswa
     */
    public IPK_mahasiswa() {
        initComponents();
        setTable(); //pnggil method
    }
    
private void setTable(){
        Object[] field = {"Nama Siswa", "Kehadiran","Tugas" ,"UTS",  "UAS", "Nilai Akhir", "Nilai Huruf"};
        model = new DefaultTableModel(field, 0);
        tabel.setModel(model);
        JTableHeader th = tabel.getTableHeader();
        th.setReorderingAllowed(false);
        tabel.setRowHeight(30);  
        
    }
    private String calculate(String... utm){
        for (int i = 0; i < utm.length; i++){
                if(utm[i].isEmpty()){
                    utm[i] = "0";
                }
        }
        double t1=0,t2=0,t3=0,t4=0;
        for (int i = 0; i < utm.length; i++) {
            double cv = Double.valueOf(utm[i]);
            switch (i) {
                case 0:
                    t1 = cv * 0.1;
                    break;
                case 1:
                    t2 = cv * 0.3;
                    break;
                case 2:
                    t3 = cv * 0.2;
                    break;
                case 3:
                    t4 = cv * 0.4;
                    break;
                default:
                    break;
            }
        }
        double jumlah = t1+t2+t3+t4;
        double as = Math.round(jumlah);
        String cvJumlah = indexOF(as);
        return cvJumlah;
    }
    
    public String indexOF(double b){
        String hsl;
        if(b %1 == 0){
            hsl = String.valueOf(b).substring(0,String.valueOf(b).lastIndexOf("."));
        }else{
            hsl = String.valueOf(b);
        }
        return hsl;
    }
    
    private String calAbjad(String jumlah){
        String nilai = "";
        double b = Double.valueOf(jumlah);
        if(b <= 100 && b >= 80){
            nilai = "A";
        }else if(b <= 79 && b >= 60){
            nilai = "B";
        }else if(b <= 69 && b >= 40){
            nilai = "C";
        }else if(b <= 39){
            nilai = "D";
        }
        return nilai;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMK = new javax.swing.JTextField();
        txtkehadiran = new javax.swing.JTextField();
        txtuts = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttugas = new javax.swing.JTextField();
        txtuas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHitungSimpan = new javax.swing.JButton();
        txtClearR = new javax.swing.JButton();
        txtClearF = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NILAI SEMESTER IPK MAHASISWA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 20, 211, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("NAMA SISWA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 75, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KEHADIRAN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 65, 30);

        txtMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKActionPerformed(evt);
            }
        });
        getContentPane().add(txtMK);
        txtMK.setBounds(119, 64, 507, 30);
        getContentPane().add(txtkehadiran);
        txtkehadiran.setBounds(119, 139, 165, 30);
        getContentPane().add(txtuts);
        txtuts.setBounds(460, 140, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NILAI UTS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(366, 140, 80, 30);
        getContentPane().add(txttugas);
        txttugas.setBounds(119, 197, 165, 30);
        getContentPane().add(txtuas);
        txtuas.setBounds(460, 200, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NILAI TUGAS ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 200, 75, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NILAI UAS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 200, 60, 30);

        txtHitungSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHitungSimpan.setText("SIMPAN");
        txtHitungSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHitungSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(txtHitungSimpan);
        txtHitungSimpan.setBounds(95, 304, 93, 23);

        txtClearR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtClearR.setText("HAPUS DATA");
        txtClearR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClearRActionPerformed(evt);
            }
        });
        getContentPane().add(txtClearR);
        txtClearR.setBounds(287, 304, 113, 23);

        txtClearF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtClearF.setText("HAPUS");
        txtClearF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClearFActionPerformed(evt);
            }
        });
        getContentPane().add(txtClearF);
        txtClearF.setBounds(500, 304, 95, 23);

        keluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(671, 19, 75, 23);

        tabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 371, 780, 560);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 780, 510);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipk/semester/mahasiswa/WhatsApp Image 2021-06-28 at 17.16.16.jpeg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 780, 940);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKActionPerformed

    private void txtHitungSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHitungSimpanActionPerformed
    String MK = txtMK.getText();
        String hadir = txtkehadiran.getText();
        String uts = txtuts.getText();
        String tugas = txttugas.getText();
        String uas = txtuas.getText();
        
        if(MK.isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukan Nama Mahasiswa Terlebih Dahulu");
            txtMK.requestFocus();
        }else{
            String[] data = {hadir, uts, tugas, uas};
            
            String jml = calculate(data);
            Object[] data2 = {MK, hadir, uts, tugas, uas, jml, calAbjad(jml)};
            model.addRow(data2);
        }
    }//GEN-LAST:event_txtHitungSimpanActionPerformed

    private void txtClearRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClearRActionPerformed
  int[] pilih = tabel.getSelectedRows();
        if(pilih.length > 0){
            for(int i = pilih.length-1; i >= 0; i--){
                model.removeRow(pilih[i]);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus");
        }
    }//GEN-LAST:event_txtClearRActionPerformed

    private void txtClearFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClearFActionPerformed
    txtMK.setText("");
        txtkehadiran.setText("");
        txtuts.setText("");
        txttugas.setText("");
        txtuas.setText("");
    }//GEN-LAST:event_txtClearFActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
   System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IPK_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IPK_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IPK_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IPK_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IPK_mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton keluar;
    private javax.swing.JTable tabel;
    private javax.swing.JButton txtClearF;
    private javax.swing.JButton txtClearR;
    private javax.swing.JButton txtHitungSimpan;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtkehadiran;
    private javax.swing.JTextField txttugas;
    private javax.swing.JTextField txtuas;
    private javax.swing.JTextField txtuts;
    // End of variables declaration//GEN-END:variables
}
