public class Penghasilan {
    public static void main (String[] args){
        double PenghasilanBersih;
        Uang b1 = new Uang();
        b1.penghsln = 4500000;
        b1.penglrn = 3000000;
        PenghasilanBersih = b1.penghsln - b1.penglrn;
        System.out.println("Penghasilan Bersih : Rp. " +PenghasilanBersih);
    }
}
