/*
 *      ax^2 + bx + c = 0
 *      (x+r1)(x+r2) = 0
 *      r1 = (-b + sqrt(b^2 - 4ac)) / 2a
 *      r2 = (-b - sqrt(b^2 - 4ac)) / 2a
 *
 */

import java.util.Scanner;

public class Rootofquadraticequation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a, b and c ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double z = (int) (Math.sqrt(b * b - 4 * a * c));
        double r1 = (b * -1 + z) / 2 * a;
        double r2 = (b * -1 - z) / 2 * a;

        System.out.println("r1: " + r1 + " r2: " + r2);
        sc.close();

    }

}
