public class Smartphone {
    String nama, brand, ram, rom;
    Smartphone(){
        this.nama = "Redmi 10C";
        this.brand = "Xiaomi";
        this.ram = "4 Gb";
        this.rom = "64 Gb";
    }
    Smartphone(String nama, String brand, String ram, String rom){
        this.nama = nama;
        this.brand = brand;
        this.ram = ram;
        this.rom = rom;
    }
    public static void main (String[] args){
        Smartphone sp = new Smartphone();
        System.out.println("Nama    : " + sp.nama);
        System.out.println("Brand   : " + sp.brand);
        System.out.println("Ram     : " + sp.ram);
        System.out.println("Rom     : " + sp.rom);
    }
}
