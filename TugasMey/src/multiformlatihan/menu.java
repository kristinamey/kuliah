/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiformlatihan;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnUser = new javax.swing.JMenu();
        mnLogin = new javax.swing.JMenuItem();
        mnManageuser = new javax.swing.JMenuItem();
        mnLogout = new javax.swing.JMenuItem();
        mnManajemenbarang = new javax.swing.JMenu();
        mnBarangbaku = new javax.swing.JMenu();
        mnPengadaan = new javax.swing.JMenu();
        mnBarang = new javax.swing.JMenuItem();
        mnPenjualan = new javax.swing.JMenu();
        mnLaporan = new javax.swing.JMenu();
        mnLaporanpenjualan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiformlatihan/user.png"))); // NOI18N
        mnUser.setText("User");

        mnLogin.setText("Login");
        mnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoginActionPerformed(evt);
            }
        });
        mnUser.add(mnLogin);

        mnManageuser.setText("Manage User");
        mnUser.add(mnManageuser);

        mnLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnLogout.setText("Logout");
        mnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogoutActionPerformed(evt);
            }
        });
        mnUser.add(mnLogout);

        jMenuBar1.add(mnUser);

        mnManajemenbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiformlatihan/manajemenbarang.png"))); // NOI18N
        mnManajemenbarang.setText("Manajemen Barang");
        mnManajemenbarang.setEnabled(false);

        mnBarangbaku.setText("Barang Baku");
        mnBarangbaku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnBarangbakuMouseClicked(evt);
            }
        });
        mnManajemenbarang.add(mnBarangbaku);

        jMenuBar1.add(mnManajemenbarang);

        mnPengadaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiformlatihan/pengadaan.png"))); // NOI18N
        mnPengadaan.setText("Pengadaan");
        mnPengadaan.setEnabled(false);

        mnBarang.setText("Barang");
        mnBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBarangActionPerformed(evt);
            }
        });
        mnPengadaan.add(mnBarang);

        jMenuBar1.add(mnPengadaan);

        mnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiformlatihan/penjualan.png"))); // NOI18N
        mnPenjualan.setText("Penjualan");
        mnPenjualan.setEnabled(false);
        jMenuBar1.add(mnPenjualan);

        mnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiformlatihan/laporan.png"))); // NOI18N
        mnLaporan.setText("Laporan");
        mnLaporan.setEnabled(false);

        mnLaporanpenjualan.setText("Laporan Penjualan");
        mnLaporanpenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnLaporanpenjualanMouseClicked(evt);
            }
        });
        mnLaporanpenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLaporanpenjualanActionPerformed(evt);
            }
        });
        mnLaporan.add(mnLaporanpenjualan);

        jMenuBar1.add(mnLaporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoginActionPerformed
        // TODO add your handling code here:
        new flogin(this,true).setVisible(true);
    }//GEN-LAST:event_mnLoginActionPerformed

    private void mnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogoutActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Are you sure, you want to exit?",  
                "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                System.exit(0);
        }
    }//GEN-LAST:event_mnLogoutActionPerformed

    private void mnBarangbakuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnBarangbakuMouseClicked
        // TODO add your handling code here:
        new barangbaku(this,true).setVisible(true);
    }//GEN-LAST:event_mnBarangbakuMouseClicked

    private void mnLaporanpenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnLaporanpenjualanMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_mnLaporanpenjualanMouseClicked

    private void mnBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBarangActionPerformed
        // TODO add your handling code here:
        new barang(this,true).setVisible(true);
    }//GEN-LAST:event_mnBarangActionPerformed

    private void mnLaporanpenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLaporanpenjualanActionPerformed
        // TODO add your handling code here:
        new laporanpenjualan(this,true).setVisible(true);
    }//GEN-LAST:event_mnLaporanpenjualanActionPerformed
        
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnBarang;
    private javax.swing.JMenu mnBarangbaku;
    public static javax.swing.JMenu mnLaporan;
    private javax.swing.JMenuItem mnLaporanpenjualan;
    private javax.swing.JMenuItem mnLogin;
    private javax.swing.JMenuItem mnLogout;
    private javax.swing.JMenuItem mnManageuser;
    public static javax.swing.JMenu mnManajemenbarang;
    public static javax.swing.JMenu mnPengadaan;
    public static javax.swing.JMenu mnPenjualan;
    private javax.swing.JMenu mnUser;
    // End of variables declaration//GEN-END:variables
}
