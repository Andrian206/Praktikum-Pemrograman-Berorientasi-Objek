abstract class Brand {
    static final String merk = "Samsung";
    public abstract String Nama();
    public String NameBrand(){
        return merk;
    }
}
class Hp extends Brand {
String NamaKtgr;
@Override
public String Nama(){
    NamaKtgr = "Smartphone";
    return NamaKtgr;
    }
}
class Tab extends Brand {
String NamaKtgr;
@Override
public String Nama(){
    NamaKtgr = "Tablet";
    return NamaKtgr;
    }
}
class S24 extends Hp {
    void Detail(){
        System.out.println("Nama        : Samsung S24+");
        System.out.println("Kategori    : " + Nama());
        System.out.println("Brand       : " + NameBrand());
    }
}
class STab extends Tab {
    void Detail(){
        System.out.println("Nama        : Samsung S Tab");
        System.out.println("Kategori    : " + Nama());
        System.out.println("Brand       : " + NameBrand());
    }
}
class Run {
    public static void main (String[] args){
        S24 Sd = new S24();
        STab St = new STab();
        Sd.Detail();
        System.out.println("========================================");
        St.Detail();
    }
}

