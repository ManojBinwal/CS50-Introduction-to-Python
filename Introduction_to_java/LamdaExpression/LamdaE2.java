@FunctionalInterface
interface MyLambda{
    public void display(String str);
}

public class LamdaE2 {
    public static void main(String[] args) {
      MyLambda m = (s)->{System.out.println(s);};
                    //anonymous method acting as object
                    m.display("Ram LaL Banni"); 
    }
     
     }


