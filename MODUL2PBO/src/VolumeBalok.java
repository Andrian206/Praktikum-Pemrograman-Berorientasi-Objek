import javax.swing.*;

public class VolumeBalok {
    // Deklarasi Method Utama
    public static void main (String[] args) {
        double volume;
        // Instant Object dari Class Balok
        Balok b1 = new Balok();
        // Input
        b1.panjang = Double.parseDouble(JOptionPane.showInputDialog("Panjang   : "));
        b1.lebar = Double.parseDouble(JOptionPane.showInputDialog ("Lebar     : "));
        b1.tinggi = Double.parseDouble(JOptionPane.showInputDialog("Tinggi    : "));
        // Hitung
        volume = b1.panjang * b1.lebar * b1.tinggi;
        System.out.println("Volume Balok = " +volume+ " cm^3");
        System.exit(0);
    }
}
