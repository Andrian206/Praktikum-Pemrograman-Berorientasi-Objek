import javax.swing.*;

class Praktikum2 {
    public static void main (String[] args) {
        String nama, kota;
        nama = JOptionPane.showInputDialog("Nama anda   : ");
        kota = JOptionPane.showInputDialog("Kota asal   : ");
        System.out.println("Selamat Datang " +nama+ " dari "+kota);
        System.exit(0);
    }
}
