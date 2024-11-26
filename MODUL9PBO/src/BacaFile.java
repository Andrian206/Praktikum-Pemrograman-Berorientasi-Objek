import java.io.*;

class BacaFile {
    public static void main(String[]args) throws IOException{
        String NamaFile = "PBO.txt";
        String NamaMhs, Jurusan, Angkatan;
        
        try{
            FileInputStream inFile = new FileInputStream(NamaFile);
            DataInputStream inStream = new DataInputStream (inFile);
            NamaMhs = inStream.readUTF();
            Jurusan = inStream.readUTF();
            Angkatan = inStream.readUTF();
            inStream.close();
            System.out.println("Nama : " + NamaMhs + "\nJurusan : " + Jurusan + "\nAngkatan : " + Angkatan);
        }
        
        catch(FileNotFoundException e){
            System.out.println("File : " + NamaFile + "Tidak Ada!\n");
        }
        catch(IOException ex){
            System.out.println("IOERROR : " +ex.getMessage() + "\n");
        }
    }
}