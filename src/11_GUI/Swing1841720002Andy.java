/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaangui;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public class Swing1841720002Andy extends javax.swing.JFrame {
    
    private String mNama, mNim, mJenisKelamin,
            mInfo, mJurusan, mMataKuliah, mSemeter, mAlamat;

    /**
     * Creates new form Swing1841720002Andy
     */
    public Swing1841720002Andy() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mButtonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mTxtname = new javax.swing.JTextField();
        mTxtnim = new javax.swing.JTextField();
        mRdjeniskelamin1 = new javax.swing.JRadioButton();
        mRdjeniskelamin2 = new javax.swing.JRadioButton();
        mCbMK1 = new javax.swing.JCheckBox();
        mCbMK2 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        mHasil = new javax.swing.JTextArea();
        mCmdclear = new javax.swing.JButton();
        mCmdtampil = new javax.swing.JButton();
        mComboxsemester = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        mListjurusan = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mTxtalamat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Mahasiswa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("NIM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Mata Kuliah");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Jurusan");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Semester");

        mTxtname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mTxtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTxtnameActionPerformed(evt);
            }
        });

        mTxtnim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        mButtonGroup1.add(mRdjeniskelamin1);
        mRdjeniskelamin1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mRdjeniskelamin1.setText("Laki-laki");

        mButtonGroup1.add(mRdjeniskelamin2);
        mRdjeniskelamin2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mRdjeniskelamin2.setText("Perempuan");

        mCbMK1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mCbMK1.setText("Sistem Terdistribusi");

        mCbMK2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mCbMK2.setText("PBO");
        mCbMK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCbMK2ActionPerformed(evt);
            }
        });

        mHasil.setColumns(20);
        mHasil.setRows(5);
        jScrollPane2.setViewportView(mHasil);

        mCmdclear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mCmdclear.setText("Clear");
        mCmdclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCmdclearActionPerformed(evt);
            }
        });

        mCmdtampil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mCmdtampil.setText("Tampil");
        mCmdtampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCmdtampilActionPerformed(evt);
            }
        });

        mComboxsemester.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mComboxsemester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8" }));

        mListjurusan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mListjurusan.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "DIV Teknik Informatika", "DIII Manajemen Informatika", "DIV Telekomunikasi", "DIII Teknik Elektronika", "DIV Teknik Mesin" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(mListjurusan);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Alamat");

        mTxtalamat.setColumns(20);
        mTxtalamat.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        mTxtalamat.setRows(5);
        jScrollPane1.setViewportView(mTxtalamat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(249, 249, 249))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mRdjeniskelamin1)
                                        .addGap(18, 18, 18)
                                        .addComponent(mRdjeniskelamin2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mCbMK1)
                                        .addGap(18, 18, 18)
                                        .addComponent(mCbMK2))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(mTxtnim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(mTxtname, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(mComboxsemester, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mCmdclear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mCmdtampil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(mTxtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(mTxtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mRdjeniskelamin1)
                            .addComponent(mRdjeniskelamin2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mCbMK1)
                            .addComponent(mCbMK2))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(mComboxsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mCmdtampil)
                            .addComponent(mCmdclear))))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mTxtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTxtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mTxtnameActionPerformed

    private void mCbMK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCbMK2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mCbMK2ActionPerformed

    private void mCmdclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCmdclearActionPerformed
        mTxtname.setText("");
        mTxtnim.setText("");
        mCbMK1.setSelected(false);
        mCbMK2.setSelected(false);
        mHasil.setText("");
    }//GEN-LAST:event_mCmdclearActionPerformed

    private void mCmdtampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCmdtampilActionPerformed
        mNama = mTxtname.getText();
        mNim = mTxtnim.getText();
        mAlamat = mTxtalamat.getText();
        if (mCbMK1.isSelected()) {
            mMataKuliah = "Sistem terdistribsi";
        }
        if (mCbMK2.isSelected()) {
            mMataKuliah += "PBO";
        }
        
        if (mRdjeniskelamin1.isSelected()) {
            mJenisKelamin = "Laki-laki";
        }
        if (mRdjeniskelamin2.isSelected()) {
            mJenisKelamin += "Perempuan";
        }
        
        if (mAlamat.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Alamat masih kosong!");
            return;
        }
        
        mJurusan = mListjurusan.getSelectedValue().toString();
        mSemeter = mComboxsemester.getSelectedItem().toString();
        
        mInfo = "Nama   : " + mNama + "\n";
        mInfo += "Nim   : " + mNim + "\n";
        mInfo += "Jenis Kelamin : " + mJenisKelamin + "\n";
        mInfo += "Jurusan : " + mJurusan + "\n";
        mInfo += "Semester : " + mSemeter + "\n";
        mInfo += "Mata Kuliah : " + mMataKuliah + "\n";
        mHasil.setText(mInfo);
        JOptionPane.showMessageDialog(null, mInfo);
    }//GEN-LAST:event_mCmdtampilActionPerformed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Swing1841720002Andy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Swing1841720002Andy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Swing1841720002Andy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Swing1841720002Andy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swing1841720002Andy().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.ButtonGroup mButtonGroup1;
    private javax.swing.JCheckBox mCbMK1;
    private javax.swing.JCheckBox mCbMK2;
    private javax.swing.JButton mCmdclear;
    private javax.swing.JButton mCmdtampil;
    private javax.swing.JComboBox mComboxsemester;
    private javax.swing.JTextArea mHasil;
    private javax.swing.JList mListjurusan;
    private javax.swing.JRadioButton mRdjeniskelamin1;
    private javax.swing.JRadioButton mRdjeniskelamin2;
    private javax.swing.JTextArea mTxtalamat;
    private javax.swing.JTextField mTxtname;
    private javax.swing.JTextField mTxtnim;
    // End of variables declaration//GEN-END:variables
}