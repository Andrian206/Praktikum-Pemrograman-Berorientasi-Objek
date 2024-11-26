public interface WIFI{
    public void TambahMBPS();
    public void KurangiMBPS();
}
class indihome implements WIFI{
    @Override
    public void TambahMBPS(){
        System.out.println("bicara kepada seller");
    }
    @Override
    public void KurangiMBPS(){
        System.out.println("bicara ke counter");
    }
}
class Starlink implements WIFI{
    @Override
    public void TambahMBPS(){
        System.out.println("bicara kepada Seller");
    }
    @Override
    public void KurangiMBPS(){
        System.out.println("bicara ke Elon musk");
    }
}
class TestKecepatan{
    public static void main(String[]args){
        indihome IN = new indihome();
        Starlink SL = new Starlink();
        System.out.println("Cara percepat Wifi");
        SL.TambahMBPS();
        System.out.println("cara berhenti langganan");
        SL.KurangiMBPS();
        System.out.println("cara bayar indihome");
        IN.TambahMBPS();
        System.out.println("cara berhenti langganan");
        IN.KurangiMBPS();
    }
}
