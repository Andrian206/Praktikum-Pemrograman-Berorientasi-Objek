public class SPP {
    String nama, nim; int spt, spv, sks;
    // construktor dengan parameter
    public SPP (String nama, String nim, int spt, int spv, int sks){
        this.nama = nama; this.nim = nim;
        this.spt = spt;
        this.spv = spv;
        this.sks = sks;
    }
    // Method hitung dengan tipe int
    public int hitung(){
        // Method non - void harus ada nilai kembalian / return value
        return (spt + (spv * sks));
    }
}
