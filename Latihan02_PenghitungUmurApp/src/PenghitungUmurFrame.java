import java.time.LocalDate;
import java.time.Period;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PenghitungUmurFrame extends javax.swing.JFrame {

    private JTextField txtTanggalLahir;
    private JTextArea txtAreaHariPenting, txtAreaPeristiwa;
    private JButton btnCek;

    public PenghitungUmurFrame() {
        initComponents(); // Inisialisasi GUI
    }

    // Method untuk menginisialisasi komponen GUI
    private void initComponents() {
        // Frame utama
        setTitle("Penghitung Umur dan Hari Penting");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(null);

        // Label untuk tanggal lahir
        JLabel lblTanggalLahir = new JLabel("Tanggal Lahir (yyyy-MM-dd):");
        lblTanggalLahir.setBounds(20, 20, 200, 25);
        add(lblTanggalLahir);

        // Input tanggal lahir
        txtTanggalLahir = new JTextField();
        txtTanggalLahir.setBounds(220, 20, 150, 25);
        add(txtTanggalLahir);

        // Tombol cek
        btnCek = new JButton("Cek");
        btnCek.setBounds(380, 20, 80, 25);
        add(btnCek);

        // Area untuk hari penting
        JLabel lblHariPenting = new JLabel("Hari Penting:");
        lblHariPenting.setBounds(20, 60, 200, 25);
        add(lblHariPenting);

        txtAreaHariPenting = new JTextArea();
        txtAreaHariPenting.setBounds(20, 90, 440, 50);
        txtAreaHariPenting.setLineWrap(true);
        txtAreaHariPenting.setWrapStyleWord(true);
        txtAreaHariPenting.setEditable(false);
        add(txtAreaHariPenting);

        // Area untuk peristiwa
        JLabel lblPeristiwa = new JLabel("Peristiwa Penting:");
        lblPeristiwa.setBounds(20, 160, 200, 25);
        add(lblPeristiwa);

        txtAreaPeristiwa = new JTextArea();
        txtAreaPeristiwa.setBounds(20, 190, 440, 150);
        txtAreaPeristiwa.setLineWrap(true);
        txtAreaPeristiwa.setWrapStyleWord(true);
        txtAreaPeristiwa.setEditable(false);
        add(txtAreaPeristiwa);

        // Event listener untuk tombol cek
        btnCek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cekHariDanPeristiwa();
            }
        });
    }

    // Method untuk cek hari penting dan peristiwa
    private void cekHariDanPeristiwa() {
        try {
            // Ambil tanggal dari input pengguna
            LocalDate tanggalLahir = LocalDate.parse(txtTanggalLahir.getText());
            LocalDate sekarang = LocalDate.now();

            // Perhitungan umur
            String umur = hitungUmurDetail(tanggalLahir, sekarang);

            // Hari penting dan peristiwa
            tampilkanPeristiwaDanHariPenting(sekarang, txtAreaPeristiwa, txtAreaHariPenting);

            // Tampilkan umur
            txtAreaHariPenting.append("\nUmur Anda: " + umur);

        } catch (Exception ex) {
            txtAreaHariPenting.setText("Format tanggal salah. Gunakan format yyyy-MM-dd.");
        }
    }

    // Metode menghitung umur
    public String hitungUmurDetail(LocalDate lahir, LocalDate sekarang) {
        Period period = Period.between(lahir, sekarang);
        return period.getYears() + " tahun, " + period.getMonths() + " bulan, " + period.getDays() + " hari";
    }

    // Metode hari penting dan peristiwa (dari kode sebelumnya)
    public void tampilkanPeristiwaDanHariPenting(LocalDate tanggal, JTextArea txtAreaPeristiwa, JTextArea txtAreaHariPenting) {
        // Implementasi hari penting lokal
        tampilkanHariPenting(tanggal, txtAreaHariPenting);

        // Ambil peristiwa dari API (implementasi sebelumnya)
        // getPeristiwaBarisPerBaris(tanggal, txtAreaPeristiwa, () -> false);
        txtAreaPeristiwa.append("Fitur API peristiwa belum diimplementasikan sepenuhnya.");
    }

    // Menampilkan hari penting
    public void tampilkanHariPenting(LocalDate tanggal, JTextArea txtAreaHariPenting) {
        // Contoh data hari penting
        if (tanggal.getMonthValue() == 8 && tanggal.getDayOfMonth() == 17) {
            txtAreaHariPenting.setText("Hari Penting: Hari Kemerdekaan Indonesia");
        } else {
            txtAreaHariPenting.setText("Tidak ada hari penting pada tanggal ini.");
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new PenghitungUmurFrame().setVisible(true);
        });
    }
}
