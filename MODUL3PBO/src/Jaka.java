import javax.swing.JOptionPane;
public class Jaka {
   public static void main (String[] args){
       String nama = JOptionPane.showInputDialog("Nama : ");
       Manusia andi = new Manusia(nama);
       System.out.println("Nama : "+andi.tampilkanNama());
       andi.makan();
   } 
}
