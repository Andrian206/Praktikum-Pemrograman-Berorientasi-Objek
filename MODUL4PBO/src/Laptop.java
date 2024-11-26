public class Laptop {
    String nama;
    int ram = 8, rom = 512;
    public Laptop(String nama){
        this.nama = nama;
    }
    public Laptop(String nama, int ram){
        this.nama = nama;
        this.ram = ram;
    }
    public Laptop(String nama, int ram, int rom){
        this.nama = nama;
        this.ram = ram;
        this.rom = rom;
    }
    public void tampil(){
        System.out.println("Nama    : " + nama);
        System.out.println("Ram     : " + ram);
        System.out.println("Rom     : " + rom + "\n");
    }
}
