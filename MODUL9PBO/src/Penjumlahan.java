import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Program Penjumlahan 2 Bilangan
public class Penjumlahan {
    public static void main (String[] args) throws IOException{
        double bilangan1, bilangan2, hasil;
        String angka1, angka2;
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Masukkan Bilangan ke - 1    : ");
        angka1 = bufferedReader.readLine();
        bilangan1 = Double.parseDouble(angka1);
        System.out.print("Masukkan Bilangan ke - 2    : ");
        angka2 = bufferedReader.readLine();
        bilangan2 = Double.parseDouble(angka2);
        hasil = bilangan1 + bilangan2;
        System.out.println("========================================");
        System.out.println("Hasil                       : " + hasil);
        
    }
}
