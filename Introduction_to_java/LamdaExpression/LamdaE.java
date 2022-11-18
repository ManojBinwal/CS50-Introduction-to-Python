@FunctionalInterface
interface MyLambda{
    public void display();
}
/* 
class My implements MyLambda{
    public void display()
    {
        System.out.println("Hello, World");
    }
}

 public static void main(String[] args) {
      MyLambda m = new MyLambda(){
        public void display(){
            System.out.println("Hello,World");
        }
                    //anonymous inner class
        };
        m.display();
     }
*/
public class LamdaE {
    public static void main(String[] args) {
      MyLambda m = 
            ()->{System.out.println("Hello,World");};
                    //anonymous method acting as object
                    m.display(); 
    }
     
     }


