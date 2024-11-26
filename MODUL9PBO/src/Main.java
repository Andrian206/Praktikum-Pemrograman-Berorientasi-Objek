import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException{
        char inputChar;
        System.out.print("Masukan Sembarang Karakter : " );
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        inputChar = (char)bufferedReader.read();
        System.out.println("Karakter Yang Diinputkan : " + inputChar);
    }
}
