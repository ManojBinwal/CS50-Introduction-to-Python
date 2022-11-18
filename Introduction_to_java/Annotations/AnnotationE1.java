import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)   //defines where annotations will be used
//@Repeatable MyAnno.class              //for repeatable annotations
@interface MyAnno 
{
    String name()    default "BabuBhai";
    String project() default "this";
    String date()    default"today";
    String Version() default "10";
}

public class AnnotationE1 {
    @MyAnno(name = "Ajay")
    public static void main(String[] args) {
        int  x;
    }
}
