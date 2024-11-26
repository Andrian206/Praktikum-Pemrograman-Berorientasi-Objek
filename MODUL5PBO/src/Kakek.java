public class Kakek {
        protected String NameKakek;
    protected String Address;
    public Kakek(){
        System.out.println("\n Program Demo Inheritance");
        System.out.println("============================");
        System.out.println("Masukan konstruktor kakek");
        System.out.println("-Dijalankan oleh class bapak-");
        NameKakek = "Joyo Cokro Aminoto";
        Address = "Sleman Djogjakarta";
    }
    public Kakek(String Nama, String Address){
        this.NameKakek = NameKakek;
        this.Address = Address;
    }
    public String getNama(){
        return NameKakek;
    }
    public String getAddress(){
        return Address;
    }

}
