import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("file.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
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
