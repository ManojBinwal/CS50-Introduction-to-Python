package Introduction_to_java.Generics;

public class GenericSkeleton {
    //Defining a genereic method to print any data type
    static <T> void genereicPrint(T t){
    /*static keyword to use it inside main. 
    <T> means that it is generic and can take any element
    void is the return type
    t is the variable of type generic  */
        System.out.println(t.getClass().getName() + ": " + t);

    }
    public static void main(String[] args) {
        GenericSkeleton aObj = new GenericSkeleton(); //creating an object of the class GenericSkeleton
        /*This is the non-parameterized object creation which means you can pass any type value.
         * In case it was GenericSkeleton aObj = new GenericSkeleton<Integer>(); then you can only pass
         * Integer type values.
         * The approach here is bottom-up i.e. genericmethod itself is empty and formless. When you pass
         *  any values that value is the form that the generic method takes.
         * if parameters is passed then then the generic method inherits that type and only those type of 
         * values can be passed.
         * 
         */
        aObj.genereicPrint(101); //calling genereic method with int argument
        aObj.genereicPrint("Joy with java"); //calling genereic method with String
        aObj.genereicPrint(3.134343); //calling genereic method with double
    }
}
