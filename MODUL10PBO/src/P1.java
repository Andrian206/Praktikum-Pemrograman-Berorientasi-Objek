import javax.swing.*;
class P1 {
   public static void main (String[] args){
       JFrame.setDefaultLookAndFeelDecorated(true);
       JFrame windowku = new JFrame("Window Utama");
       windowku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       windowku.setSize(300, 150);
       windowku.setLocation(200, 150);
       windowku.setVisible(true);
   } 
}
