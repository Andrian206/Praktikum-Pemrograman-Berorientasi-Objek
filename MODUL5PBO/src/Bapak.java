public class Bapak extends Kakek{
    protected String NameBapak;
    protected String AddressBapak;
    public Bapak(){
        System.out.println("============================");
        System.out.println("Nama Kakek      : " + NameKakek);
        System.out.println("Address Kakek   : " + Address);
        System.out.println("\n");
        System.out.println("Masukan konstruktor bapak");
        System.out.println("-Dijalankan oleh class cucu-");
        NameBapak = "Rohaedi";
        AddressBapak = "Kuningan";
    }
    public Bapak(String NameBapak, String AddressBapak){
        this.NameBapak = NameBapak;
        this.AddressBapak = AddressBapak;
    }
    public String getNama(){
        return NameBapak;
    }
    public String getAddress(){
        return AddressBapak;
    }
    public static void main(String[]args){
        Bapak sari = new Bapak();
    }
}

