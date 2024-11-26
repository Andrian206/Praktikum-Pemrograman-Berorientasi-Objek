class Individu {
    String nm, nim;
    public String tampilkanNama(){
        return nm;
    }
    public String tampilkanNIM(){
        return nim;
    }
    public void Belajar(){
        System.out.print ("Connecting The Dots");
    }
    public void Olahraga(){
        System.out.print ("Jogging");
    }
    public void Makan(){
        System.out.print ("Menggunakan Sendok");
    }
    public void Minum(){
        System.out.print ("Menggunakan Gelas");
    }
}
public class Mahasiswa {
    public static void main (String[] args){
        Individu id = new Individu();
        id.nm = "Rio Andika Andriansyah";
        id.nim = "20230810155";
        System.out.println ("Nama       : "+id.tampilkanNama());
        System.out.println ("NIM        : "+id.tampilkanNIM());
        System.out.print ("Belajar menggunakan metode ");
        id.Belajar();
        System.out.print (", Olahraga yang disukai adalah ");
        id.Olahraga();
        System.out.print (", makan ");
        id.Makan();
        System.out.print (" dan minum ");
        id.Minum();
        
    }
}
 