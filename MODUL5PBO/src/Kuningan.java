public class Kuningan {
    protected String NamaPemilik;
    protected String NamaToko;
    protected String Lokasi;
    public Kuningan(){
        System.out.println("Franchise Bayu Kokonat");
        System.out.println("========================================");
        NamaPemilik = "Bayu Cibaduyut";
        NamaToko = "Ceker Pedas Ambadas";
        Lokasi = "Kuningan";
    }
    public Kuningan (String NamaPemilik, String Lokasi){
        this.NamaPemilik = NamaPemilik;
        this.Lokasi = Lokasi;
    }
    public String getName(){
        return NamaPemilik;
    }
    public String getToko(){
        return NamaToko;
    }
    public String getLokasi(){
        return Lokasi;
    }
}
