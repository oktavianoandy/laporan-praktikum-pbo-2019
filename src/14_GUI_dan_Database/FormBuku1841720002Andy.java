/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author Andy
 */
import backend.Buku1841720002Andy;
import backend.Kategori1841720002Andy;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class FormBuku1841720002Andy extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku1841720002Andy
     */
    public FormBuku1841720002Andy() {
        initComponents();
        tampilkanDataAndy();
        tampilkanCmbKategori();
        kosongkanFormAndy();
    }

    public void kosongkanFormAndy() {
        txtIdBuku.setText("0");
        cmbKategori.setSelectedIndex(0);
        txtJudul.setText("");
        txtPenulis.setText("");
        txtPenerbit.setText("");
    }

    public void tampilkanDataAndy() {
        String[] kolom = {"ID", "Kategori", "Judul", "Penulis", "Penerbit"};
        ArrayList<Buku1841720002Andy> list = new Buku1841720002Andy().getAllAndy();
        Object rowData[] = new Object[5];

        tblBuku.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getIdBukuAndy();
            rowData[1] = list.get(i).getKategoriAndy().getNamaAndy();
            rowData[2] = list.get(i).getJudulAndy();
            rowData[3] = list.get(i).getPenulisAndy();
            rowData[4] = list.get(i).getPenerbitAndy();

            ((DefaultTableModel) tblBuku.getModel()).addRow(rowData);
        }
    }

    public void cariAndy(String keyword) {
        String[] kolom = {"ID", "Kategori", "Judul", "Penulis", "Penerbit"};
        ArrayList<Buku1841720002Andy> list = new Buku1841720002Andy().searchAndy(keyword);
        Object rowData[] = new Object[5];

        tblBuku.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Buku1841720002Andy buku : list) {
            rowData[0] = buku.getIdBukuAndy();
            rowData[1] = buku.getKategoriAndy().getNamaAndy();
            rowData[2] = buku.getJudulAndy();
            rowData[3] = buku.getPenulisAndy();
            rowData[4] = buku.getPenerbitAndy();

            ((DefaultTableModel) tblBuku.getModel()).addRow(rowData);
        }
    }

    public void tampilkanCmbKategori() {
        cmbKategori.setModel(new DefaultComboBoxModel(new Kategori1841720002Andy().getAllAndy().toArray()));
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdBuku = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<String>();
        txtJudul = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        txtPenulis = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Buku");

        jLabel2.setText("Kategori");

        jLabel3.setText("Judul");

        jLabel4.setText("Penerbit");

        jLabel5.setText("Penulis");

        txtIdBuku.setEditable(false);
        txtIdBuku.setEnabled(false);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuku);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambahBaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPenulis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                        .addComponent(txtPenerbit, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(btnSimpan)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBaru)
                    .addComponent(btnHapus)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Buku1841720002Andy buku = new Buku1841720002Andy();
        buku.setIdBukuAndy(Integer.parseInt(txtIdBuku.getText()));
        buku.setKategoriAndy((Kategori1841720002Andy) cmbKategori.getSelectedItem());
        buku.setJudulAndy(txtJudul.getText());
        buku.setPenulisAndy(txtPenulis.getText());
        buku.setPenerbitAndy(txtPenerbit.getText());
        buku.saveAndy();

        txtIdBuku.setText(Integer.toString(buku.getIdBukuAndy()));

        tampilkanDataAndy();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblBuku.getModel();
        int row = tblBuku.getSelectedRow();

        Buku1841720002Andy buku = new Buku1841720002Andy().getByIdAndy(Integer.parseInt(model.getValueAt(row, 0).toString()));
        buku.deleteAndy();
        kosongkanFormAndy();
        tampilkanDataAndy();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cariAndy(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBukuMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblBuku.getModel();
        int row = tblBuku.getSelectedRow();
        Buku1841720002Andy buku = new Buku1841720002Andy();

        buku = buku.getByIdAndy(Integer.parseInt(model.getValueAt(row, 0).toString()));

        txtIdBuku.setText(String.valueOf(buku.getIdBukuAndy()));
        cmbKategori.getModel().setSelectedItem(buku.getKategoriAndy());
        txtJudul.setText(buku.getJudulAndy());
        txtPenerbit.setText(buku.getPenerbitAndy());
        txtPenulis.setText(buku.getPenulisAndy());
    }//GEN-LAST:event_tblBukuMouseClicked

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanFormAndy();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        // TODO add your handling code here:
        cmbKategori.setModel(new DefaultComboBoxModel(new Kategori1841720002Andy().getAllAndy().toArray()));
    }//GEN-LAST:event_cmbKategoriActionPerformed

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
            java.util.logging.Logger.getLogger(FormBuku1841720002Andy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku1841720002Andy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku1841720002Andy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku1841720002Andy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku1841720002Andy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPenulis;
    // End of variables declaration//GEN-END:variables
}
