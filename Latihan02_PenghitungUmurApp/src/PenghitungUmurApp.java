/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rahma
 */
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public class PenghitungUmurApp extends javax.swing.JFrame {
private PenghitungUmurFrame Frame;
private volatile boolean stopFetching = false;
private Thread peristiwaThread;
/**
* Creates new form PenghitungUmurFrame
*/
public PenghitungUmurApp() {
initComponents();
jDateChooser1.setDateFormatString("dd-MM-yyyy");
Frame = new PenghitungUmurFrame();
    /**
     * Creates new form PenghitungUmurApp
     */

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
        lblAplikasi = new javax.swing.JLabel();
        lblTGL = new javax.swing.JLabel();
        lblUmur = new javax.swing.JLabel();
        lblUltah = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        BtnHitung = new javax.swing.JButton();
        BtnKeluar = new javax.swing.JButton();
        txtUmur = new javax.swing.JTextField();
        txtUltah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPeristiwa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        lblAplikasi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAplikasi.setText("Aplikasi Penghitung Umur");

        lblTGL.setText("Pilih Tanggal Lahir");

        lblUmur.setText("Umur Anda");

        lblUltah.setText("Hari Ulang Tahun Berikutnya");

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        BtnHitung.setText("Hitung Umur");
        BtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHitungActionPerformed(evt);
            }
        });

        BtnKeluar.setText("Keluar");
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });

        txtUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmurActionPerformed(evt);
            }
        });

        txtAreaPeristiwa.setColumns(20);
        txtAreaPeristiwa.setRows(5);
        jScrollPane1.setViewportView(txtAreaPeristiwa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblAplikasi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTGL)
                                    .addComponent(lblUmur)
                                    .addComponent(lblUltah))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtUmur)
                                    .addComponent(txtUltah))))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAplikasi)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTGL)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnHitung)
                                .addComponent(BtnKeluar)))
                        .addGap(18, 18, 18)
                        .addComponent(lblUmur))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUltah)
                    .addComponent(txtUltah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHitungActionPerformed
Date tanggalLahir = jDateChooser1.getDate();
        if (tanggalLahir != null) {
            txtUmur.setText("Pilih tanggal lahir!");
            txtUltah.setText("");
            LocalDate lahir = tanggalLahir.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate sekarang = LocalDate.now();

            long umurTahun = ChronoUnit.YEARS.between(lahir, sekarang);
            LocalDate setelahTahun = lahir.plusYears(umurTahun);
            long umurBulan = ChronoUnit.MONTHS.between(setelahTahun, sekarang);
            LocalDate setelahBulan = setelahTahun.plusMonths(umurBulan);
            long umurHari = ChronoUnit.DAYS.between(setelahBulan, sekarang);

            txtUmur.setText(umurTahun + " tahun, " + umurBulan + " bulan, " + umurHari + " hari");

            LocalDate ulangTahunBerikutnya = lahir.withYear(sekarang.getYear());
            if (ulangTahunBerikutnya.isBefore(sekarang) || ulangTahunBerikutnya.isEqual(sekarang)) {
                ulangTahunBerikutnya = ulangTahunBerikutnya.plusYears(1);
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd-MM-yyyy");
            String ulangTahunStr = ulangTahunBerikutnya.format(formatter);
            txtUltah.setText(ulangTahunStr);

            // Menampilkan informasi tambahan
            stopFetching = false;
            if (peristiwaThread != null && peristiwaThread.isAlive()) {
                peristiwaThread.interrupt();
            }
            peristiwaThread = new Thread(() -> {
                try {
                    txtAreaPeristiwa.setText("Mendapatkan informasi tambahan...\n");
                    // Tambahkan logika lain untuk mendapatkan informasi tambahan
                    Thread.sleep(2000); // Simulasi waktu pengambilan data
                    txtAreaPeristiwa.append("Informasi berhasil diambil!");
                } catch (InterruptedException e) {
                    txtAreaPeristiwa.setText("Pengambilan informasi dibatalkan.");
                }
            });
            peristiwaThread.start();
        } else {
            txtUmur.setText("Pilih tanggal lahir!");
            txtUltah.setText("");
        }
          // TODO add your handling code here:
    }//GEN-LAST:event_BtnHitungActionPerformed

    private void txtUmurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUmurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUmurActionPerformed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
 stopFetching = true;
    if (peristiwaThread != null && peristiwaThread.isAlive()) {
        peristiwaThread.interrupt(); // Hentikan thread
    }
    System.exit(0);      // TODO add your handling code here:
    }//GEN-LAST:event_BtnKeluarActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
{
txtUmur.setText("");
txtUltah.setText("");
}// TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1PropertyChange

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
            java.util.logging.Logger.getLogger(PenghitungUmurApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmurApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmurApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmurApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungUmurApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHitung;
    private javax.swing.JButton BtnKeluar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAplikasi;
    private javax.swing.JLabel lblTGL;
    private javax.swing.JLabel lblUltah;
    private javax.swing.JLabel lblUmur;
    private javax.swing.JTextArea txtAreaPeristiwa;
    private javax.swing.JTextField txtUltah;
    private javax.swing.JTextField txtUmur;
    // End of variables declaration//GEN-END:variables
}
