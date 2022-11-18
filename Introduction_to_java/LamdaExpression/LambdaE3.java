@FunctionalInterface
interface MyLambda
{
    public int add(int x, int y);
}

public class LambdaE3{
    public static void main(String[] args) {
        MyLambda m = (a,b)->a+b;
        System.out.println(m.add(20, 30));
    }
}