@interface MyAnno 
{
        //user defined Annotation
        //empty annotations can be used anywhere
}
@MyAnno
public class AnnotationsE {
    @MyAnno
    public static void main(@MyAnno String[] args) {
        @MyAnno
        int  x;
    }
}
