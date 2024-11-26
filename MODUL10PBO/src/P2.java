import javax.swing.*;
class P2 extends JFrame {
    public P2(String title){
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(300, 150);
       setLocation(200, 150);
       setVisible(true);
       setTitle(title);
    } 
}
class utama {
    public static void main (String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new P2 ("Window Utama");
    }
}