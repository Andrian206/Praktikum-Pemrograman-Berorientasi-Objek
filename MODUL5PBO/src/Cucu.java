public class Cucu extends Bapak{
    protected String NameCucu;
    protected String AddressCucu;
    public Cucu(){
        System.out.println("============================");
        System.out.println("Nama Bapak     : " + NameBapak);
        System.out.println("Address Bapak  : " + AddressBapak);
        System.out.println("\n");
        System.out.println("Masukan konstruktor cucu");
        System.out.println("-Dijalankan oleh class cicit-");
        NameCucu = "Rio Andriyat Krismawan";
        AddressCucu = "Kuningan";
    }
    public Cucu(String NameCucu, String AddressCucu){
        this.NameCucu = NameCucu;
        this.AddressCucu = AddressCucu;
    }
    @Override
    public String getNama(){
        return NameCucu;
    }
    @Override
    public String getAddress(){
        return AddressCucu;
    }
}

