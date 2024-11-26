import java.io.*;
import java.util.Scanner;

class Manusia {
    private String Nama, Alamat, JenisKelamin;

    public Manusia(String Nama, String Alamat, String JenisKelamin) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.JenisKelamin = JenisKelamin;
    }
    public String getNm() {
        return Nama;
    }
    public String getAlmt() {
        return Alamat; 
    }
    public String getJk() { 
        return JenisKelamin; 
    }
    public void setNm(String Nama) { 
        this.Nama = Nama;
    }
    public void setAlamat(String Alamat) { 
        this.Alamat = Alamat; 
    }
    public void setJenisKelamin(String JenisKelamin) { 
        this.JenisKelamin = JenisKelamin; 
    }
    public String Tampil() {
    return "Nama            : " + Nama + "\nAlamat      : " + Alamat + "\nJenis Kelamin : " + JenisKelamin;
    }
}
class Mahasiswa extends Manusia {
    private String Nim, ProgramStudi, Jurusan;

    public Mahasiswa(String Nama, String Alamat, String JenisKelamin, String Nim, String ProgramStudi, String Jurusan) {
        super(Nama, Alamat, JenisKelamin);
        this.Nim = Nim;
        this.ProgramStudi = ProgramStudi;
        this.Jurusan = Jurusan;
    }
    public String getNim() { 
        return Nim; 
    }
    public String getPrstd() { 
        return ProgramStudi; 
    }
    public String getJrsn() { 
        return Jurusan; 
    }
    public void setNim(String Nim) { 
        this.Nim = Nim; 
    }
    public void setPrstd(String ProgramStudi) { 
        this.ProgramStudi = ProgramStudi; 
    }
    public void setJrsn(String Jurusan) { 
        this.Jurusan = Jurusan; 
    }
    @Override
    public String Tampil() {
        return super.toString() + "\nNIM        : " + Nim + "\nProgram Studi    : " + ProgramStudi + "\nJurusan     : " + Jurusan;
    }
}
public class Utama {
    private static final String FILE_NAME = "DataMahasiswa.data";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
    while (running) {
        System.out.println("\nMenu Pilihan");
        System.out.println("========================================");
        System.out.println("1. Input Data Mahasiswa");
        System.out.println("2. Lihat Data Mahasiswa");
        System.out.println("3. Keluar Program");
        System.out.println("========================================");
        System.out.print("Pilihan Anda    : ");
        int Opsi = sc.nextInt();
        sc.nextLine();
        switch (Opsi) {
            case 1:
            InputData(sc);
            break;
            case 2:
            LihatData();
            break;
            case 3:
            running = false;
            System.out.println("Program selesai.");
            break;
            default:
            System.out.println("Pilihan tidak valid.");
            break;
        }
    }
    sc.close();
}
private static void InputData(Scanner sc) {
    System.out.println("========================================");
    System.out.println("Masukkan data Mahasiswa");
    System.out.println("========================================");
    System.out.print("Nama          : ");
    String Nama = sc.nextLine();
    System.out.print("Alamat        : ");
    String Alamat = sc.nextLine();
    System.out.print("Jenis Kelamin : ");
    String JenisKelamin = sc.nextLine();
    System.out.print("NIM           : ");
    String Nim = sc.nextLine();
    System.out.print("Program Studi : ");
    String ProgramStudi = sc.nextLine();
    System.out.print("Jurusan       : ");
    String Jurusan = sc.nextLine();
    
    Mahasiswa mh = new Mahasiswa(Nama, Alamat, JenisKelamin, Nim, ProgramStudi, Jurusan);
    
    try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
        os.writeObject(mh);
        System.out.println("Data mahasiswa berhasil disimpan dengan aman.");
    } 
    catch (IOException e) {
        System.err.println("Data mahasiswa gagal tersimpan : " + e.getMessage());
    }
}
private static void LihatData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Mahasiswa mhsDariFile = (Mahasiswa) ois.readObject();
            System.out.println("\nData Mahasiswa dari file      :");
            System.out.println("========================================");
            System.out.println(mhsDariFile);
        } 
        catch (IOException | ClassNotFoundException e) {
            System.err.println("Gagal membaca data mahasiswa    : " + e.getMessage());
        }
    }
}
