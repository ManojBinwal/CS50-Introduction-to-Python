
package Introduction_to_java.Strings;
import java.util.Arrays;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Ma@no@j#KUma@R";
        str = str.replaceAll(("[^a-zA-Z]"),"");
        System.out.println(str);

        String str1 = "         abc     ddf    ffsf  fdsfsd   sf   ";
        str1 = str1.replaceAll(("\\s+")," ").trim();
        System.out.println(str1);

        String word[] = str1.split("\\s");
        System.out.println(Arrays.toString(word));
        System.out.println(word.length);
    }

}
