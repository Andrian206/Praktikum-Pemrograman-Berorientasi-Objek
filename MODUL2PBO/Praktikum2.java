import javax.swing.*;

class Praktikum2 {
    public static void main (String[] args) {
        String nama, kota;
        nama = JOptionPane.showInputDialod("Nama anda   : ");
        kota = JOptionPane.showInputDialod("Kota asal   : ");
        System.out.println("Selamat Datang " +nama+ " dari "+kota);
        System.exit(0);
    }
}

