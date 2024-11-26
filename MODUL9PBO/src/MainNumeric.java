import java.io. BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainNumeric {
    public static void main(String[]args) throws IOException{
        int inputNumber;
        String Temp;
        System.out.print("Masukan Angka : " );
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Temp = bufferedReader.readLine();
        inputNumber = Integer.parseInt(Temp);
        System.out.println("Angka Yang Dimasukan : " + inputNumber);
    }
    
}
