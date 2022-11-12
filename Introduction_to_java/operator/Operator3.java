class Operator3 {
    public static void main(String[] args) {
        System.out.println(10+20/2);  // division first than addition
        System.out.println(10/2*5);   //division is first as it is on the left and have same precedence
        System.out.println(10/(2*5)); //first multiplication as bracket has more precedence
    }
}