// Deklarasi Class
public class Balok {
    // Deklarasi Attribute
    double panjang, lebar, tinggi;
    // Deklarasi Setter
    public void setPanjang (double panjang){this.panjang = panjang;}
    public void setLebar (double lebar){this.lebar = lebar;}
    public void setTinggi (double tinggi){this.tinggi = tinggi;}
    // Deklarasi Getter
    public double getPanjang(){return panjang;}
    public double getLebar(){return lebar;}
    public double getTinggi(){return tinggi;}
    public double getVolume(){return panjang * lebar * tinggi;}
    public static void main (String[] args){
        double volume;
        Balok b1 = new Balok();
        b1.panjang = 7;
        b1.lebar = 4;
        b1. tinggi = 5;
        volume = b1.panjang * b1.lebar * b1.tinggi;
        System.out.println("Volume Balok = " +volume+ "Cm^3");
        
    }
}
