public class Cirebon extends Kuningan {
    protected String PemilikCabang;
    protected String LokasiCabang;
    public Cirebon(){
        System.out.println("Nama Pemilik Franchise  : " +NamaPemilik);
        System.out.println("Nama Bisnis             : " +NamaToko);
        System.out.println("Asal Pemilik            : " +Lokasi);
        System.out.println("========================================");
        PemilikCabang = "Rian LED";
        LokasiCabang = "Cirebon";
    }
    public Cirebon (String PemilikCabang, String LokasiCabang){
        this.PemilikCabang = PemilikCabang;
        this.LokasiCabang = LokasiCabang;
    }
    public String getNama(){
        return PemilikCabang;
    }
    public String getLokasiCabangi(){
        return LokasiCabang;
    }
    public static void main (String[] args){
        Cirebon c1 = new Cirebon();
    }
}
