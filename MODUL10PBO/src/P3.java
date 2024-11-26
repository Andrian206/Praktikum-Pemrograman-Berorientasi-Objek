import javax.swing.*;
class P3 extends JFrame {
    public P3(String title){
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(300, 150);
       setLocation(200, 150);
       setVisible(true);
       setTitle(title);
    } 
    public static void main (String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new P2 ("Window Utama");
    }
}
    

