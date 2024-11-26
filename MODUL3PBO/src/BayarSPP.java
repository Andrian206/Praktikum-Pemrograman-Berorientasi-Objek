import java.io.*;
public class BayarSPP {
    public static void main (String[] args) throws IOException {
        // Deklarasi Variabel
        String nama, nim;
        int spt, spv, sks;
        // Proses Instansiasi Objek dengan Inputan Manual
        SPP bayar = new SPP("Irfan", "12.12.1234", 950000, 70000, 24);
        // Input
        // Langkah 1 : Menginisialisasi BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Langkah 2 : Proses Input
        System.out.print ("Nama \t\t: ");nama = br.readLine();
        System.out.print ("NIM \t\t: ");nim = br.readLine();
        System.out.print ("SPP Tetap \t: ");spt = Integer.parseInt(br.readLine());
        System.out.print ("SPP Variabel \t: ");spv = Integer.parseInt(br.readLine());
        System.out.print ("SKS \t\t: ");sks = Integer.parseInt(br.readLine());
        // Proses Instansiasi Objek dengan Inputan
        SPP bayar2 = new SPP(nama, nim, spt, spv, sks);
        // Output Perhitungan dengan Inputan Manual
        System.out.println ("\n\n\n--------------- PROGRAM PERHITUNGAN SPP MANUAL ---------------\n");
        System.out.println ("Nama \t\t: " +bayar.nama);
        System.out.println ("NIM \t\t: " +bayar.nim);
        System.out.println ("SPP tetap \t: "+bayar.spt);
        System.out.println ("SPP Variabel \t: "+bayar.spv);
        System.out.println ("SKS \t\t: "+bayar.sks);
        System.out.println ("Total SPP yang harus dibayarkan : Rp " + bayar.hitung() + ",-\n");
        System.out.println ("--------------- TERIMA KASIH ---------------\n\n");
        // Output Perhitungan dengan Inputan
        System.out.println("\n-------------- PROGRAM PERHITUNGAN SPP OTOMATIS --------------\n");
        System.out.println("Nama \t\t: " +bayar2.nama);
        System.out.println("NIM \t\t: " +bayar2.nim);
        System.out.println("SPP tetap \t: "+bayar2.spt);
        System.out.println("SPP Variabel \t: "+bayar2.spv);
        System.out.println("SKS \t\t: "+bayar2.sks);
        System.out.println("Total SPP yang harus dibayarkan : Rp " + bayar2.hitung() + ",-\n");
        System.out.println("--------------------- TERIMA KASIH ---------------------\n");
    }
}
