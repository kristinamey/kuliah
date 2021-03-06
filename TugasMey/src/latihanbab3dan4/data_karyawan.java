/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanbab3dan4;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author diyah
 */
public class data_karyawan extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    private DefaultTableModel tableModel;
    private Connection koneksi = null;
    private koneksiDB db = new koneksiDB();
    private boolean status = false;
    private int baris;
    
    /**
     * Creates new form data_karyawan
     */
    public data_karyawan() {
        initComponents();
        tampilKry();
        baru();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNip = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        rdLaki = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdPerem = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cbJabatan = new javax.swing.JComboBox<>();
        tglLahir = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKry = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnLaporan = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("NIP");

        jLabel3.setText("Nama");

        jLabel4.setText("Jenis Kelamin");

        rdLaki.setText("Laki-Laki");
        rdLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLakiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input Data Karyawan");

        jLabel6.setText("Tanggal Lahir");

        rdPerem.setText("Perempuan");
        rdPerem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPeremActionPerformed(evt);
            }
        });

        jLabel5.setText("Jabatan");

        cbJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-List Jabatan-", "Direktur", "Manajer", "Karyawan" }));
        cbJabatan.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                cbJabatanPopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbJabatan.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                cbJabatanComponentHidden(evt);
            }
        });
        cbJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJabatanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(157, 157, 157)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdLaki)
                        .addGap(18, 18, 18)
                        .addComponent(rdPerem))
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdLaki)
                    .addComponent(rdPerem))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        tblKry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblKry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKry);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnLaporan.setText("Laporan");
        btnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanActionPerformed(evt);
            }
        });

        btnTutup.setText("Tutup");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addComponent(btnUbah)
                .addGap(18, 18, 18)
                .addComponent(btnHapus)
                .addGap(18, 18, 18)
                .addComponent(btnLaporan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTutup)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnLaporan)
                    .addComponent(btnTutup))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (status == false) {
            simpanKry();
        } else {
            ubahKry();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        status = true;
        txtNama.grabFocus();
        aturText(false, true, true, true);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusKry();
        aturText(true, true, true, true);
        baru();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        dispose();
    }//GEN-LAST:event_btnTutupActionPerformed

    private void tblKryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKryMouseClicked
        tampilText();
        aturText(false, false, false, false);
    }//GEN-LAST:event_tblKryMouseClicked

    private void rdLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLakiActionPerformed
        rdPerem.setSelected(false);
    }//GEN-LAST:event_rdLakiActionPerformed

    private void rdPeremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPeremActionPerformed
        rdLaki.setSelected(false);
    }//GEN-LAST:event_rdPeremActionPerformed

    private void cbJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJabatanActionPerformed

    private void cbJabatanComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cbJabatanComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJabatanComponentHidden

    private void cbJabatanPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbJabatanPopupMenuCanceled
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJabatanPopupMenuCanceled

    private void btnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanActionPerformed
        // TODO add your handling code here:
       try {
            String reportName = koneksiDB.pathReport+"reportKaryawan.jasper";
            HashMap parameter = new HashMap();
            File reportFile = new File(reportName);
            JasperReport jReport = (JasperReport)JRLoader.loadObject(reportFile.getPath());
            JasperPrint jPrint = JasperFillManager.fillReport(jReport, parameter, karyawanDB.getKoneksi());
            JasperViewer.viewReport(jPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception ex) {
            System.out.println(ex);
        }
       
    }//GEN-LAST:event_btnLaporanActionPerformed

    private void tglLahirAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tglLahirAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tglLahirAncestorAdded

    public void simpanKry() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String jcalender=(String) sdf.format(tglLahir.getDate());
        if (cbJabatan.getSelectedIndex() != 0) {
            try {
                String jk = (rdLaki.isSelected()? "Laki-Laki":"Perempuan");
                String query = "INSERT INTO tblkry VALUES('" 
                        + txtNip.getText() + "','"
                        + txtNama.getText() + "','" 
                        + jcalender + "','"
                        + jk + "','" 
                        + cbJabatan.getSelectedItem() + "')";
                
                db.koneksiDatabase();
                Statement st = db.getKoneksi().createStatement();
                st.executeUpdate(query);
                st.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            tampilKry();
            baru();
        } else {
            JOptionPane.showMessageDialog(this, "Field Jabatan belum dipilih !");
            cbJabatan.grabFocus();
        }
    }
    
    public String[][] tampilDataKry(String query) {
        int i, jmlBaris;
        String[][] temp = null;
        
        try {
            Statement st = db.getKoneksi().createStatement();
            ResultSet rsKry = st.executeQuery(query);
            rsKry.last();
            jmlBaris = rsKry.getRow();
            rsKry.beforeFirst();
            temp = new String[jmlBaris][5];
            i = 0;
            
            while (rsKry.next()) {
                temp[i][0] = rsKry.getString("nip");
                temp[i][1] = rsKry.getString("nama");
                temp[i][2] = rsKry.getString("tanggalLahir");
                temp[i][3] = rsKry.getString("jenis_kelamin");
                temp[i][4] = rsKry.getString("jabatan");
                i++;
            }
            st.close();
        } catch (SQLException se) {
            System.out.println("Gagal Tampil Data " + se.getMessage().toString());
            System.exit(0);
        }
        return temp;
    }
    
    private void tampilKry() {
        String[][] tbData;
        String[] tbHeader = {"NIP", "Nama", "Tanggal Lahir", "Jenis Kelamin", "Jabatan"};
        String sql = "SELECT * FROM tblkry";
        db.koneksiDatabase();
        try {
            tbData = tampilDataKry(sql);
            tableModel = new DefaultTableModel(tbData, tbHeader);
            tblKry.setModel(tableModel);
            
            int brs = tblKry.getRowCount();
            if (brs > 0) tblKry.addRowSelectionInterval(0, 0);
        } catch (Exception ex) {
            System.out.println("Statement Gagal Dibuat");
            System.out.println(ex.toString());
        }
        tampilText();
    }
    
    private void tampilText() {
        baris = tblKry.getSelectedRow();
        
        if (baris >= 0) {
            txtNip.setText(tableModel.getValueAt(baris, 0).toString());
            txtNama.setText(tableModel.getValueAt(baris, 1).toString());
            
            if ("Laki-Laki".equals(tableModel.getValueAt(baris, 2).toString())) {
                rdLaki.setSelected(true);
                rdPerem.setSelected(false);
            } else {
                rdLaki.setSelected(false);
                rdPerem.setSelected(true);
            }
            tglLahir.equals(tableModel.getValueAt(baris,3));
            if ("Direktur".equals(tableModel.getValueAt(baris, 4).toString())) {
                cbJabatan.setSelectedIndex(1);
            } else if ("Manajer".equals(tableModel.getValueAt(baris, 4).toString())) {
                cbJabatan.setSelectedIndex(2);
            } else if ("Karyawan".equals(tableModel.getValueAt(baris, 4).toString())) {
                cbJabatan.setSelectedIndex(3);
            }
        }
    }
    
    public void ubahKry() {
        String nip = txtNip.getText();
        String nama = txtNama.getText();
        
        String jk = (rdLaki.isSelected()? "Laki-Laki":"Perempuan");
        String jabatan = (String) cbJabatan.getSelectedItem();
        
        try {
            String sql = "UPDATE tblkry SET nama = '" + nama + 
                    "', jenis_kelamin = '" + jk + 
                    "', jabatan = '" + jabatan +
                    "' WHERE nip = '" + nip + "'";
            
            PreparedStatement stat = db.getKoneksi().prepareStatement(sql);
            
            try {
                stat.executeUpdate(sql);
                baru();
            } catch (SQLException se) {
                JOptionPane.showMessageDialog(null, 
                        "Gagal Update Data : " + se.getMessage(), "Informasi",
                        JOptionPane.ERROR_MESSAGE);
            }
            
            stat.close();
        } catch (Exception e) {
            
        }
        
        hapusTblKry();
        tampilKry();
        baru();
    }
    
    public void hapusKry() {
        String nip = txtNip.getText();
        
        if (JOptionPane.showConfirmDialog(null, 
                "Apakah Yakin Data Dihapus '" + nip + "'", "Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 
                JOptionPane.YES_OPTION) {
            
            try {
                String sql = "DELETE FROM tblkry WHERE nip = '" + nip + "'";
                PreparedStatement stat = db.getKoneksi().prepareStatement(sql);
                
                try {
                    stat.executeUpdate(sql);
                    baru();
                } catch (SQLException se) {
                    JOptionPane.showMessageDialog(null, 
                            "Proses Hapus Gagal : " + se.getMessage(),
                            "Informasi", JOptionPane.ERROR_MESSAGE);
                    txtNip.requestFocus();
                }
                stat.close();
            } catch (Exception e) {
                
            }
        }
        hapusTblKry();
        tampilKry();
    }
    
    public void hapusTblKry() {
        
    }
    
    private void aturText(boolean nip, boolean nama, boolean jk, boolean jabatan) {
        txtNip.setEnabled(nip);
        txtNama.setEnabled(nama);
        rdLaki.setEnabled(jk);
        rdPerem.setEnabled(jk);
        cbJabatan.setEnabled(jabatan);
    }
    
    public void baru() {
        txtNip.requestFocus();
        txtNip.setText("");
        txtNama.setText("");
        rdLaki.setSelected(false);
        rdPerem.setSelected(false);
        cbJabatan.setSelectedIndex(0);
        
        status = false;
        aturText(true, true, true, true);
    }
    
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
            java.util.logging.Logger.getLogger(data_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTutup;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbJabatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerem;
    private javax.swing.JTable tblKry;
    private com.toedter.calendar.JDateChooser tglLahir;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNip;
    // End of variables declaration//GEN-END:variables
}
