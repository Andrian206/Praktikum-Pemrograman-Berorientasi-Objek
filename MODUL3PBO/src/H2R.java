public class H2R {
   public static void main (String[] args){
       Motor mt = new Motor ("Kawasaki H2R");
       System.out.println("Motor : " +mt.tampilkanNama());
       System.out.print("Suara saat Berjalan : ");
       mt.Berjalan();
       System.out.print("Suara saat Klakson : ");
       mt.Klakson();
   } 
}
