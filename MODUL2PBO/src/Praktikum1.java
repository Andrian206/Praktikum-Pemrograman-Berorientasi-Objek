import java.io.*;

class Praktikum1 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String nama, kota;
        System.out.print("Nama anda     : ");
        nama = br.readLine();
        System.out.print("Kota Asal     : ");
        kota = br.readLine();
        System.out.println("Selamat Datang " +nama+ " dari "+kota);
    }
}
