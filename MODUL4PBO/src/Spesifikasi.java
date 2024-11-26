import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Spesifikasi {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Spesifikasi Smartphone");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));
        JLabel namaLabel = new JLabel("Nama :");
        JTextField namaField = new JTextField();
        JLabel brandLabel = new JLabel("Brand :");
        JTextField brandField = new JTextField();
        JLabel prosesorLabel = new JLabel("Prosesor :");
        JTextField prosesorField = new JTextField();
        JButton printButton = new JButton("Cetak");
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = namaField.getText();
                String brand = brandField.getText();
                String prosesor = prosesorField.getText();
                JOptionPane.showMessageDialog(frame, "Nama: " + nama + "\nBrand: " + brand + "\nProsesor: " + prosesor);
            }
        });
        frame.add(namaLabel);
        frame.add(namaField);
        frame.add(brandLabel);
        frame.add(brandField);
        frame.add(prosesorLabel);
        frame.add(prosesorField);
        frame.add(new JLabel()); 
        frame.add(printButton);
        frame.setVisible(true);
    }
}

