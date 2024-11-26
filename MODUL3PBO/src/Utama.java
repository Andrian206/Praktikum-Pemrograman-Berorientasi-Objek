import java.io.*;
class Utama {
    public static void main (String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Instant Class
    Mobil mb =  new Mobil();
    // Input
    System.out.print ("Masukan Merk Mobil = ");
    String merk_mobil = br.readLine();
    System.out.print ("Masukan Type Mobil = ");
    String type_mobil = br.readLine();
    System.out.print ("Masukan Warna Mobil = ");
    String warna_mobil = br.readLine();
    System.out.print ("Masukan Harga Mobil = ");
    double harga_mobil = Double.parseDouble (br.readLine());
    mb.setMerk (merk_mobil);
    mb.setType (type_mobil);
    mb.setWarna (warna_mobil);
    mb.setHarga (harga_mobil);
    // Output
    System.out.println ("Daftar Merk, Type, Warna dan Harga Mobil");
    System.out.println ("Merk Mobil \t: " + mb.getMerk());
    System.out.println ("Type Mobil \t: " + mb.getType());
    System.out.println ("Warna Mobil \t: " + mb.getWarna());
    System.out.println ("Harga Mobil sebelum di Diskon \t: " + mb.getHarga());
    mb.Keterangan();
    }
}
