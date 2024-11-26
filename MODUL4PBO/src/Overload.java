public class Overload {
    public static void main (String[] args){
        System.out.println("Konstruktor 1");
        System.out.println("========================================");
        Laptop sa = new Laptop("MSI Modern 14");
        sa.tampil();
        System.out.println("Konstruktor 2");
        System.out.println("========================================");
        Laptop du = new Laptop("Acer Aspire Vero", 16);
        du.tampil();
        System.out.println("Konstruktor 3");
        System.out.println("========================================");
        Laptop ti = new Laptop("Axioo Pongo 725", 16, 1024);
        ti.tampil();
    }
}
