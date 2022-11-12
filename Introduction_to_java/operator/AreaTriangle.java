import java.util.Scanner;
class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of triangle ");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float s = 0.5f * (a + b + c);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print(area);
        sc.close();
    }
}