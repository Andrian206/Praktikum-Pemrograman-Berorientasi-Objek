package TugasM8;
public class MahasiswaSuper implements Mahasiswa, Atlet, Wiraswasta {
    @Override
    public void Nama() {
       System.out.println("Nama         : Rio Andika Andriansyah");
    }
    @Override
    public void Nim() {
       System.out.println("NIM          : 20230810155");
    }
    @Override
    public void Kelas() {
       System.out.println("Kelas        : TINFC - 2023 - 04");
    }
    @Override
    public void Kendaraan() {
       System.out.println("Kendaraan    : Motor");
    }
    @Override
    public void Olahraga() {
       System.out.println("Olahraga     : Skipping");
    }
    @Override
    public void Waktu() {
       System.out.println("Waktu        : 19:00");
    }
    @Override
    public void Tempat() {
       System.out.println("Tempat       : Teras");
    }
    @Override
    public void Usaha() {
       System.out.println("Usaha        : Penjualan Ikan Cupang dan Guppy");
    }
    @Override
    public void Lokasi() {
       System.out.println("Lokasi       : Rumah");
    }
    @Override
    public void NoTelpon() {
       System.out.println("No Telpon    : 08977072765");
    }
}
class Main {
    public static void main (String[] args){
        MahasiswaSuper ms = new MahasiswaSuper();
        System.out.println("========================================");
        ms.Nama();
        ms.Nim();
        ms.Kelas();
        ms.Kendaraan();
        System.out.println("========================================");
        ms.Olahraga();
        ms.Waktu();
        ms.Tempat();
        System.out.println("========================================");
        ms.Usaha();
        ms.Lokasi();
        ms.NoTelpon();
    }
}
