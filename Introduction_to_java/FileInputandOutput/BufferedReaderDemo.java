import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws Exception{
        FileReader fis = new FileReader("file.txt");
        BufferedReader bis = new BufferedReader(fis);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.mark(10);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());

    }
}