import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Bio {
    private JFrame fr;
    private JTextField NIM;
    private JTextField Nama;
    private JTextField Alamat;
    private JComboBox<String> ProgramStudi;
    private JComboBox<String> Jurusan;
    private JButton Simpan;
    private JButton Baca;
    private JButton Keluar;
    private JRadioButton priaRadioButton;
    private JRadioButton wanitaRadioButton;
    public Bio() {
        fr = new JFrame("Biodata Mahasiswa");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        JLabel nimLabel = new JLabel("    NIM");
        NIM = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 0;
        fr.add(nimLabel, gbc);
        gbc.gridx = 1;
        fr.add(NIM, gbc);
        JLabel namaLabel = new JLabel("    Nama");
        Nama = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 1;
        fr.add(namaLabel, gbc);
        gbc.gridx = 1;
        fr.add(Nama, gbc);
        JLabel alamatLabel = new JLabel("    Alamat");
        Alamat = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 2;
        fr.add(alamatLabel, gbc);
        gbc.gridx = 1;
        fr.add(Alamat, gbc);
        JLabel jenisKelaminLabel = new JLabel("    Jenis Kelamin");
        priaRadioButton = new JRadioButton("Pria");
        wanitaRadioButton = new JRadioButton("Wanita");
        ButtonGroup jenisKelaminGroup = new ButtonGroup();
        jenisKelaminGroup.add(priaRadioButton);
        jenisKelaminGroup.add(wanitaRadioButton);
        gbc.gridx = 0;
        gbc.gridy = 3;
        fr.add(jenisKelaminLabel, gbc);
        gbc.gridx = 1;
        fr.add(priaRadioButton, gbc);
        gbc.gridx = 2;
        fr.add(wanitaRadioButton, gbc);
        JLabel programStudiLabel = new JLabel("    Program Studi");
        String[] programStudiOptions = {"S1", "S2", "S3", "D1", "D2", "D3", "D4"};
        ProgramStudi = new JComboBox<>(programStudiOptions);
        gbc.gridx = 0;
        gbc.gridy = 4;
        fr.add(programStudiLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        fr.add(ProgramStudi, gbc);
        gbc.gridwidth = 1;
        JLabel jurusanLabel = new JLabel("    Jurusan");
        String[] jurusanOptions = {"Sistem Informasi", "Teknik Informatika", "Desain Komunikasi Visual", "Teknik Sipil", "Manajemen Informatika"};
        Jurusan = new JComboBox<>(jurusanOptions);
        gbc.gridx = 0;
        gbc.gridy = 5;
        fr.add(jurusanLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        fr.add(Jurusan, gbc);
        gbc.gridwidth = 1;
        Simpan = new JButton("Simpan");
        Baca = new JButton("Baca Data");
        Keluar = new JButton("Keluar");
        gbc.gridx = 0;
        gbc.gridy = 6;
        fr.add(Simpan, gbc);
        gbc.gridx = 1;
        fr.add(Baca, gbc);
        gbc.gridx = 2;
        fr.add(Keluar, gbc);
        Simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String nim = NIM.getText();
            String nama = Nama.getText();
            String alamat = Alamat.getText();
            String jenisKelamin = priaRadioButton.isSelected() ? "Pria" : "Wanita";
            String programStudi = (String) ProgramStudi.getSelectedItem();
            String jurusan = (String) Jurusan.getSelectedItem();
            String output = String.format("NIM          : %s\nNama        : %s\nAlamat       : %s\nJenis Kelamin     : %s\nProgram Studi     : %s\nJurusan       : %s",
            nim, nama, alamat, jenisKelamin, programStudi, jurusan);
            System.out.println(output);
            JOptionPane.showMessageDialog(fr, output, "Biodata Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        Baca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            System.out.println("Data dibaca");
        }
        });
        Keluar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        System.exit(0);
        }
        });
        fr.pack();
        fr.setVisible(true);
        }
        public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
        new Bio();
        }
        });
    }
}
