/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.praktikgui1;

import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.GridLayout;

/**
 *
 * @author TAQI TALENTA
 */
public class praktikum1 extends javax.swing.JFrame {

    /**
     * Creates new form praktikum1
     */
    public praktikum1() {
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLNama = new javax.swing.JLabel();
        jLTanggalLahir = new javax.swing.JLabel();
        jLNoDaftar = new javax.swing.JLabel();
        jLNoTelp = new javax.swing.JLabel();
        jLAlamat = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jTFTanggalLahir = new javax.swing.JTextField();
        jTFNama = new javax.swing.JTextField();
        jTFAlamat = new javax.swing.JTextField();
        jTFNoDaftar = new javax.swing.JTextField();
        jTFNoTelp = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jBSubmitLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 51)));

        jLNama.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLNama.setForeground(new java.awt.Color(255, 255, 255));
        jLNama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLNama.setLabelFor(jTFNama);
        jLNama.setText("Nama Lengkap");

        jLTanggalLahir.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLTanggalLahir.setForeground(new java.awt.Color(255, 255, 255));
        jLTanggalLahir.setLabelFor(jTFTanggalLahir);
        jLTanggalLahir.setText("Tanggal Lahir");

        jLNoDaftar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLNoDaftar.setForeground(new java.awt.Color(255, 255, 255));
        jLNoDaftar.setLabelFor(jTFNoDaftar);
        jLNoDaftar.setText("Nomor Pendaftaran");

        jLNoTelp.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLNoTelp.setForeground(new java.awt.Color(255, 255, 255));
        jLNoTelp.setLabelFor(jTFNoTelp);
        jLNoTelp.setText("No. Telp");

        jLAlamat.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLAlamat.setForeground(new java.awt.Color(255, 255, 255));
        jLAlamat.setLabelFor(jTFAlamat);
        jLAlamat.setText("Alamat");

        jLEmail.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLEmail.setLabelFor(jTFEmail);
        jLEmail.setText("E-mail");

        jTFTanggalLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTanggalLahirActionPerformed(evt);
            }
        });

        jTFNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNamaActionPerformed(evt);
            }
        });

        jTFAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAlamatActionPerformed(evt);
            }
        });

        jTFNoDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNoDaftarActionPerformed(evt);
            }
        });

        jTFNoTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNoTelpActionPerformed(evt);
            }
        });

        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });

        jBSubmitLogin.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jBSubmitLogin.setForeground(new java.awt.Color(0, 102, 51));
        jBSubmitLogin.setText("SUBMIT");
        jBSubmitLogin.setAlignmentX(0.5F);
        jBSubmitLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jBSubmitLogin.setMaximumSize(new java.awt.Dimension(65, 23));
        jBSubmitLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubmitLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIODATA MAHASISWA UIN SATU");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTanggalLahir)
                    .addComponent(jLNama)
                    .addComponent(jLNoDaftar)
                    .addComponent(jLNoTelp)
                    .addComponent(jLAlamat)
                    .addComponent(jLEmail))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNoTelp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFNoDaftar)
                            .addComponent(jTFNama)
                            .addComponent(jTFTanggalLahir)
                            .addComponent(jTFAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jBSubmitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNama))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTanggalLahir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNoDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNoDaftar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNoTelp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEmail))
                .addGap(37, 37, 37)
                .addComponent(jBSubmitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSubmitLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubmitLoginActionPerformed
        // TODO add your handling code here:

        String a = jTFNama.getText();
        String b = jTFTanggalLahir.getText();
        String cS = jTFNoDaftar.getText();
        String dS = jTFNoTelp.getText();
        String e = jTFAlamat.getText();
        String f = jTFEmail.getText();

        if (a.isEmpty() || b.isEmpty() || cS.isEmpty() || dS.isEmpty() || e.isEmpty() || f.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap Isi Semua kolom!", "Data Kosong !", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            
            int c = Integer.parseInt(cS);
            int d = Integer.parseInt(dS);

          
            int response = JOptionPane.showConfirmDialog(this, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                System.out.println("YES clicked");

                
                 
                String data = String.format( "Nama: %s\nTanggal: %s\nPendaftaran: %d\nNo: %d\nAlamat: %s\nEmail: %s", a, b, c, d, e, f );      
                new tampilan(data).setVisible(true);
                
            } else if (response == JOptionPane.NO_OPTION) {
                System.out.println("NO clicked");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Nomor Pendaftaran dan No Telp harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_jBSubmitLoginActionPerformed

    private void jTFNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNamaActionPerformed

    private void jTFTanggalLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTanggalLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTanggalLahirActionPerformed

    private void jTFNoDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNoDaftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNoDaftarActionPerformed

    private void jTFNoTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNoTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNoTelpActionPerformed

    private void jTFAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAlamatActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailActionPerformed

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
            java.util.logging.Logger.getLogger(praktikum1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(praktikum1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(praktikum1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(praktikum1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new praktikum1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSubmitLogin;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLAlamat;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLNama;
    private javax.swing.JLabel jLNoDaftar;
    private javax.swing.JLabel jLNoTelp;
    private javax.swing.JLabel jLTanggalLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFAlamat;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNama;
    private javax.swing.JTextField jTFNoDaftar;
    private javax.swing.JTextField jTFNoTelp;
    private javax.swing.JTextField jTFTanggalLahir;
    // End of variables declaration//GEN-END:variables
}
