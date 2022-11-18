import java.io.*;
public class Inout{
public static void main(String[] args) {
    try {
        FileOutputStream fos = new FileOutputStream("file.txt");
        String str = "Learn Java Programming";
        fos.write(str.getBytes());
        fos.close();
    } catch (Exception e) {
        // TODO: handle exception
    }
      
    
}
}