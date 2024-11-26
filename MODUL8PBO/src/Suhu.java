public interface Suhu {
    public void NaikkanSuhu();
    public void TurunkanSuhu();
}
class Kipas implements Suhu {
    @Override
    public void NaikkanSuhu(){
        System.out.println("Pencet tombol off kecepatan untuk menaikkan suhu");
    }
    @Override
    public void TurunkanSuhu(){
        System.out.println("Pencet tombol on kecepatan untuk menurunkan suhu");
    }
}
class AC implements Suhu {
    @Override
    public void NaikkanSuhu(){
        System.out.println("Pencet tombol off atau tingkatkan suhu pada remote untuk menaikkan suhu");
    }
    @Override
    public void TurunkanSuhu(){
        System.out.println("Pencet tombol on atau turunkan suhu pada remote untuk menurunkan suhu");
    }
}
class Main {
    public static void main (String[] args){
        Kipas k1 = new Kipas();
        AC ac = new AC();
        System.out.println("Tutorial menggunakan Kipas");
        System.out.println("================================================================================");
        System.out.println("Ketika kamar dingin : ");
        k1.NaikkanSuhu();
        System.out.println("Ketika kamar panas : ");
        k1.TurunkanSuhu();
        System.out.println("Tutorial menggunakan AC");
        System.out.println("================================================================================");
        System.out.println("Ketika kamar dingin : ");
        ac.NaikkanSuhu();
        System.out.println("Ketika kamar panas : ");
        ac.TurunkanSuhu();   
    }
}
