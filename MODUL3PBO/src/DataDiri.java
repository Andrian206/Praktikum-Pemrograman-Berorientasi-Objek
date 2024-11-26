class Orang {
    String nama, gender;
    int usia;
    public String tampilNama(){
        return nama;
    }
    public void caraBerjalan(){
        System.out.println ("Tangan Ditaruh Kebelakang");
    }
    int usiaSekarang(){
        return usia;
    }
}
public class DataDiri {
    public static void main (String[] args){
        Orang org = new Orang();
        org.nama = "Suci";
        org.usia = 25;
        System.out.println("Nama : "+org.tampilNama());
        System.out.println("Usia : "+org.usiaSekarang());
        System.out.print("Cara Berjalan ");
        org.caraBerjalan();
    }
}
