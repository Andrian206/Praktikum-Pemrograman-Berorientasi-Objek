import java.io. BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOReadString {
    public static void main(String[]args) throws IOException{
        String nameString;
        System.out.print("Masukan Nama Anda : " );
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        nameString = bufferedReader.readLine();
        System.out.println("Nama Anda : " +nameString );
    }
}
