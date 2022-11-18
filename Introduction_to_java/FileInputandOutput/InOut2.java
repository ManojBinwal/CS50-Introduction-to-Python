import java.io.*;
public class InOut2{
public static void main(String[] args) {
    try {
        FileOutputStream fos = new FileOutputStream("file.txt");
        String str = "Learn Java Programming";
        byte b[] = str.getBytes();
        for(byte x:b){
            fos.write(x);
        }
        fos.close();
    } catch (Exception e) {
        // TODO: handle exception
    }
      
    
}
}